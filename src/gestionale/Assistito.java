/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionale;
import java.util.Vector;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author franc
 */
public class Assistito extends Entita implements Serializable{
    
    String an_codiceFiscale;
    String an_nome;
    String an_cognome;
    String an_indirizzo;
    String an_cittaDiResidenza;
    LocalDate an_dataDiNascita;

    public Assistito(String an_codiceFiscale, String an_nome, String an_cognome, String an_indirizzo, String an_cittaDiResidenza, LocalDate an_dataDiNascita) {
        
        
        this.an_codiceFiscale = an_codiceFiscale;
        this.an_nome = an_nome;
        this.an_cognome = an_cognome;
        this.an_indirizzo = an_indirizzo;
        this.an_cittaDiResidenza = an_cittaDiResidenza;
        this.an_dataDiNascita = an_dataDiNascita;
    }
    
    
    

    

    public Assistito() {
    }

    public LocalDate getAn_dataDiNascita() {
        return an_dataDiNascita;
    }

    public void setAn_dataDiNascita(LocalDate an_dataDiNascita) {
        this.an_dataDiNascita = an_dataDiNascita;
    }

    
    
    
    public String getAn_codiceFiscale() {
        return an_codiceFiscale;
    }

    public void setAn_codiceFiscale(String an_codiceFiscale) {
        this.an_codiceFiscale = an_codiceFiscale;
    }

    public String getAn_nome() {
        return an_nome;
    }

    public void setAn_nome(String an_nome) {
        this.an_nome = an_nome;
    }

    public String getAn_cognome() {
        return an_cognome;
    }

    public void setAn_cognome(String an_cognome) {
        this.an_cognome = an_cognome;
    }

    public String getAn_indirizzo() {
        return an_indirizzo;
    }

    public void setAn_indirizzo(String an_indirizzo) {
        this.an_indirizzo = an_indirizzo;
    }

    public String getAn_cittaDiResidenza() {
        return an_cittaDiResidenza;
    }

    public void setAn_cittaDiResidenza(String an_cittaDiResidenza) {
        this.an_cittaDiResidenza = an_cittaDiResidenza;
    }



   

    
    @Override
    public String toString() {
        return "\nAssistito: " + 
                "\ncodiceFiscale->" + an_codiceFiscale + ", "
                + "\nnome->" + an_nome + ", "
                + "\ncognome->" + an_cognome + ", "
                + "\nindirizzo->" + an_indirizzo + ", "
                + "\ncittaDiResidenza->" + an_cittaDiResidenza;
    }
    
    
    
}
