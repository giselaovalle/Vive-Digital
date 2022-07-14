
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author KIM YISO
 */
public class Conexion {
    public static Connection conexion;
    public Statement sentencia;


    
    public Conexion() {
     
          try {
        String driverDB = "com.mysql.jdbc.Driver";
        String urlDB= "jdbc:mysql://localhost:3306/vive digital";
        String userDB="root";
        String claveDB="";
            Class.forName(driverDB);
            conexion=(Connection) DriverManager.getConnection(urlDB, userDB,claveDB);
            sentencia = conexion.createStatement();
            JOptionPane.showMessageDialog(null, "Bienvenido a Vive Digital");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "no encuentro el  driver");
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "NO puedo conectarme");
            
        
        }
    }
    
    
    public static void desconectar()
    {
        try {
            conexion.close();
            JOptionPane.showMessageDialog(null, "La conexion ha Finalizado");
        } catch (SQLException ex) {
            System.err.println("ha ocurrido un error y no se ha desconectado"+ex.getMessage());
        }
    }
    
  
public static Conexion getInstance(){
    return ConexionHolder.INSTANCE;
}

  
private static class ConexionHolder{
       private static final Conexion INSTANCE=new Conexion();
   }
 
     
     
    }


