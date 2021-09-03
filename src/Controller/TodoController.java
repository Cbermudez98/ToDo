/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Auxiliar
 */
public class TodoController {
    public static ArrayList LoadTodo(){
        PreparedStatement pst = null;
        ResultSet rs = null;
        DataBaseController bd = new DataBaseController();
        ArrayList arr = new ArrayList();
        try {
            bd.con();
            
            pst = bd.conexion.prepareStatement("select * from todo");
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                
            }
            
        } catch (Exception e) {
        }
        return arr;
    }
}
