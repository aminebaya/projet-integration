/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Edu.esprit.tests;

import Edu.esprit.DAO.OffreDAO;
import Edu.esprit.Entities.Offre;
import java.sql.Date;

/**
 *
 * @author Elyes
 */
public class TestCRUDOffre {
    public static void main(String[] args) {
        Date sqlDate=new Date(new java.util.Date().getTime());
        Offre off=new Offre("Sandwich", true, (float) 100.2, sqlDate, "Microsoft");
        OffreDAO.addOffre(off);
    }
}
