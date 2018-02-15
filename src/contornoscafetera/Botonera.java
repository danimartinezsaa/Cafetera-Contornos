
package contornoscafetera;

import javax.swing.JOptionPane;

/**
 * Botonera de la máquina de café, dónde se gestionan los botones de selección de las bebidas, devolver dinero y dar o quitar azúcar.
 * @author dani
 */
public class Botonera{
/**
 * Menú para que el usuario seleccione la bebida que desee
 * @return Retorna un entero que corresponde a la posición del producto en el Array "lista_producto" de la clase Main
 */
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
/**
 * Realiza la acción del botón de devolver dinero, poniendo la cuenta de la clase "Dinero" a 0 si no lo está ya y muestra un mensaje dependiendo de la condición.
 * @return True
 */
    public static boolean devolverDinero(){
        if(Dinero.cuenta>0){
            Dinero.cuenta=0f;
            JOptionPane.showMessageDialog(null, "Dinero devuelto.");

        }else{
            JOptionPane.showMessageDialog(null, "No hay dinero a devolver.");
        }
        return true;
    }
/**
 * Incrementa azucar de la clase Producto
 * @return True 
 */    
    public static boolean masAzucar(){
        if(Producto.getAzucar()>=0 && Producto.getAzucar()<5)
            Producto.setAzucar(Producto.getAzucar()+1);
        
        return true;
    }
/**
 * Decrementa azucar de la clase Producto
 * @return True
 */
    public static boolean menosAzucar(){
        if(Producto.getAzucar()<=5 && Producto.getAzucar()>0)
            Producto.setAzucar(Producto.getAzucar()-1);
        return true;        
    }
}
