/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Edu.esprit.tests;

import Edu.esprit.DAO.AdmineDAO;
import Edu.esprit.Entities.Administrateur;

/**
 *
 * @author Touch media
 */
public class TestFindLoginAdmin {
    
    public static void main(String[] args) {
        
        AdmineDAO adminDAO = new AdmineDAO();
        System.out.println(adminDAO.findAdminByLogin("Elyes"));
    }
}
