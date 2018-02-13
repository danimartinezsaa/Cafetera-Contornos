/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornoscafetera;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Cafetera{
     
    /**
     *
     * @return
     */
    public static boolean darVaso(){
        JOptionPane.showMessageDialog(null, "Vaso soltado.");
        return true;
    }
    
    public static boolean DispensarCafe(){
        JOptionPane.showMessageDialog(null, "Dispensando Café...Espere");
        Producto.setAzucar(3);
        return true;
    }
    public static boolean DispensarChocolate(){
        JOptionPane.showMessageDialog(null, "Dispensando Chocolate...Espere");
        Producto.setAzucar(3);
        return true;
    }
    public static boolean DispensarTe(){
        JOptionPane.showMessageDialog(null, "Dispensando Té...Espere");
        Producto.setAzucar(3);
        return true;
    }   
}
