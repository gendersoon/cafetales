/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos;

/**
 *
 * @author jesuseduardo
 */
public class PromedioC {
    public static void main(String[] args) 
    {
        double c1, c2, c3;
        c1 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null,"Primer Calificacion"));
        c2 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null,"Segunda Calificacion"));
        c3 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null,"Tercera Calificacion"));
        javax.swing.JOptionPane.showMessageDialog(null,"Calificacion 1: " + c1 + "\nCalificacion 2: " + c2 + "\nCalificacion 3: " + c3 + "\nPromedio: " + ((c1 + c2 + c3)/3));
    }
    
}
