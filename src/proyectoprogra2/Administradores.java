/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author rosbinvasquez
 */
public class Administradores extends Persona{
            /**
            *
            * Atributos y contiene herencia de persona
            */ 
         protected String Usuario;
         protected String Contrasena;
         protected String Correo;

    public Administradores(String Usuario, String Contrasena, String Correo, String Nombre, String Cedula, String Apellido1, String Apellido2, String Telefono) {
        super(Nombre, Cedula, Apellido1, Apellido2, Telefono);
            /**
            *
            *@param arg Contructores con parametros Administradores
            */ 
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Correo = Correo;
    }

    public Administradores(String Usuario, String Contrasena, String Correo) {
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Correo = Correo;
    }

    public Administradores() {
        /**
        *
        *@param arg Contructores sin parametros Administradores
        */ 
        this.Usuario = "";
        this.Contrasena = "";
        this.Correo = "";
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
          
         
}
