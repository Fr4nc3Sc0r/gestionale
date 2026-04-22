/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionale;

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
    
}
