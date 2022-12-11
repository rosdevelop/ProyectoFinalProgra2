/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author rosbinvasquez
 */
public class GestionRuta {
        /**
        *
        * Atributos Gestion rutas
        */ 
        private String Id;
        private String Salida;
        private String LLegada;
        private String Ruta;
        private String Hora;

    public GestionRuta(String Id, String Salida, String LLegada, String Ruta, String Hora) {
        /**
        *
        *@param arg Constructores con parametros Gestion rutas
        */ 
        this.Id = Id;
        this.Salida = Salida;
        this.LLegada = LLegada;
        this.Ruta = Ruta;
        this.Hora = Hora;
    }

    public GestionRuta() {
        /**
        *
        *@param arg Constructores sin parametros Gestion rutas
        */ 
        this.Id = "";
        this.Salida = "";
        this.LLegada = "";
        this.Ruta = "";
        this.Hora = "";
    }
    /**
     * creacion de get y set
     *
     * 
     * @return 
     */
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getSalida() {
        return Salida;
    }

    public void setSalida(String Salida) {
        this.Salida = Salida;
    }

    public String getLLegada() {
        return LLegada;
    }

    public void setLLegada(String LLegada) {
        this.LLegada = LLegada;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    
    
    
    
}
