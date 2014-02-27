/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.Entities;

/**
 *
 * @author baya
 */
public class Objet {

    String login;
    String password;
    String nom;
    String prenom;
    String adresse;
    String email;
  
  

    public Objet(String login, String password, String nom, String prenom, String adresse, String email) {

        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email=email;
   

    }

    public Objet() {
        
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

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    
   

    
}
