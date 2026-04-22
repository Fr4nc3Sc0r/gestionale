/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionale;
import java.io.*;
import java.util.Vector;
/**
 *
 * @author franc
 */
public class Database {
    
    Vector<Assistito> databaseAssistiti = new Vector();
    

    public Database() {
    }

    public void print(int position)
    {
        System.out.println(databaseAssistiti.size());
        System.out.println(databaseAssistiti.elementAt(position));
    }
    
    public void bufferAndSave(Assistito assistito){
        
        if(!Agent.codFiscaleEsistente(databaseAssistiti, assistito.an_codiceFiscale)){
        databaseAssistiti.add(assistito);
        salva();
        }
        else{
            System.out.println("codice fiscale esistente");
        }
    }
    
    private void salva(){
        try{
            
            File file = new File("assistiti.dat");
            if(file.exists())
            {
                carica();
            }
            
            FileOutputStream f = new FileOutputStream("assistiti.dat");
            ObjectOutputStream fOut = new ObjectOutputStream(f);
            
            for(int i = 0; i < databaseAssistiti.size(); i++)
            {  
                
                fOut.writeObject(databaseAssistiti.elementAt(i));
                System.out.println("ho appena salvato un elemento correttamente");
            }
            
            f.close();
            
        }
        catch(Exception e){
            System.out.println("sono qui dato che non riesco a salvare");
        }
        finally{
            
        }
    }
    public void svuotaBuffer()
    {
        databaseAssistiti.removeAllElements();
    }
    
    public void carica(){
        
        databaseAssistiti.removeAllElements();
        
        
        
        try{
            FileInputStream f = new FileInputStream("assistiti.dat");
            ObjectInputStream fIn = new ObjectInputStream(f);
            Assistito obj;
            int i = 0;
            
            try{
            while((obj = (Assistito) fIn.readObject()) != null){
                
                databaseAssistiti.add(obj);
                System.out.println("ho caricato " + ++i + " elementi" );
            }
            //System.out.println("sono qui");
            
            }
            catch(EOFException e){
                
            }
            
            f.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    protected Vector<Assistito> getDatabaseAssistiti() {
        return databaseAssistiti;
    }
    
    
}
