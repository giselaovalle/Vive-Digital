/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.entrega;

/**
 *
 * @author KIM YISO
 */
public class controladorEntrega {
          public void controlarAccion(ActionEvent evento, entrega unaentrega)
    {
        String accion = evento.getActionCommand();
    switch(accion)
    {
        case "Guardar":
        unaentrega.insertar();
            break;
        case "Modificar":
        unaentrega.modificar();
           
            break;
        case "Eliminar":
        unaentrega.eliminar();
            break;
    
    }
     
        System.out.println(accion);
    
    }
    }
    

