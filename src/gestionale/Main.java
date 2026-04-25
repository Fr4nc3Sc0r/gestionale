/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionale;

import gestionale.GUI.Login_Frame;
import javax.swing.SwingUtilities;
/**
 *
 * @author franc
 */
public class Main {

    public static void main(String[] args) {
        
        //Assistito assistito = new Assistito("pppsps", "peppe","esposito","ciccio","ciccio");
        //Database database = new Database();
        //Agent agent = new Agent();
        
        //database.buffer(assistito);
        //database.svuotaBuffer();
        //System.out.println(assistito);
        
        //database.print(0);
        
        //database.carica();
        //if(agent.validitaCodiceFiscale(assistito.an_codiceFiscale, assistito.an_nome, assistito.an_cognome)){
        //    System.out.println("gud");
        //}
        
        
        
        SwingUtilities.invokeLater(() -> {
            Login_Frame gui = new Login_Frame();
            gui.showLoginFrame();
        });
        
        
    }
    
}
