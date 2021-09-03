/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Auxiliar
 */
public class DataBaseController {

    public static Connection conexion;
    public static String usuario = "root";
    public static String contrasena = "123456789";
    public static String driver = "com.mysql.jdbc.Driver";
    public static String server = "localhost";

    public static String puerto = "3307";
    public static String basedatos = "todolist";
    public static String rutaCompleta = "jdbc:mysql://" + server + ":" + puerto + "/" + basedatos + "";
    public static DataBaseController instancia;

    public static Connection con() throws ClassNotFoundException, SQLException {
        if (conexion == null) {
            try {
                Class.forName(driver);
                conexion = DriverManager.getConnection(rutaCompleta,usuario,contrasena);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        
        return conexion;
    }
    
    
    public static void cerrar() throws SQLException{
        if(conexion != null){
            conexion.close();
        }
    }
}
