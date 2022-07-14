
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author KIM YISO
 */
public class entrega {
    
   private int IdEntrega;
   private String Asignado;
   private String Cedula;
   private String Cargo;
   private String Correo;
   private String telefono;
   private String Fecha;
   private String observacion;
   private String entrega;
   private String tipo;

    public int getIdEntrega() {
        return IdEntrega;
    }

    public void setIdEntrega(int IdEntrega) {
        this.IdEntrega = IdEntrega;
    }

    public String getAsignado() {
        return Asignado;
    }

    public void setAsignado(String Asignado) {
        this.Asignado = Asignado;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String Entrega) {
        this.entrega = Entrega;
    }

  
       //METODO HASHCODE
    @Override
    public int hashCode() {
        int hash = 3;
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
        final entrega other = (entrega) obj;
        if (this.IdEntrega != other.IdEntrega) {
            return false;
        }
        return true;
    }
   
     //LISTAR
    
    public Iterator<entrega> listar()
    {
       ArrayList<entrega> laentrega = new ArrayList<>();
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("SELECT * FROM actaEntrega");
            ResultSet rs = sql.executeQuery();
            entrega unentrega;
            while (rs.next()) {   
                unentrega = new entrega();
                unentrega.setIdEntrega(rs.getInt("IdEntrega"));
                unentrega.setAsignado(rs.getString("Asignado"));
                unentrega.setCedula(rs.getString("Cedula"));
                unentrega.setCargo(rs.getString("Cargo"));
                unentrega.setCorreo(rs.getString("Correo"));
                unentrega.setTelefono(rs.getString("Telefono"));
                unentrega.setFecha(rs.getString("Fecha"));
                unentrega.setTipo(rs.getString("Tipo"));
                unentrega.setObservacion(rs.getString("Observacion"));
                unentrega.setEntrega(rs.getString("Entrega"));
                
                laentrega.add(unentrega);
            }
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible listar");
        }
        if (laentrega.isEmpty()) {
            entrega mientrega = new entrega();
            mientrega.setAsignado("No hay datos por mostar");
            laentrega.add(mientrega);
        }
       return laentrega.iterator();
    }
    
  
    
    public void insertar()
    {
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("INSERT INTO `actaEntrega`( `Asignado`,  `Cedula`,`Cargo`, `Correo`, `Telefono`,`Tipo`,`Fecha`,`Observacion`,`Entrega`) VALUES (?,?,?,?,?,?,?,?,?)");
            if (!this.getAsignado().isEmpty() && !this.getCargo().isEmpty()) {
                sql.setString(1,this.getAsignado());
                sql.setString(3,this.getCedula());
                sql.setString(2,this.getCargo());
                sql.setString(4,this.getCorreo());
                sql.setString(5,this.getTelefono());
                sql.setString(6,this.getFecha());
                sql.setString(7,this.getTipo());
                sql.setString(8,this.getObservacion());
                sql.setString(9,this.getEntrega());
                
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Entrega registrada");  
                
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
            PreparedStatement sql = Conexion.conexion.prepareStatement("UPDATE `actaEntrega` SET `Asignado`=?,`Cedula`=?,`Cargo`=?,`Correo`=?,`Fecha`=?,`Telefono`=?,`Tipo`=?, `Observacion`=?,`Entrega`=? WHERE `IdEntrega`=?");
                sql.setString(1,this.getAsignado());
                sql.setString(2,this.getCedula());
                sql.setString(3,this.getCargo());
                sql.setString(4,this.getCorreo());
                sql.setString(5,this.getFecha());
                sql.setString(6,this.getTelefono());
                sql.setString(7, this.getTipo());
                sql.setString(8,this.getObservacion());
                sql.setString(9,this.getEntrega());
                sql.setInt(10, this.getIdEntrega());
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Entrega Modificada");   
                
                       } catch (SQLException e) {
                    
                     JOptionPane.showMessageDialog(null, "ERROR al modificar");
                      System.out.println("no pude registrar porque" +e.getMessage());
            
                 
        }
        
    }
    
    
    
    public void eliminar()
    {
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("DELETE FROM `actaEntrega` WHERE `IdEntrega`=?");
            sql.setInt(1, this.getIdEntrega());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Entrega Eliminada");  
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR al eliminar ");
            
        }
    }
    
    
    
    public Iterator<entrega> buscar(String busqueda)
    {
    ArrayList<entrega> losentrega = new ArrayList<>();
    
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("SELECT * FROM `actaEntrega` WHERE `Asignado` LIKE? OR Cedula LIKE? OR Cargo LIKE? OR Correo LIKE? OR Telefono LIKE? OR Fecha LIKE? OR Tipo LIKE? OR Observacion LIKE? OR Entrega LIKE?");
            sql.setString(1, "%"+busqueda+"%");
            sql.setString(2, "%"+busqueda+"%");
            sql.setString(3, "%"+busqueda+"%");
            sql.setString(4, "%"+busqueda+"%");
            sql.setString(5, "%"+busqueda+"%");
            sql.setString(6, "%"+busqueda+"%");
            sql.setString(7, "%"+busqueda+"%");
            sql.setString(8, "%"+busqueda+"%");
            sql.setString(9, "%"+busqueda+"%");
            sql.setString(10, "%"+busqueda+"%");
            
            ResultSet rs = sql.executeQuery();
            entrega unentrega;
            
            while (rs.next()) {   
                unentrega = new entrega();
                unentrega.setIdEntrega(rs.getInt("IdEntrega"));
                unentrega.setAsignado(rs.getString("Asignado"));
                unentrega.setCedula(rs.getString("Cedula"));
                unentrega.setCargo(rs.getString("Cargo"));
                unentrega.setCorreo(rs.getString("Correo"));
                unentrega.setTelefono(rs.getString("Telefono")); 
                unentrega.setFecha(rs.getString("Fecha")); 
                unentrega.setTipo(rs.getString("Tipo"));
                unentrega.setObservacion(rs.getString("Observacion")); 
                unentrega.setEntrega(rs.getString("Entrega")); 
                losentrega.add(unentrega);
                
            }
        } catch (SQLException e) { 
              JOptionPane.showMessageDialog(null, "ERROR al buscar");
        }
    return  losentrega.iterator();
    }
    
    //BUSCAR POR EL ID
    public entrega buscarPorId(int elID)
    {
    entrega unentrega = new entrega();
    unentrega.setAsignado("el prestamo no existe");
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("SELECT * FROM actaEntrega WHERE IdEntrega=?");
            sql.setInt(1, elID);
            int elId = this.getIdEntrega();
            ResultSet rs = sql.executeQuery();
           
            while (rs.next()) {   
                unentrega = new entrega();
                unentrega.setIdEntrega(rs.getInt("IdEntrega"));
                unentrega.setAsignado(rs.getString("Asignado"));
                unentrega.setCedula(rs.getString("Cedula"));
                unentrega.setCargo(rs.getString("Cargo"));
                unentrega.setCorreo(rs.getString("Correo"));
                unentrega.setTelefono(rs.getString("Telefono")); 
                unentrega.setFecha(rs.getString("Fecha")); 
                unentrega.setTipo(rs.getString("Tipo"));
                unentrega.setObservacion(rs.getString("Observacion")); 
                unentrega.setEntrega(rs.getString("Entrega")); 
                
               
            }
        } catch (SQLException e) {
            System.out.println("no se pudo buscar por el id   "+e.getMessage());
        }
    return unentrega;
    
    }
    

    }
   
    

