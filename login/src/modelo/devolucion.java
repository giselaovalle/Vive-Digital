
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author KIM YISO
 */
public class devolucion {
    
    private int ID;
    private String Resive;
    private String Fecha;
    private String tipoObjeto;
    private String observacion;
    private String Entrega;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getResive() {
        return Resive;
    }

    public void setResive(String Resive) {
        this.Resive = Resive;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }



    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEntrega() {
        return Entrega;
    }

    public void setEntrega(String Entrega) {
        this.Entrega = Entrega;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final devolucion other = (devolucion) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
     //LISTAR
    
    public Iterator<devolucion> listar()
    {
       ArrayList<devolucion> ladevolucion = new ArrayList<>();
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("SELECT * FROM actaDevolucion");
            ResultSet rs = sql.executeQuery();
            devolucion unadevolucion;
            while (rs.next()) {   
                unadevolucion = new devolucion();
                unadevolucion.setID(rs.getInt("ID"));
                unadevolucion.setResive(rs.getString("Resive"));
                unadevolucion.setFecha(rs.getString("Fecha"));
                unadevolucion.setTipoObjeto(rs.getString("Tipo Objeto"));
                unadevolucion.setObservacion(rs.getString("Observacion"));
                unadevolucion.setEntrega(rs.getString("Entrega"));
                
                ladevolucion.add(unadevolucion);
            }
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible listar");
        }
        if (ladevolucion.isEmpty()) {
            devolucion midevolucion = new devolucion();
            midevolucion.setResive("No hay datos por mostar");
            ladevolucion.add(midevolucion);
        }
       return ladevolucion.iterator();
    }
    
  
    
    public void insertar()
    {
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("INSERT INTO `actaDevolucion`( `Resive`,`Fecha`,`Tipo Objeto`,`Observacion`,`Entrega`) VALUES (?,?,?,?,?)");
            if (!this.getResive().isEmpty() && !this.getFecha().isEmpty()) {
                sql.setString(1,this.getResive());
                sql.setString(2,this.getFecha());
                sql.setString(3, this.getTipoObjeto());
                sql.setString(4,this.getObservacion());
                sql.setString(5,this.getEntrega());
                
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Devolucion registrada");  
                
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
                
            }
                
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "ERROR al registrar");
             System.out.println("no pude registrar porque" +e.getMessage());
            
        }
    }
    
   
    public void modificar()
    {
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("UPDATE `actaDevolucion` SET `Resive`=?,`Fecha`=?,`Tipo Objeto`=?,`Observacion`=?,`Entrega`=? WHERE `ID`=?");
                sql.setString(1,this.getResive());
                sql.setString(2,this.getFecha());
                sql.setString(3, this.getTipoObjeto());
                sql.setString(4,this.getObservacion());
                sql.setString(5,this.getEntrega());
                sql.setInt(6, this.getID());
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Devolucion Modificada");   
                
                       } catch (SQLException e) {
                    
                     JOptionPane.showMessageDialog(null, "ERROR al modificar");
                      System.out.println("no pude registrar porque" +e.getMessage());
            
                 
        }
        
    }
    
    
    
    public void eliminar()
    {
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("DELETE FROM `actaDevolucion` WHERE `ID`=?");
            sql.setInt(1, this.getID());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Devolucion Eliminada");  
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR al eliminar ");
            
        }
    }
    
    
    
    public Iterator<devolucion> buscar(String busqueda)
    {
    ArrayList<devolucion> ladevolucion = new ArrayList<>();
    
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("SELECT * FROM `actaDevolucion` WHERE `Resive` LIKE? OR Fecha LIKE? OR TipoObjeto LIKE? OR Observacion LIKE? OR Entrega LIKE?");
            sql.setString(1, "%"+busqueda+"%");
            sql.setString(2, "%"+busqueda+"%");
            sql.setString(3, "%"+busqueda+"%");
            sql.setString(4, "%"+busqueda+"%");
            sql.setString(5, "%"+busqueda+"%");
            
            ResultSet rs = sql.executeQuery();
            devolucion undevolucion;
            
            while (rs.next()) {   
                undevolucion = new devolucion();
                undevolucion.setID(rs.getInt("ID"));
                undevolucion.setResive(rs.getString("Resive"));
                undevolucion.setFecha(rs.getString("Fecha"));
                undevolucion.setTipoObjeto(rs.getString("Tipo Objeto"));
                undevolucion.setObservacion(rs.getString("Observacion"));
                undevolucion.setEntrega(rs.getString("Entrega"));
                
            }
        } catch (SQLException e) { 
              JOptionPane.showMessageDialog(null, "ERROR al buscar");
        }
    return  ladevolucion.iterator();
    }
    
    //BUSCAR POR EL ID
    public devolucion buscarPorId(int elID)
    {
    devolucion unadevolucion = new devolucion();
    unadevolucion.setResive("el prestamo no existe");
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("SELECT * FROM actaDevolucion WHERE ID=?");
            sql.setInt(1, elID);
            int elId = this.getID();
            ResultSet rs = sql.executeQuery();
           
            while (rs.next()) {   
                unadevolucion = new devolucion();
                unadevolucion.setID(rs.getInt("ID"));
                unadevolucion.setResive(rs.getString("Resive")); 
                unadevolucion.setFecha(rs.getString("Fecha")); 
                unadevolucion.setTipoObjeto(rs.getString("Tipo Objeto"));
                unadevolucion.setObservacion(rs.getString("Observacion")); 
                unadevolucion.setEntrega(rs.getString("Entrega")); 
                
               
            }
        } catch (SQLException e) {
            System.out.println("no se pudo buscar por el id   "+e.getMessage());
        }
    return unadevolucion;
    } 
   
    
  
    
}
