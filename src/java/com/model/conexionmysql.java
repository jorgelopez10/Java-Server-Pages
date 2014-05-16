/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dt3mfa
 */
public class conexionmysql {
    
    static String server = "jdbc:mysql://localhost:8282/jsp";
    static String login = "root";
    static String pass = "dt3.dm.dfa";
    
    public static Connection Conexion() throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection mysql = (Connection) DriverManager.getConnection(server, login, pass);
            return mysql;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
}
