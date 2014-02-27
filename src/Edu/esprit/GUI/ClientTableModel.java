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
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author baya
 */



public class ClientTableModel extends AbstractTableModel{
	String[] entete={"login","password","nom","prenom","adresse","email"};
        ObjetDAO clDAO=new ObjetDAO();
    List <Objet> lignes=new ArrayList<Objet>();
    public ClientTableModel(){
        lignes=clDAO.Lister();   
    }
    
    
   
 




public ClientTableModel(Objet objet) {
		super();
		this.lignes.add(0,objet);
	}




@Override
public String getColumnName(int column) {
	return entete[column];
	}
	@Override
	public int getRowCount() {
		return lignes.size();
	}

	@Override
	public int getColumnCount() {
		return entete.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
        
          
            case 0: return lignes.get(rowIndex).getlogin();
            case 1: return lignes.get(rowIndex).getpassword();
            case 2: return lignes.get(rowIndex).getnom();
            case 3: return lignes.get(rowIndex).getprenom();
            case 4: return lignes.get(rowIndex).getadresse();
            case 5: return lignes.get(rowIndex).getemail();    
                
            
            
            
            default:return null;
    }   
	}

}
    

