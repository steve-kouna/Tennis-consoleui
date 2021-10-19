/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.tennis;


import com.koona.tennis.controller.JoueurController;
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
        
        TournoiController tournoiCtl = new TournoiController();
//        tournoiCtl.afficheDetailsTournoi();
//        tournoiCtl.creerTournoi();
        tournoiCtl.deleteTournoi();
    }
}

