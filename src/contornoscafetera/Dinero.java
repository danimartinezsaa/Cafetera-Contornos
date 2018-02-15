/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornoscafetera;

import javax.swing.JOptionPane;

/**
 * Clase que tiene la cuenta del dinero insertado y varios métodos que modifican su valor.
 * 
 * @author dani
 */
public class Dinero{
    
    static Float cuenta=0f;
/**
 * Permite al usuario introducir dinero y su valor lo suma a la variable "cuenta"
 * @return True
 */
    public static boolean contar(){
        cuenta=cuenta+Float.parseFloat(JOptionPane.showInputDialog("Inserte dinero:"));
        return true;
    }
/**
 * Pone la cuenta a 0 y devuelve el dinero al usuario.
 * @return True
 */
    public static boolean devolver(){
        JOptionPane.showMessageDialog(null,"Dinero devuelto.");
        cuenta=0f;
        return true;
    }
/**
 * Pone la cuenta a 0 y devuelve al usuario la resta de la cuenta - precio del producto seleccionado.
 * @param seleccion Recibe el producto seleccionado por el usuario.
 * @return True
 */    
    public static boolean darVuelta(Producto seleccion){
        JOptionPane.showMessageDialog(null,"Vuelta soltada: "+(cuenta-seleccion.getPrecio()));
        cuenta=0f;
        return true;
    }
}
