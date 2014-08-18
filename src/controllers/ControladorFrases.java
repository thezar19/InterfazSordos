/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import model.Frase;

/**
 *
 * @author peguerosdc
 */
public class ControladorFrases {
    
    public static Frase traducirFrase(String frase) {
        Frase traduccion = new Frase();
        traduccion.setFrase(frase);
        return traduccion;
    }
    
    public static boolean guardarFrase(String frase) {
        return true;
    }
}
