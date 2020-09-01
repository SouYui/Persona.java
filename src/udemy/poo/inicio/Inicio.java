/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;
import udemy.poo.codigo.Persona;

/**
 *
 * @author luisangelcuriel
 */
public class Inicio {
    public static void main(String[] args) {
        Persona persona = new Persona("Samuel", "Méndez", "Pérez", "345678");
        Persona personaDos = new Persona();
        
        JOptionPane.showMessageDialog(null, persona.toString());
        //JOptionPane.showMessageDialog(null, personaDos.getNombre());
        
        persona.setApellidoMaterno("Cortés");
        JOptionPane.showMessageDialog(null, persona.getApellidoMaterno());
        JOptionPane.showMessageDialog(null, persona.toString());
    }
}
