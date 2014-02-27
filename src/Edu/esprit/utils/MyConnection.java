/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.utils;

/**
 *
 * @author NADER
 */



import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection { //la meme classe on va la rendre singleton
    private static final  String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/baya";
    private static String login="root";
    private static String pwd="esprit";
   
    public static Connection connection;
    private static MyConnection instance;
    
    MyConnection con;
public static Statement st;
public static ResultSet rs;
static MyConnection  CON;
    

    public MyConnection(){
        try {
            try {
                //charger le pilote mysql en memoire
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("load driver OK");
                //tester la connexion
                connection = DriverManager.getConnection(url, login, pwd);
                System.out.println("connect to database OK");


            } catch (ClassNotFoundException ex) {
                System.out.println("load driver FAIL");
                Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection conn = DriverManager.getConnection(url, login, pwd);
        } catch (SQLException ex) {
            System.out.println("connect to database FAIL");
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static MyConnection getInstance() {
        if(instance==null)
        {
            instance=new MyConnection();
        }
       
        return instance;
    }

    public PreparedStatement prepareStatement(String requete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
