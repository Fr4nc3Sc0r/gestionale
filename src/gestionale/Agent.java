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
    
    public static boolean validitaCodiceFiscale(String codiceFiscale, String nome, String cognome){
        boolean status = false;
        
        codiceFiscale = codiceFiscale.toLowerCase();
        nome = nome.toLowerCase();
        cognome = cognome.toLowerCase();
        
        String nm = "";
        String cm = "";
        String cdfs = "";
        
        for(int i = 0; i < 6; i++){
            cdfs = cdfs + codiceFiscale.charAt(i);
        }
        System.out.println(cdfs);
        
        for(int i = 0; i < nome.length(); i++){
            if((nome.charAt(i)!='a' && nome.charAt(i)!='e' && nome.charAt(i)!='i' && nome.charAt(i)!='o' && nome.charAt(i)!='u') && nm.length() < 3){
                nm = nm + nome.charAt(i);
            }
        }
        System.out.println(nm);
        
        for(int i = 0; i < cognome.length(); i++){
            if((cognome.charAt(i)!='a' && cognome.charAt(i)!='e' && cognome.charAt(i)!='i' && cognome.charAt(i)!='o' && cognome.charAt(i)!='u') && cm.length() < 3){
                cm = cm + cognome.charAt(i);
            }
        }
        System.out.println(cm);
        if((cm+nm).equals(cdfs)){
            status = true;
        }
        return status;
        
    }
}
