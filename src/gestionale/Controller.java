/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionale;

import static gestionale.Agent.login;
import static gestionale.Agent.validitaCodiceFiscale;

/**
 *
 * @author franc
 */
public class Controller {
    
    Database database = new Database();

    public Controller() {
    }
    
    
    
    public void salva(Assistito assistito){
        database.bufferAndSave(assistito);
    }
    
    public void carica(){
        database.carica();
    }
    
    public Assistito edit(String cod_Fiscale){
        return database.getAssistito(cod_Fiscale);
    }
    
    public boolean log(String string, String string1) {
        return login(string, string1);
    }
    
    public boolean verifyCodFisc(String codiceFiscale, String nome, String cognome){
        return validitaCodiceFiscale(codiceFiscale, nome, cognome);
    }
    
}
