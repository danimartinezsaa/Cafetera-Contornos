/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornoscafetera;

import javax.swing.JOptionPane;

/**
 * Clase con las salidas por pantalla de la cafetera.
 * @author dani
 */
public class Display{
    /**
     * Muestra el precio del producto seleccionado.
     * @param seleccion Recibe el producto seleccionado.
     * @return True
     */
    public static boolean mostrarPrecio(Producto seleccion){
        JOptionPane.showMessageDialog(null, "Precio: "+seleccion.getPrecio()+"€");
        return true;        
        
    }
    /**
     * Muestra la cantidad de azúcar que está definida en la clase Producto.
     * @return True
     */
    public static boolean mostrarAzucar(){
        JOptionPane.showMessageDialog(null, "Azúcar: "+Producto.getAzucar()+" de 5");
        return true;
    }
    /**
     * Muestra el producto seleccionado.
     * @param seleccion Recibe el producto seleccionado.
     * @return True
     */
    public static boolean mensajeSeleccion(Producto seleccion){
        JOptionPane.showMessageDialog(null, "Has seleccionado la bebida: "+seleccion.getNombre());
        return true;
    }
    /**
     * Muestra el dinero que queda para llegar al precio del producto.
     * @param seleccion Recibe el producto seleccionado
     * @return True
     */
    public static boolean pedirDinero(Producto seleccion){      
        if(Dinero.cuenta==0)
            JOptionPane.showMessageDialog(null,"Te quedan: "+seleccion.getPrecio()+"€");
        else if(Dinero.cuenta>0 && Dinero.cuenta<seleccion.getPrecio())
            JOptionPane.showMessageDialog(null,"Te quedan: "+(seleccion.getPrecio()-Dinero.cuenta+"€"));
        return true;
    }
    /**
     * Muestra un mensaje de información para el usuario "Inserte monedas:"
     * @return True
     */
    public static boolean pedirDinero(){
        JOptionPane.showMessageDialog(null, "Inserte monedas:");
        return true;
    }
    /**
     * Muestra el dinero insertado
     * @return True
     */
    public static boolean mostrarDinero(){
        JOptionPane.showMessageDialog(null, "Dinero insertado: "+Dinero.cuenta+"€");
        return true;
    }
}
