/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.GUI;

import Edu.esprit.DAO.ClientDAO;
import Edu.esprit.DAO.ObjetDAO;
import Edu.esprit.Entities.Client;
import Edu.esprit.Entities.Objet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author baya
 */
public class GestionClient extends javax.swing.JFrame {

    List<Client> cle = new ArrayList<Client>();

    ObjetDAO obDAO = new ObjetDAO();
    ObjetDAO suppDAO = new ObjetDAO();

    /**
     * Creates new form GestionClient
     */
    public GestionClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_login = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        lbl_Password = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        lbl_nom = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        lbl_prenom = new javax.swing.JLabel();
        txt_prenom = new javax.swing.JTextField();
        lbl_adresse = new javax.swing.JLabel();
        txt_adresse = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        btn_ajouter = new javax.swing.JButton();
        btn_supprimer = new javax.swing.JButton();
        btn_Acceuil = new javax.swing.JButton();
        lbl_modifier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lbl_login.setText("Login");

        txt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loginActionPerformed(evt);
            }
        });

        lbl_Password.setText("Password");

        lbl_nom.setText("Nom");

        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });

        lbl_prenom.setText("Prenom");

        lbl_adresse.setText("Adresse");

        lbl_email.setText("Email");

        btn_ajouter.setText("Ajouter");
        btn_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouterActionPerformed(evt);
            }
        });

        btn_supprimer.setText("Supprimer");
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });

        btn_Acceuil.setText("Page Acceuil");
        btn_Acceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AcceuilActionPerformed(evt);
            }
        });

        lbl_modifier.setText("Modifier");
        lbl_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_modifierActionPerformed(evt);
            }
        });

        jTable1.setModel(new ClientTableModel()

        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(lbl_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_prenom)
                        .addComponent(lbl_adresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ajouter))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbl_modifier)
                        .addGap(45, 45, 45)
                        .addComponent(btn_supprimer)
                        .addGap(68, 68, 68)
                        .addComponent(btn_Acceuil))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(txt_login, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_prenom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_adresse, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nom)
                            .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_prenom)
                            .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_adresse)
                            .addComponent(lbl_adresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ajouter)
                    .addComponent(btn_supprimer)
                    .addComponent(btn_Acceuil)
                    .addComponent(lbl_modifier))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4171, 4171, 4171)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loginActionPerformed

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed

    private void btn_AcceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AcceuilActionPerformed
        new Acceuil().setVisible(true);
    }//GEN-LAST:event_btn_AcceuilActionPerformed

    private void btn_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouterActionPerformed
        Objet cl = new Objet();
        if (txt_login.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entrez votre login !!", "Erreur", JOptionPane.WARNING_MESSAGE);
        } else if (txt_password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entrez votre mot de passe", "Erreur", JOptionPane.WARNING_MESSAGE);
        } else if (txt_nom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entrer votre nom", "Erreur", JOptionPane.WARNING_MESSAGE);
        } else if (txt_prenom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entrez votre prenom!!", "Erreur", JOptionPane.WARNING_MESSAGE);
        } else if (txt_adresse.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entrez l'adresse !!", "Erreur", JOptionPane.WARNING_MESSAGE);
        } else if (txt_email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entrez votre email !!", "Erreur", JOptionPane.WARNING_MESSAGE);
        } else {
            cl.setlogin(txt_login.getText());
            cl.setpassword(txt_password.getText());
            cl.setnom(txt_nom.getText());
            cl.setprenom(txt_prenom.getText());
            cl.setadresse(txt_adresse.getText());
            cl.setemail(txt_email.getText());

            obDAO.Ajouter(cl);
            JOptionPane.showMessageDialog(null, "Ajout avec succée", "Notice", JOptionPane.INFORMATION_MESSAGE);
            jTable1.setModel(new ClientTableModel());
        }
    }//GEN-LAST:event_btn_ajouterActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        //obDAO.Supprimer(1);
        //JOptionPane.showMessageDialog(null, "client supprimé", "Notice", JOptionPane.INFORMATION_MESSAGE);
        String email = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        cle = suppDAO.rechercher(email);
        Client str=new Client();
        for(Client a:cle){
            suppDAO.Supprimer(jTable1.getSelectedRow().);
            
            
        }
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void lbl_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_modifierActionPerformed
        obDAO.ModifierObjet(null, 1);
        JOptionPane.showMessageDialog(null, "client modifié", "Notice", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lbl_modifierActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Acceuil;
    private javax.swing.JButton btn_ajouter;
    private javax.swing.JButton btn_supprimer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_adresse;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JButton lbl_modifier;
    private javax.swing.JLabel lbl_nom;
    private javax.swing.JLabel lbl_prenom;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_prenom;
    // End of variables declaration//GEN-END:variables
}
