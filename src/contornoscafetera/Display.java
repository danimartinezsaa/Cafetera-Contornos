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
public class Display{
    
    public static boolean mostrarPrecio(Producto seleccion){
        JOptionPane.showMessageDialog(null, "Precio: "+seleccion.getPrecio()+"€");
        return true;        
        
    }
    
    public static boolean mostrarAzucar(){
        JOptionPane.showMessageDialog(null, "Azúcar: "+Producto.getAzucar()+" de 5");
        return true;
    }
    
    public static boolean mensajeSeleccion(Producto seleccion){
        JOptionPane.showMessageDialog(null, "Has seleccionado la bebida: "+seleccion.getNombre());
        return true;
    }
    
    public static boolean pedirDinero(Producto seleccion){      
        if(Dinero.cuenta==0)
            JOptionPane.showMessageDialog(null,"Te quedan: "+seleccion.getPrecio()+"€");
        else if(Dinero.cuenta>0 && Dinero.cuenta<seleccion.getPrecio())
            JOptionPane.showMessageDialog(null,"Te quedan: "+(seleccion.getPrecio()-Dinero.cuenta+"€"));
        return true;
    }
    public static boolean pedirDinero(){
        JOptionPane.showMessageDialog(null, "Inserte monedas:");
        return true;
    }
    
    public static boolean mostrarDinero(){
        JOptionPane.showMessageDialog(null, "Dinero insertado: "+Dinero.cuenta+"€");
        return true;
    }
}
