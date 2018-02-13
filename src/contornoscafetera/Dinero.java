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

    public static boolean contar(){
        cuenta=cuenta+Float.parseFloat(JOptionPane.showInputDialog("Inserte dinero:"));
        return true;
    }

    public static boolean devolver(){
        JOptionPane.showMessageDialog(null,"Dinero devuelto.");
        cuenta=0f;
        return true;
    }
    
    public static boolean darVuelta(Producto seleccion){
        JOptionPane.showMessageDialog(null,"Vuelta soltada: "+(cuenta-seleccion.getPrecio()));
        cuenta=0f;
        return true;
    }
}
