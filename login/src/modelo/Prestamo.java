
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
public class Prestamo {
   
     
    private int ID;
    private String Nombre;
    private String Cargo;
    private String Cedula;
    private String Correo;
    private String Actividad;
    private String Fecha;
    private String Hora;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

  

  
    //LISTAR
    
    public Iterator<Prestamo> listar()
    {
       ArrayList<Prestamo> losPrestamos = new ArrayList<>();
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("SELECT * FROM actaPrestamo");
            ResultSet rs = sql.executeQuery();
            Prestamo unPrestamo;
            while (rs.next()) {   
                unPrestamo = new Prestamo();
                unPrestamo.setID(rs.getInt("ID"));
                unPrestamo.setNombre(rs.getString("Nombre"));
                unPrestamo.setCargo(rs.getString("Cargo"));
                unPrestamo.setCedula(rs.getString("Cedula"));
                unPrestamo.setCorreo(rs.getString("Correo"));
                unPrestamo.setActividad(rs.getString("Actividad"));
                unPrestamo.setFecha(rs.getString("Fecha"));
                unPrestamo.setHora(rs.getString("Hora"));
                losPrestamos.add(unPrestamo);
            }
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible listar");
        }
        if (losPrestamos.isEmpty()) {
            Prestamo miPrestamo = new Prestamo();
            miPrestamo.setNombre("No hay datos por mostar");
            losPrestamos.add(miPrestamo);
        }
       return losPrestamos.iterator();
    }
    
  
    
    public void insertar()
    {
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("INSERT INTO `actaPrestamo`( `Nombre`, `Cargo`, `Cedula`, `Correo`, `Actividad`,`Fecha`,`Hora`) VALUES (?,?,?,?,?,?,?)");
            if (!this.getNombre().isEmpty() && !this.getCargo().isEmpty()) {
                sql.setString(1,this.getNombre());
                sql.setString(2,this.getCargo());
                sql.setString(3,this.getCedula());
                sql.setString(4,this.getCorreo());
                sql.setString(5,this.getActividad());
                sql.setString(6,this.getFecha());
                sql.setString(7,this.getHora());
                
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Prestamo registrado");  
                
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
            PreparedStatement sql = Conexion.conexion.prepareStatement("UPDATE `actaPrestamo` SET `Nombre`=?,`Cargo`=?,`Cedula`=?,`Correo`=?,`Actividad`=?,`Fecha`=?,`Hora`=? WHERE `ID`=?");
                sql.setString(1,this.getNombre());
                sql.setString(2,this.getCargo());
                sql.setString(3,this.getCedula());
                sql.setString(4,this.getCorreo());
                sql.setString(5,this.getActividad());
                sql.setString(6,  this.getFecha());
                sql.setString(7,this.getHora());
                sql.setInt(8, this.getID());
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Empleado Modificado");   
                
                       } catch (SQLException e) {
                    
                     JOptionPane.showMessageDialog(null, "ERROR al modificar");
                      System.out.println("no pude registrar porque" +e.getMessage());
            
                 
        }
        
    }
    
    
    
    public void eliminar()
    {
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("DELETE FROM `actaPrestamo` WHERE `ID`=?");
            sql.setInt(1, this.getID());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prestamo Eliminado");  
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR al eliminar ");
            
        }
    }
    
    
    
    public Iterator<Prestamo> buscar(String busqueda)
    {
    ArrayList<Prestamo> losPrestamos = new ArrayList<>();
    
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("SELECT * FROM `actaPrestamo` WHERE `Nombre` LIKE? or Cargo LIKE? OR Cedula LIKE? OR Correo LIKE? OR Actividad LIKE? OR Fecha LIKE? OR Hora LIKE?");
            sql.setString(1, "%"+busqueda+"%");
            sql.setString(2, "%"+busqueda+"%");
            sql.setString(3, "%"+busqueda+"%");
            sql.setString(4, "%"+busqueda+"%");
            sql.setString(5, "%"+busqueda+"%");
            sql.setString(6, "%"+busqueda+"%");
            sql.setString(7, "%"+busqueda+"%");
            
            ResultSet rs = sql.executeQuery();
            Prestamo unPrestamo;
            
            while (rs.next()) {   
                unPrestamo = new Prestamo();
                unPrestamo.setID(rs.getInt("ID"));
                unPrestamo.setNombre(rs.getString("Nombre"));
                unPrestamo.setCargo(rs.getString("Cargo"));
                unPrestamo.setCedula(rs.getString("Cedula"));
                unPrestamo.setCorreo(rs.getString("Correo"));
                unPrestamo.setActividad(rs.getString("Actividad")); 
                unPrestamo.setFecha(rs.getString("Fecha")); 
                unPrestamo.setHora(rs.getString("Hora")); 
                losPrestamos.add(unPrestamo);
                
            }
        } catch (SQLException e) { 
              JOptionPane.showMessageDialog(null, "ERROR al buscar");
        }
    return  losPrestamos.iterator();
    }
    
    //BUSCAR POR EL ID
    public Prestamo buscarPorId(int elID)
    {
    Prestamo unPrestamo = new Prestamo();
    unPrestamo.setNombre("el prestamo no existe");
        try {
            PreparedStatement sql = Conexion.conexion.prepareStatement("SELECT * FROM actaPrestamo WHERE ID=?");
            sql.setInt(1, elID);
            int elId = this.getID();
            ResultSet rs = sql.executeQuery();
            while (rs.next()) {                
               unPrestamo.setID(rs.getInt("ID"));
               unPrestamo.setNombre(rs.getString("Nombre"));
               unPrestamo.setCargo(rs.getString("Cargo"));
               unPrestamo.setCedula(rs.getString("Cedula"));
               unPrestamo.setCorreo(rs.getString("Correo"));
               unPrestamo.setActividad(rs.getString("Actividad"));
               unPrestamo.setFecha(rs.getString("Fecha"));
               unPrestamo.setHora(rs.getString("Hora"));
               
            }
        } catch (SQLException e) {
            System.out.println("no se pudo buscar por el id   "+e.getMessage());
        }
    return unPrestamo;
    } 

}
 
    
    
    

 

