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
        JoueurController controller = new JoueurController();
//        controller.afficheDetailsJoueur();
//        controller.creerJoueur();
        controller.renameJoueur();
        
//        TournoiController tournoiCtl = new TournoiController();
//        tournoiCtl.afficheDetailsTournoi();
//        tournoiCtl.creerTournoi();
    }
}

