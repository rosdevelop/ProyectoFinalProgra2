/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author rosbinvasquez
 */
public class Administrador extends Persona{
            /**
            *
            * Atributos y contiene herencia de persona
            */ 
         protected String Usuario;
         protected String Contraseña;
         protected String Correo;

    public Administrador(String Usuario, String Contraseña, String Correo, String Nombre, String Cedula, String Apellido1, String Apellido2, String Telefono) {
        super(Nombre, Cedula, Apellido1, Apellido2, Telefono);
            /**
            *
            *@param arg Contructores con parametros Administradores
            */ 
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Correo = Correo;
    }

    public Administrador(String Usuario, String Contrasena, String Correo) {
        this.Usuario = Usuario;
        this.Contraseña = Contrasena;
        this.Correo = Correo;
    }

    public Administrador() {
        /**
        *
        *@param arg Contructores sin parametros Administradores
        */ 
        this.Usuario = "";
        this.Contraseña = "";
        this.Correo = "";
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contrasena) {
        this.Contraseña = Contrasena;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
          
         
}
