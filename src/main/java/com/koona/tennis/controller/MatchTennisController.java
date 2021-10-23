/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.tennis.controller;

import com.koona.tennis.core.dto.EpreuveFullDto;
import com.koona.tennis.core.dto.JoueurDto;
import com.koona.tennis.core.dto.MatchTennisDto;
import com.koona.tennis.core.dto.ScoreVainqueurFullDto;
import com.koona.tennis.core.service.MatchService;
import com.koona.tennis.core.service.TournoiService;
import java.util.Scanner;

/**
 *
 * @author Steve KOUNA
 */
public class MatchTennisController {
    private MatchService matchService;

    public MatchTennisController() {
        this.matchService = new MatchService();
    }
    
    
    public void afficheDetailsMatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du match ? ");
        long id = scanner.nextLong();
        
        MatchTennisDto matchTennisDto = matchService.getMatch(id);
        System.out.println("c'est le match de l'annee : " + matchTennisDto.getEpreuve().getAnnee() + " au tournoi de :" +
                matchTennisDto.getEpreuve().getTournoi().getNom());
        System.out.println("le nom du vainqueur de Roland Garros en 2015 est : " + 
                matchTennisDto.getVainqueur().getPrenom() + " " + matchTennisDto.getVainqueur().getNom());
        System.out.println("le nom du finaliste de Roland Garros en 2015 est : " + 
                matchTennisDto.getFinaliste().getPrenom() + " " + matchTennisDto.getFinaliste().getNom());
        System.out.println("le score est : " + 
                matchTennisDto.getScore().getSet1()
                + ", " + matchTennisDto.getScore().getSet1()
                + ", " + matchTennisDto.getScore().getSet2()
                + ", " + matchTennisDto.getScore().getSet3()
                + ", " + matchTennisDto.getScore().getSet4()
                + ", " + matchTennisDto.getScore().getSet5()
        );
    }
    
    public void tapisVert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du match a modifie ? ");
        long id = scanner.nextLong();
        
        matchService.tapisVert(id);
    }
    
    
    public void ajouterMatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'epreuve ? ");
        long idEpreuve = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Quel est l'identifiant du vainqueur ? ");
        long idVainqueur = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Quel est l'identifiant du finaliste ? ");
        long idFinaliste = scanner.nextLong();
        scanner.nextLine();
        
        MatchTennisDto matchTennisDto = new MatchTennisDto();
        matchTennisDto.setEpreuve(new EpreuveFullDto());
        matchTennisDto.getEpreuve().setId(idEpreuve);
        matchTennisDto.setFinaliste(new JoueurDto());
        matchTennisDto.getFinaliste().setId(idFinaliste);
        matchTennisDto.setVainqueur(new JoueurDto());
        matchTennisDto.getVainqueur().setId(idVainqueur);
        
        System.out.println("Quel est le score du set1 : ");
        byte set1 = scanner.nextByte();
        scanner.nextLine();
        
        System.out.println("Quel est le score du set2 : ");
        byte set2 = scanner.nextByte();
        scanner.nextLine();
        
        System.out.println("Quel est le score du set3 : ");
        byte set3 = scanner.nextByte();
        scanner.nextLine();
        
        System.out.println("Quel est le score du set4 : ");
        byte set4 = scanner.nextByte();
        scanner.nextLine();
        
        System.out.println("Quel est le score du set5 : ");
        byte set5 = scanner.nextByte();
        scanner.nextLine();
        
        ScoreVainqueurFullDto scoreVainqueurFullDto = new ScoreVainqueurFullDto();
        scoreVainqueurFullDto.setSet1(set1);
        scoreVainqueurFullDto.setSet1(set2);
        scoreVainqueurFullDto.setSet1(set3);
        scoreVainqueurFullDto.setSet1(set4);
        scoreVainqueurFullDto.setSet1(set5);
        
        matchTennisDto.setScore(scoreVainqueurFullDto);
        
        matchService.create(matchTennisDto);
    }
    
    public void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du match a supprime ? ");
        long id = scanner.nextLong();
        
        matchService.delete(id);
    }
}
