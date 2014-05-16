/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ejb.Stateless;

/**
 *
 * @author dt3mfa
 */
@Stateless
public class modelousuario {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    static Connection mySqlConn = null;
    static ResultSet mySqlRs = null;
    static Statement mySqlStm = null;
    static String mySqlQuery = null;
    private String idUsuario;
    private String nombreUsuario;
    private String apellidosUsuario;
    private String correoUsuario;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    
    public void consultarusuario(){
        try{
            mySqlQuery = "SELECT nombre, apellidos, correo";
        mySqlQuery += "FROM usuarios WHERE idusuario = '" + idUsuario + "'";
        mySqlConn = conexionmysql.Conexion();
        mySqlStm = mySqlConn.createStatement();
        mySqlRs = mySqlStm.executeQuery(mySqlQuery);
        while(mySqlRs.next()){
            setNombreUsuario(mySqlRs.getString("nombre"));
            setApellidosUsuario(mySqlRs.getString("apellidos"));
            setCorreoUsuario(mySqlRs.getString("correo"));
        }
        mySqlConn.close();
        } catch (SQLException ex) {
        
    }
  }
}
