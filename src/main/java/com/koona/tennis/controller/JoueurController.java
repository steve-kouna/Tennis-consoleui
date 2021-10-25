package com.koona.tennis.controller;

import com.koona.tennis.core.dto.JoueurDto;
import com.koona.tennis.core.entity.Joueur;
import com.koona.tennis.core.service.JoueurService;
import java.util.Scanner;

/**
 *
 * @author Steve KOUNA
 */
public class JoueurController {
    
    private JoueurService joueurService;

    public JoueurController() {
        this.joueurService = new JoueurService();
    }
    
    
    public void afficheDetailsJoueur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du joueur ? ");
        long id = scanner.nextLong();
        Joueur joueur = joueurService.getJoueur(id);
        System.out.println("Le joueur selectionne est : " + joueur.getPrenom() + " " + joueur.getNom());
    }
    
    public void creerJoueur() {
        Joueur joueur = new Joueur();
        System.out.println("----- > Creation d'un nouveau joueur <-----");
        Scanner scanNom = new Scanner(System.in);
        Scanner scanPrenom = new Scanner(System.in);
        Scanner scanSexe = new Scanner(System.in);

        System.out.println("Entrez le nom : ");
        String nom  = scanNom.nextLine();
        joueur.setNom(nom);
        System.out.println("Entrez le prenom : ");
        String prenom  = scanPrenom.nextLine();
        joueur.setPrenom(prenom);
        System.out.println("Entrez le sexe : ");
        String sex  = scanSexe.nextLine();
        joueur.setSexe(sex.charAt(0));
        
        joueurService.createJoueur(joueur);
        
        System.out.println("Le joueur : " + joueur.getPrenom() + " " + joueur.getNom() + " a ete cree");
    }
    
    public void renameJoueur() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanNom = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du joueur que vous voulez modifier le nom ? ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Entrez le nom : ");
        String nom  = scanNom.nextLine();
        joueurService.rename(id, nom);
    }
    
    public void changeSexeJoueur() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanSexe = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du joueur que vous voulez modifier le sexe ? ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Entrez le sexe : ");
        char sexe  = scanSexe.nextLine().charAt(0);
        joueurService.changeSexe(id, sexe);
    }
    
    public void deleteJoueur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du joueur que vous voulez supprimer ? ");
        long id = scanner.nextLong();
        joueurService.deleteJoueur(id);
        System.out.println("joueur supprime");
    }
    
    public void afficheListJoueur() {
        System.out.println("Liste des joueurs :");
        for (JoueurDto joueurDto: joueurService.getAll()){
            System.out.println(joueurDto.getPrenom() + " " + joueurDto.getNom());
        }
    }

}
