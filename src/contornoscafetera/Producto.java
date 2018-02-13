/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornoscafetera;

import javax.swing.JOptionPane;

/**
 * Clase del objeto Producto, contiene getters y setters y toString.
 * @author dani
 */
public class Producto{
    private Float Precio;
    private static Integer azucar=3;
    private String nombre;

    public Producto(){
    }

    public Producto(Float Precio, String nombre){
        this.Precio=Precio;
        this.nombre=nombre;
    }

    public Float getPrecio(){
        return Precio;
    }

    public void setPrecio(Float Precio){
        this.Precio=Precio;
    }

    public static void setAzucar(Integer azucar){
        Producto.azucar=azucar;
    }

    public static Integer getAzucar(){
        return azucar;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    
    @Override
    public String toString(){
        return "Precio="+Precio+", nombre="+nombre;
    }    
}
