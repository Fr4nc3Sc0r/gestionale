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
        for(int i = 0; i < database.size(); i++){
            if(database.elementAt(i).an_codiceFiscale.equals(cod))
                return true;
            System.out.println("si esiste");
            
        }
        return false;
    }
}
