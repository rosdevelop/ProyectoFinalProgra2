/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author rosbinvasquez
 */
public class GestionViajes {
       /**
        *
        *@param arg Atributos Gestion Viajes
        */ 
    private String IdViaje;
    private String PlacaBus;
    private String CedulaChofer;
    private String IdRuta;
    private String Fecha;
    private String Hora; 

    public GestionViajes(String IdViaje, String PlacaBus, String CedulaChofer, String IdRuta, String Fecha, String Hora) {
        this.IdViaje = IdViaje;
        this.PlacaBus = PlacaBus;
        this.CedulaChofer = CedulaChofer;
        this.IdRuta = IdRuta;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public GestionViajes() {
        this.IdViaje = "";
        this.PlacaBus = "";
        this.CedulaChofer = "";
        this.IdRuta = "";
        this.Fecha = "";
        this.Hora = "";
    }

    public String getIdViaje() {
        return IdViaje;
    }

    public void setIdViaje(String IdViaje) {
        this.IdViaje = IdViaje;
    }

    public String getPlacaBus() {
        return PlacaBus;
    }

    public void setPlacaBus(String PlacaBus) {
        this.PlacaBus = PlacaBus;
    }

    public String getCedulaChofer() {
        return CedulaChofer;
    }

    public void setCedulaChofer(String CedulaChofer) {
        this.CedulaChofer = CedulaChofer;
    }

    public String getIdRuta() {
        return IdRuta;
    }

    public void setIdRuta(String IdRuta) {
        this.IdRuta = IdRuta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    
    
    
    
}
