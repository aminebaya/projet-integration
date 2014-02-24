

package Edu.esprit.Entities;

import java.util.Date;
import java.util.List;


public class Client extends User{
    public char etat;
    private Date dateInscrit;
    private List<Offre>panier;
    
    public Date getDateInscrit() {
        return dateInscrit;
    }

    public void setDateInscrit(Date dateInscrit) {
        this.dateInscrit = dateInscrit;
    }

    public Client(Date dateInscrit, String login, String password, String nom, String prenom, String adresse, String email) {
        super(login, password, nom, prenom, adresse, email);
        this.dateInscrit = dateInscrit;
    }

    public Client(Date dateInscrit, String login, String password, String email) {
        super(login, password, email);
        this.dateInscrit = dateInscrit;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Info Client :\nLogin : "+getLogin()+"\nPassword : "+getPassword()+"\nE-mail : "+getEmail()
                +"\n\nInfo Personnel :\nNom & Prenom "+getNom()+" "+getPrenom()+"\nAdresse : "+getAdresse()
                +"\nDate d'Inscription : "+getDateInscrit();
    }

    public String getetat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
