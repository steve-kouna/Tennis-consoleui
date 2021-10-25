package com.koona.tennis.controller;

import com.koona.tennis.core.dto.EpreuveFullDto;
import com.koona.tennis.core.dto.EpreuveLightDto;
import com.koona.tennis.core.dto.JoueurDto;
import com.koona.tennis.core.entity.Epreuve;
import com.koona.tennis.core.entity.Tournoi;
import com.koona.tennis.core.service.EpreuveService;
import com.koona.tennis.core.service.TournoiService;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Steve KOUNA
 */
public class EpreuveController {
    private EpreuveService epreuveService;

    public EpreuveController() {
        this.epreuveService = new EpreuveService();
    }
    
    public void afficheDetailsEpreuve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'epreuve ? ");
        long id = scanner.nextLong();
        
        Epreuve epreuve = epreuveService.getEpreuve(id);
        System.out.println("l'epreuve en question est : " + epreuve.getAnnee() + " du tournoi : " + epreuve.getTournoi().getNom());
    }
    
    
    public void afficheDerniereEpreuve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'epreuve ? ");
        long id = scanner.nextLong();
        
        EpreuveFullDto epreuve = epreuveService.getEpreuveAvecTournoi(id);
        System.out.println("Le nom du tournoi : " + epreuve.getTournoi().getNom());
        
    }
    
    
    public void afficheRolandGarros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'epreuve ? ");
        long id = scanner.nextLong();
        
        EpreuveLightDto epreuve = epreuveService.getEpreuveSansTournoi(id);
    }
    
    public void afficheDerniereEpreuveFull() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'epreuve ? ");
        long id = scanner.nextLong();
        
        EpreuveFullDto epreuve = epreuveService.getEpreuveAvecTournoiFull(id);
        System.out.println("Le nom du tournoi : " + epreuve.getTournoi().getNom());
        
        System.out.println("les participants : ");
        for (JoueurDto joueurDto : epreuve.getParticipants()) {
            System.out.println(joueurDto.getPrenom() + " " + joueurDto.getNom());
        }
    }

    
    public void afficheListEpreuve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le code : ");
        String code  = scanner.nextLine();
        System.out.println("Liste des epreuves :");
        List<EpreuveFullDto> epreuves =  epreuveService.getAll(code);
        
        for (EpreuveFullDto epreuveFullDto: epreuves){
            System.out.println("Type d'epreuve : " + 
                    epreuveFullDto.getTypeEpreuve() + " -> " +
                    epreuveFullDto.getTournoi().getNom() + " annee " + 
                    epreuveFullDto.getAnnee()
            );
        }
    }
    
}
