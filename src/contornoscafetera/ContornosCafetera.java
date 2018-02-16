/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornoscafetera;

import javax.swing.JOptionPane;

/**
 * Programa de una cafetera con las opciones de seleccionar bebida, introducir dinero, devolver dinero, añadir azúcar, quitar azúcar y salir.
 * @author dani
 */
public class ContornosCafetera{

    /** Clase principal con el menú principal de una cafetera.
     * @param args the command line arguments
     */
    public static void main(String[] args){
        boolean encendido=true;
        Producto seleccionado=null;
        Producto lista_producto[]={new Producto(0.5f,"Café"),new Producto(0.5f,"Chocolate"),new Producto(0.5f,"Té")};
        
        while(encendido==true){
            String[] menu={"Insertar moneda","Seleccionar bebida","Más azucar","Menos azucar","Devolver Dinero","Salir"};
            int opcion=JOptionPane.showOptionDialog(
                null //componente
                ,
                 "Cafetera" // Mensaje
                ,
                 "Cafetera" // Titulo en la barra del cuadro
                ,
                 JOptionPane.DEFAULT_OPTION // Tipo de opciones
                ,
                 JOptionPane.INFORMATION_MESSAGE // Tipo de mensaje (icono)
                ,
                 null // Icono (ninguno)
                ,
                 menu // Opciones personalizadas
                ,
                 null // Opcion por defecto
            );
            
            switch(opcion){
                case 0:
                    if(seleccionado!=null)
                        Display.pedirDinero(seleccionado);
                    
                    Dinero.contar();
                    Display.mostrarDinero();
                    break;
                case 1:
                    seleccionado=lista_producto[Botonera.seleccionBebida()];
                    Display.mensajeSeleccion(seleccionado);
                    if(Dinero.cuenta>=seleccionado.getPrecio()){
                        Cafetera.darVaso();
                        if(seleccionado.getNombre().equals("Café")){
                            Cafetera.DispensarCafe();
                        }
                        else if(seleccionado.getNombre().equals("Chocolate")){
                            Cafetera.DispensarChocolate();
                        }
                        else{
                            Display.mensajeSeleccion(seleccionado);
                            Cafetera.DispensarTe();
                        }
                        Dinero.darVuelta(seleccionado);
                        seleccionado=null;
                    }else{
                        Display.pedirDinero(seleccionado);
                    }
                    break;
                case 2:
                    Botonera.masAzucar();
                    Display.mostrarAzucar();
                    break;
                case 3:
                    Botonera.menosAzucar();
                    Display.mostrarAzucar();
                    break;
                case 4:
                    Dinero.devolver();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
