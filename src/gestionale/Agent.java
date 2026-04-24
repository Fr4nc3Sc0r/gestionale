/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionale;
import java.util.Vector;
/**
 *
 * @author franc
 */
public class Agent {
    
    public static boolean codFiscaleEsistente(Vector<Assistito> database, String cod){
        boolean exist = false;
        for(int i = 0; i < database.size(); i++){
            if(database.elementAt(i).an_codiceFiscale.equals(cod)){
                System.out.println("si esiste");   
                exist = true;
            }
        }
        return exist;
    }
    
    public static boolean login(String utente, String passwd){
        boolean status = false;
        if(utente.equals("lorusso") && passwd.equals("lorusso")){
            status = true;
        }
        return status;
    }
    
    public boolean validitaCodiceFiscale(String codiceFiscale, String nome, String cognome){
        boolean status = false;
        
        String nm;
        
    }
}
