/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornoscafetera;

import javax.swing.JOptionPane;

/**
 * Clase que tiene los métodos de elaboración de las diferentes bebidas.
 * @author dani
 */
public class Cafetera{
     
    /**
     * Pone un mensaje de que se ha soltado el vaso.
     * @return True
     */
    public static boolean darVaso(){
        JOptionPane.showMessageDialog(null, "Vaso soltado.");
        return true;
    }
    /**
     * Pone un mensaje de que se está dispensando el café.
     * @return True
     */
    public static boolean DispensarCafe(){
        JOptionPane.showMessageDialog(null, "Dispensando Café...Espere");
        Producto.setAzucar(3);
        return true;
    }
    /**
     * Pone un mensaje de que se está dispensando chocolate.
     * @return True
     */
    public static boolean DispensarChocolate(){
        JOptionPane.showMessageDialog(null, "Dispensando Chocolate...Espere");
        Producto.setAzucar(3);
        return true;
    }
    /**
     * Pone un mensaje de que se está dispensando Té.
     * @return True
     */
    public static boolean DispensarTe(){
        JOptionPane.showMessageDialog(null, "Dispensando Té...Espere");
        Producto.setAzucar(3);
        return true;
    }   
}
