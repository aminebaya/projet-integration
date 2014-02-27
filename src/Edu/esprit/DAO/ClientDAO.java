/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.DAO;

import Edu.esprit.Entities.Client;
import Edu.esprit.Entities.Objet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Edu.esprit.utils.CRUDE;
/**
 *
 * @author NADER
 */
public class ClientDAO {

      CRUDE crude = new CRUDE();
      
public boolean Supprimer(int id ){

String req  = "DELETE FROM Client WHERE id ='" +id+"'";
return (crude.exeDelete(req));
}



 public List<Client> Lister() {
        String req = "SELECT * FROM Client";
        ResultSet res = crude.exeRead(req);
        List<Client> list = new ArrayList<Client>();
        try {
            while (res.next()) {
                Client en = new Client();
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
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    

    public void Ajouter(Objet cl) {
       
    }
    
    
}
      

   
    
    
    
    
