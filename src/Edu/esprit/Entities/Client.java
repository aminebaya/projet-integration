package Edu.esprit.Entities;

import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

public class Client extends User {

    private String login;
    private String password;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private int id; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    

    public String getlogin() {
        return login;
    }

    public String getpassword() {
        return password;
    }

    public String getnom() {
        return nom;
    }

    public String getprenom() {
        return prenom;
    }

    public String getadresse() {
        return adresse;
    }

    public String getemail() {
        return email;
    }

   

    public void setlogin(String login) {
        this.login = login;
    }

    public void setpassword(String password) {
        this.password = password;

    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public void setadresse(String adresse) {
        this.adresse = adresse;
    }

   

    public void setemail(String Email) {
        this.email = email;
    }

   
}
