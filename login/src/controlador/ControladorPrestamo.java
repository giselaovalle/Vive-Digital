/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.Prestamo;

/**
 *
 * @author KIM YISO
 */
public class ControladorPrestamo {
      public void controlarAccion(ActionEvent evento, Prestamo unPrestamo)
    {
        String accion = evento.getActionCommand();
    switch(accion)
    {
        case "Guardar":
        unPrestamo.insertar();
            break;
        case "Modificar":
        unPrestamo.modificar();
           
            break;
        case "Eliminar":
        unPrestamo.eliminar();
            break;
    
    }
     
        System.out.println(accion);
    
    }
    }
    

