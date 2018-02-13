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
public class Botonera{

    public static int seleccionBebida(){
        String[] bebidas={"Café", "Chocolate", "Té"};
        int bebida=JOptionPane.showOptionDialog(
                null //componente
                ,
                 "Seleccione bebida" // Mensaje
                ,
                 "Cafetera" // Titulo en la barra del cuadro
                ,
                 JOptionPane.DEFAULT_OPTION // Tipo de opciones
                ,
                 JOptionPane.INFORMATION_MESSAGE // Tipo de mensaje (icono)
                ,
                 null // Icono (ninguno)
                ,
                 bebidas // Opciones personalizadas
                ,
                 null // Opcion por defecto
        );
        return bebida;
    }

    public static boolean devolverDinero(){
        if(Dinero.cuenta>0){
            Dinero.cuenta=0f;
            JOptionPane.showMessageDialog(null, "Dinero devuelto.");

        }else{
            JOptionPane.showMessageDialog(null, "No hay dinero a devolver.");
        }
        return true;
    }
    
    public static boolean masAzucar(){
        if(Producto.getAzucar()>=0 && Producto.getAzucar()<5)
            Producto.setAzucar(Producto.getAzucar()+1);
        
        return true;
    }
    public static boolean menosAzucar(){
        if(Producto.getAzucar()<=5 && Producto.getAzucar()>0)
            Producto.setAzucar(Producto.getAzucar()-1);
        return true;        
    }
}
