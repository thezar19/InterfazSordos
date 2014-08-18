/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author peguerosdc
 */
public class Frase {
    private String frase;
    private ArrayList<Senia> senias;

    public Frase() {
        senias = new ArrayList<Senia>();
    }
    
    public String getFrase() {
        return frase;
    }
    
    public void setFrase(String frase) {
        this.frase = frase;
    }

    public ArrayList<Senia> getSenias() {
        return senias;
    }

    public void setSenias(ArrayList<Senia> senias) {
        this.senias = senias;
    }
    
}
