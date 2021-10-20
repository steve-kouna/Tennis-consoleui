/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.tennis.controller;

import com.koona.tennis.core.entity.ScoreVainqueur;
import com.koona.tennis.core.service.ScoreVainqueurService;
import java.util.Scanner;

/**
 *
 * @author Steve KOUNA
 */
public class ScoreVainqueurController {
    
    private ScoreVainqueurService scoreVainqueurService;

    public ScoreVainqueurController() {
        this.scoreVainqueurService = new ScoreVainqueurService();
    }
    
    
    
    public void afficheDetailsScore(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du match ? ");
        long id = scanner.nextLong();
        ScoreVainqueur scoreVainqueur = scoreVainqueurService.getScore(id);
        System.out.println("Le score selectionne est : " +
                scoreVainqueur.getSet1() + ", " + 
                scoreVainqueur.getSet2() + ", " + 
                scoreVainqueur.getSet3() + ", " + 
                scoreVainqueur.getSet4() + ", " + 
                scoreVainqueur.getSet5()
        );
    }
}
