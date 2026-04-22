/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionale;

import gestionale.GUI.Main_Frame;
import javax.swing.SwingUtilities;
/**
 *
 * @author franc
 */
public class Main {

    public static void main(String[] args) {
        
        //Assistito assistito = new Assistito("ciccio", "ciccio","ciccio","ciccio","ciccio");
        //Database database = new Database();
        
        //database.buffer(assistito);
        //database.svuotaBuffer();
        //System.out.println(assistito);
        
        //database.print(0);
        
        //database.carica();
        
        
        SwingUtilities.invokeLater(() -> {
            Main_Frame gui = new Main_Frame();
            gui.showMainFrame();
        });
        
        
    }
    
}
