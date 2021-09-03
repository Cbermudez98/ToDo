/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Auxiliar
 */
public class LoginController {

    public static ArrayList list;

    public static User Login(String user, String password) throws ClassNotFoundException, SQLException {
        User us = null;
        PreparedStatement prs = null;
        ResultSet rs = null;
        try {
            DataBaseController db = new DataBaseController();
            db.con();

            prs = db.conexion.prepareStatement("select id,user,password from user where user = ? and password = ?");
            prs.setString(1, user.trim());
            prs.setString(2, password.trim());
            System.out.println(prs);
            rs = prs.executeQuery();
            while (rs.next()) {
                System.out.println("Tiene dato");
                us = Load(rs);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }

            if (prs != null) {
                rs.close();
            }
            return us;
        }

    }

    public static User Load(ResultSet rs) throws SQLException {
        User user = new User();
        System.out.println("Entro load");
        user.setId(rs.getInt(1));
        user.setUser(rs.getString(2));
        user.setName(rs.getString(3));

        return user;
    }

    public static void saveUser(String user, String name, String lastName, String email, String phone, int age, int question, String answer, String password) throws SQLException, ClassNotFoundException {
        PreparedStatement pst = null;

        DataBaseController db = new DataBaseController();
        db.con();

        pst = db.conexion.prepareStatement("INSERT INTO user VALUES(null,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, user);
        pst.setString(2, name);
        pst.setString(3, lastName);
        pst.setString(4, email);
        pst.setString(5, phone);
        pst.setInt(6, age);
        pst.setInt(7, question);
        pst.setString(8, answer);
        pst.setString(9, password);
        pst.executeUpdate();
    }

    public static ArrayList combo() throws ClassNotFoundException {
        PreparedStatement prs = null;
        ResultSet rs = null;
        ArrayList arr = new ArrayList();
        DataBaseController db = new DataBaseController();
        try {
            db.con();
            prs = db.conexion.prepareStatement("select question from questions;");
            rs = prs.executeQuery();
            while (rs.next()) {
                arr.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
}
