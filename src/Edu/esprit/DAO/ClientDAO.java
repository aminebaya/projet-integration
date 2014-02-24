package Edu.esprit.DAO;

import Edu.esprit.Entities.Client;
import Edu.esprit.utils.CRUDE;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientDAO {

    CRUDE crude = new CRUDE();
     
    public boolean Ajouter(Client cl){

        String req =
                cl.getetat()+"INSERT INTO Client (nom, prenom, adresse,email,etat) VALUES "
                + "('" + cl.getNom() +"','" + cl.getPrenom()+"','" + cl.getAdresse()+"','"+ cl.getEmail()+ "')'";
        
        
        System.out.println(req);
       
        
        return  crude.exeCreate(req);
    }



    public boolean Supprimer(String Nom) {

        String req = "DELETE FROM Client WHERE Nom ='" + Nom + "'";
        return crude.exeDelete(req);
    }

    public List<Client> Lister() {
        String req = "SELECT * FROM Client";
        ResultSet res = crude.exeRead(req);
        List<Client> list = new ArrayList<Client>();
        try {
            while (res.next()) {
                Client cl = new Client();

                cl.setNom(res.getString(3));
                cl.setPrenom(res.getString(4));
                cl.setAdresse(res.getString(5));
                cl.setPassword(res.getString(6));

                list.add(cl);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


    }

