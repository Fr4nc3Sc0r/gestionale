/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionale;
import java.util.Vector;
import java.time.LocalDate;
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
    
    public static boolean validitaCodiceFiscale(String codiceFiscale, String nome, String cognome, LocalDate dataDiNascita){
        boolean status = false;
        
        codiceFiscale = codiceFiscale.toLowerCase();
        nome = nome.toLowerCase();
        cognome = cognome.toLowerCase();
                
        String nm = "";
        String cm = "";
        String cdfs = "";
        
        int anno = Integer.parseInt(codiceFiscale.substring(6, 8));
        char meseChar = codiceFiscale.charAt(8);
        int giorno = Integer.parseInt(codiceFiscale.substring(9, 11));

        System.out.println(meseChar);
        
        // sesso
        if (giorno > 40) {
            giorno -= 40;
        }

        int mese = switch (meseChar) {
            case 'a' -> 1;
            case 'b' -> 2;
            case 'c' -> 3;
            case 'd' -> 4;
            case 'e' -> 5;
            case 'h' -> 6;
            case 'l' -> 7;
            case 'm' -> 8;
            case 'p' -> 9;
            case 'r' -> 10;
            case 's' -> 11;
            case 't' -> 12;
            default -> 0;
        };
        
        System.out.println(mese);
        System.out.println(anno);
        System.out.println(giorno);
        
        if(mese == 0){
            return false;
        }

        // gestione anno
        int annoCompleto;

        if (anno <= LocalDate.now().getYear() % 100) {
            annoCompleto = 2000 + anno;
        } else {
            annoCompleto = 1900 + anno;
        }
        
        System.out.println(annoCompleto);

        LocalDate annoCodiceFiscale = LocalDate.of(annoCompleto, mese, giorno);
        
        System.out.println(annoCodiceFiscale);
        System.out.println(dataDiNascita);
        
        for(int i = 0; i < 11; i++){
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
        
        String annoS;
        
        if(anno < 10){
            annoS = "0" + String.valueOf(anno);
        }
        else{
            annoS = String.valueOf(anno);
        }
        String giornoS = String.valueOf(giorno);
        
        System.out.println(annoS);
        System.out.println(giornoS);
        System.out.println(cm+nm+annoS+meseChar+giornoS);
        if(((cm+nm+annoS+meseChar+giornoS).equals(cdfs)) && annoCodiceFiscale.equals(dataDiNascita)){
            status = true;
        }
        return status;
    }
    
}

