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

        // sesso
        if (giorno > 40) {
            giorno -= 40;
        }

        int mese = switch (meseChar) {
            case 'A' -> 1;
            case 'B' -> 2;
            case 'C' -> 3;
            case 'D' -> 4;
            case 'E' -> 5;
            case 'H' -> 6;
            case 'L' -> 7;
            case 'M' -> 8;
            case 'P' -> 9;
            case 'R' -> 10;
            case 'S' -> 11;
            case 'T' -> 12;
            default -> throw new IllegalArgumentException("Mese CF non valido");
        };

        // gestione anno
        int annoCompleto;

        if (anno <= LocalDate.now().getYear() % 100) {
            annoCompleto = 2000 + anno;
        } else {
            annoCompleto = 1900 + anno;
        }

        LocalDate annoCodiceFiscale = LocalDate.of(annoCompleto, mese, giorno);
        
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
        
        
        
        if(((cm+nm).equals(cdfs)) && annoCodiceFiscale.equals(dataDiNascita)){
            status = true;
        }
        return status;
    }
    
}

