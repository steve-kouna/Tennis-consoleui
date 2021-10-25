package com.koona.tennis.controller;

import com.koona.tennis.core.dto.TournoiDto;
import com.koona.tennis.core.entity.Tournoi;
import com.koona.tennis.core.service.TournoiService;
import java.util.Scanner;

/**
 *
 * @author Steve KOUNA
 */
public class TournoiController {
    private TournoiService tournoiService;

    public TournoiController() {
        this.tournoiService = new TournoiService();
    }
    
    
    public void afficheDetailsTournoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du tournoi ? ");
        long id = scanner.nextLong();
        
        TournoiDto tournoi = tournoiService.getTournoi(id);
        System.out.println("le en question est : " + tournoi.getNom());
    }
    
    public void creerTournoi() {
        TournoiDto tournoi = new TournoiDto();
        System.out.println("----- > Creation d'un nouveau Tournoi <-----");
        Scanner scanNom = new Scanner(System.in);
        Scanner scanCode = new Scanner(System.in);

        System.out.println("Entrez le nom : ");
        String nom  = scanNom.nextLine();
        tournoi.setNom(nom);
        System.out.println("Entrez le code : ");
        String code  = scanCode.nextLine();
        tournoi.setCode(code);
        
        tournoiService.createTournoi(tournoi);
        
        System.out.println("Le tournoi : " + tournoi.getNom()+ " a pour ID -> " + tournoi.getId() + " a ete cree");
    }
    
    
    public void deleteTournoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du tournoi que vous voulez supprimer ? ");
        long id = scanner.nextLong();
        tournoiService.deleteTournoi(id);
    }
}
