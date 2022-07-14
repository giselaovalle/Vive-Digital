
package controlador;

import java.awt.event.ActionEvent;
import modelo.devolucion;

/**
 *
 * @author KIM YISO
 */
public class ControladorDevolucion {
      public void controlarAccion(ActionEvent evento, devolucion unadevolucion)
    {
        String accion = evento.getActionCommand();
    switch(accion)
    {
        case "Guardar":
        unadevolucion.insertar();
            break;
        case "Modificar":
        unadevolucion.modificar();
           
            break;
        case "Eliminar":
        unadevolucion.eliminar();
            break;
    
    }
     
        System.out.println(accion);
    
    }
    }
    

