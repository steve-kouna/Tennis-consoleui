/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.tennis.controller;

import com.koona.tennis.core.dto.MatchTennisDto;
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
        System.out.println("le nom du vainqueur de Roland Garros en 2015 est : " + 
                matchTennisDto.getVainqueur().getPrenom() + " " + matchTennisDto.getVainqueur().getNom());
        System.out.println("le nom du finaliste de Roland Garros en 2015 est : " + 
                matchTennisDto.getFinaliste().getPrenom() + " " + matchTennisDto.getFinaliste().getNom());
    }
}
