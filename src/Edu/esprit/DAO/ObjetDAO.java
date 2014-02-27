/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.DAO;

;

/**
 *
 * @author NADER
 */

import Edu.esprit.Entities.Objet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Edu.esprit.utils.CRUDE;
import Edu.esprit.Entities.Client;



public class ObjetDAO {

    CRUDE crude = new CRUDE();

    public boolean Ajouter(Objet e) {

        String req
                = "INSERT INTO Client (login,password,nom, prenom,adresse,email) VALUES "
                + "('" + e.getlogin() + "','" + e.getpassword() + "','"+e.getnom()+"','"+e.getprenom()+"','" + e.getadresse() + "','" + e.getemail() + 
                 "')";

        System.out.println(req);

        return crude.exeCreate(req);
    }

    public boolean ModifierObjet(Objet e, int id) {

        String req = "UPDATE Client SET login='" + e.getlogin() + "',password='" + e.getpassword()
                + "',nom='" + e.getnom() + "',prenom='" + e.getprenom()
                + "',adresse='" + e.getadresse() + "',email='" + e.getemail()
                +  "'WHERE id =" + id;
        return crude.exeUpdate(req);

    }

    public boolean Supprimer(String email) {

        String req = "DELETE FROM Client WHERE email ='" + email + "'";
        return crude.exeDelete(req);

    }
    

    public List<Objet> Lister() {
        String req = "SELECT * FROM Client";
        ResultSet res = crude.exeRead(req);
        List<Objet> list = new ArrayList<Objet>();
        try {
            while (res.next()) {
                Objet en = new Objet();
                en.setlogin(res.getString(1));
                en.setpassword(res.getString(2));
                en.setnom(res.getString(3));
                en.setprenom(res.getString(4));

                en.setadresse(res.getString(5));

                en.setemail(res.getString(6));
                list.add(en);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        public List<Objet> rechercher() {
        String req = "SELECT * FROM Client";
        ResultSet res = crude.exeRead(req);
        List<Objet> list = new ArrayList<Objet>();
        try {
            while (res.next()) {
                Objet en = new Objet();
                en.setlogin(res.getString(1));
                en.setpassword(res.getString(2));
                en.setnom(res.getString(3));
                en.setprenom(res.getString(4));

                en.setadresse(res.getString(5));

                en.setemail(res.getString(6));
                list.add(en);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Client> rechercher(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//    public List<Objet> ListerAnimations() {
//
//        String req = "SELECT * FROM Client WHERE type LIKE 'animation' ";
//        ResultSet res = crude.exeRead(req);
//        List<Objet> list = new ArrayList<Objet>();
//        try {
//            while (res.next()) {
//                Objet en = new Objet();
//                en.setlogin(res.getString(1));
//                en.setpassword(res.getString(2));
//                en.setnom(res.getString(3));
//                en.setprenom(res.getString(4));
//
//                en.setadresse(res.getString(5));
//
//                en.setemail(res.getString(6));
//                list.add(en);
//            }
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
//    public List<Objet> ListerSalles() {
//
//        String req = "SELECT * FROM Client WHERE type LIKE 'Salle' ";
//        ResultSet res = crude.exeRead(req);
//        List<Objet> list = new ArrayList<Objet>();
//        try {
//            while (res.next()) {
//                Objet en = new Objet();
//                en.setlogin(res.getString(1));
//                en.setpassword(res.getString(2));
//                en.setnom(res.getString(3));
//                en.setprenom(res.getString(4));
//
//                en.setadresse(res.getString(5));
//
//                en.setemail(res.getString(6));
//                list.add(en);
//            }
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
//    public List<Objet> ListerGastronomies() {
//
//        String req = "SELECT * FROM Client WHERE type LIKE 'Gastronomie' ";
//        ResultSet res = crude.exeRead(req);
//        List<Objet> list = new ArrayList<Objet>();
//        try {
//            while (res.next()) {
//                Objet en = new Objet();
//                en.setlogin(res.getString(1));
//                en.setpassword(res.getString(2));
//                en.setnom(res.getString(3));
//                en.setprenom(res.getString(4));
//
//                en.setadresse(res.getString(5));
//
//                en.setemail(res.getString(6));
//                list.add(en);
//            }
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
//    public List<Objet> ListerVoyages() {
//
//        String req = "SELECT * FROM Client WHERE type LIKE 'Voyages' ";
//        ResultSet res = crude.exeRead(req);
//        List<Objet> list = new ArrayList<Objet>();
//        try {
//            while (res.next()) {
//                Objet en = new Objet();
//                en.setlogin(res.getString(1));
//                en.setpassword(res.getString(2));
//                en.setnom(res.getString(3));
//                en.setprenom(res.getString(4));
//
//                en.setadresse(res.getString(5));
//
//                en.setemail(res.getString(6));
//                list.add(en);
//            }
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
//    public List<Objet> ListerPhotographes() {
//
//        String req = "SELECT * FROM Client WHERE type LIKE 'Photographe' ";
//        ResultSet res = crude.exeRead(req);
//        List<Objet> list = new ArrayList<Objet>();
//        try {
//            while (res.next()) {
//                Objet en = new Objet();
//                en.setlogin(res.getString(1));
//                en.setpassword(res.getString(2));
//                en.setnom(res.getString(3));
//                en.setprenom(res.getString(4));
//
//                en.setadresse(res.getString(5));
//
//                en.setemail(res.getString(6));
//                list.add(en);
//            }
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
//    public List<Objet> ListerBeautes() {
//
//        String req = "SELECT * FROM Client WHERE type LIKE 'Beaute' ";
//        ResultSet res = crude.exeRead(req);
//        List<Objet> list = new ArrayList<Objet>();
//        try {
//            while (res.next()) {
//                Objet en = new Objet();
//                en.setlogin(res.getString(1));
//                en.setpassword(res.getString(2));
//                en.setnom(res.getString(3));
//                en.setprenom(res.getString(4));
//
//                en.setadresse(res.getString(5));
//
//                en.setemail(res.getString(6));
//                list.add(en);
//            }
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
//    public List<Objet> ListerMaisons() {
//
//        String req = "SELECT * FROM Client WHERE type LIKE 'maison' ";
//        ResultSet res = crude.exeRead(req);
//        List<Objet> list = new ArrayList<Objet>();
//        try {
//            while (res.next()) {
//                Objet en = new Objet();
//                en.setlogin(res.getString(1));
//                en.setpassword(res.getString(2));
//                en.setnom(res.getString(3));
//                en.setprenom(res.getString(4));
//
//                en.setadresse(res.getString(5));
//
//                en.setemail(res.getString(6));
//                list.add(en);
//            }
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
//    public List<Objet> Recherche(String nom) {
//        String req = "SELECT * FROM Client WHERE nom ='" + nom + "'";
//        ResultSet res = crude.exeRead(req);
//        List<Objet> list = new ArrayList<Objet>();
//        try {
//            while (res.next()) {
//                Objet en = new Objet();
//                en.setlogin(res.getString(1));
//                en.setpassword(res.getString(2));
//                en.setnom(res.getString(3));
//                en.setprenom(res.getString(4));
//
//                en.setadresse(res.getString(5));
//
//                en.setemail(res.getString(6));
//                list.add(en);
//            }
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
//    public boolean OffreExisteOrNot1(int m) {
//        String req = "SELECT * FROM Client WHERE id ='" + m + "'";
//        ResultSet res = crude.exeRead(req);
//        boolean trouve = false;
//        try {
//            while (res.next()) {
//                trouve = true;
//            }
//            return trouve;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
//
//    public boolean OffreExisteOrNot2(String nom) {
//        String req = "SELECT * FROM Client WHERE nom ='" + nom + "'";
//        ResultSet res = crude.exeRead(req);
//        boolean trouve = false;
//        try {
//            while (res.next()) {
//                trouve = true;
//            }
//            return trouve;
//        } catch (SQLException ex) {
//            Logger.getLogger(ObjetDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
//
//}
