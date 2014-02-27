/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.utils;

import Edu.esprit.utils.MyConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CRUDE {
    /**
     * récupération de l'instance de la classe MyConnection.
     * on rappelle que l'acces à une méthode statique se fait par le nom de la classe.
     * ici la variable mc contient l'objet de Connexion (Grace au constructeur)
     * Grace à mc maintenant on peut accéder à toutes les ressources de la classe MyConnection
     */
    MyConnection mc = MyConnection.getInstance();

    public boolean exeUpdate(String sql){
        try {
            //getConnection renvoie la variable connexion qui a été initialisé précédemment dans le constructeur : MyConnection.getInstance();
            Statement statement = mc.getConnection().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CRUDE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean exeCreate(String sql){
        try {
            //Statement st = connection.createStatement();
            Statement statement =mc.getConnection().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CRUDE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public ResultSet exeRead(String sql){
        try {
            Statement s = mc.getConnection().createStatement();
            ResultSet rs = s.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUDE.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean exeDelete(String sql){
        try { 
            Statement s = mc.getConnection().createStatement();
            s.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CRUDE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
