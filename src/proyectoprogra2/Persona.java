/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author rosbinvasquez
 */
public class Persona {
           /**
            *
            * Atributos persona
            */ 
          private String Nombre;
          private String Cedula;
          private String Apellido1;
          private String Apellido2;
          private String Telefono;

        public Persona(String Nombre, String Cedula, String Apellido1, String Apellido2, String Telefono) {
            /**
            *
            *@param arg Constructores con parametros Persona
            */ 
            this.Nombre = Nombre;
            this.Cedula = Cedula;
            this.Apellido1 = Apellido1;
            this.Apellido2 = Apellido2;
            this.Telefono = Telefono;
        }

        public Persona() {
            /**
            *
            *@param arg Constructores sin parametros Persona
            */ 
            this.Nombre = "";
            this.Cedula = "";
            this.Apellido1 = "";
            this.Apellido2 = "";
            this.Telefono = "";
        }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

   
}
