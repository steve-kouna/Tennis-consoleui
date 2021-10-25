/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.tennis;


import com.koona.tennis.controller.EpreuveController;
import com.koona.tennis.controller.JoueurController;
import com.koona.tennis.controller.MatchTennisController;
import com.koona.tennis.controller.ScoreVainqueurController;
import com.koona.tennis.controller.TournoiController;

/**
 *
 * @author Steve KOUNA
 */
public class Main {
    public static void main(String[] args) {
//        JoueurController joueurController = new JoueurController();
//        joueurController.afficheDetailsJoueur();
//        joueurController.creerJoueur();
//        joueurController.renameJoueur();
//            joueurController.changeSexeJoueur();
//            joueurController.deleteJoueur();
//        joueurController.afficheListJoueur();
        
        TournoiController tournoiCtl = new TournoiController();
//        tournoiCtl.afficheDetailsTournoi();
//        tournoiCtl.creerTournoi();
        tournoiCtl.deleteTournoi();
//        ScoreVainqueurController scoreVainqueurController = new ScoreVainqueurController();
//        scoreVainqueurController.afficheDetailsScore();
//
//        EpreuveController epreuveController = new EpreuveController();
//        epreuveController.afficheListEpreuve();

//        MatchTennisController matchTennisController = new  MatchTennisController();
//        matchTennisController.afficheDetailsMatch();
//        matchTennisController.tapisVert();
//        matchTennisController.afficheDetailsMatch();
//        matchTennisController.delete();
    }
}

