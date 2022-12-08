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
    
    
    
}
