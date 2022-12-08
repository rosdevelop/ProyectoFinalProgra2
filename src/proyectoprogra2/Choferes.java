/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author rosbinvasquez
 */
public class Choferes extends Persona {
     /*
     *
     * Atributos de Choferes hija de persona
     */
      protected int Experiencia;

    public Choferes(int Experiencia, String Nombre, String Cedula, String Apellido1, String Apellido2, String Telefono) {
        super(Nombre, Cedula, Apellido1, Apellido2, Telefono);
        /*
        *@param arg Constructores con parametros choferes
        */
        this.Experiencia = Experiencia;
    }

    public Choferes(int Experiencia) {
        this.Experiencia = Experiencia;
    }

    public Choferes() {
        /*
        *@param arg Constructores sin parametros choferes
        */
        this.Experiencia = 0;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }
      
      
}
