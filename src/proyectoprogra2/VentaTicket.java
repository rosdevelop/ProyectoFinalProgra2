/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author rosbinvasquez
 */
public class VentaTicket extends  GestionViajes{
    
    protected String CantidadTickets;

    public VentaTicket(String CantidadTickets, String IdViaje, String PlacaBus, String CedulaChofer, String IdRuta, String Fecha, String Hora) {
        super(IdViaje, PlacaBus, CedulaChofer, IdRuta, Fecha, Hora);
        /*
        * @param arg Constructores con parametros VentaTicket con sus atributos heredados de Gestion Viajes
        */
        this.CantidadTickets = CantidadTickets;
    }

    public VentaTicket(String CantidadTickets) {
        this.CantidadTickets = CantidadTickets;
    }

    public VentaTicket() {
        /*
        * @param arg Constructores con parametros VentaTicket 
        */
        this.CantidadTickets = "";
    }

    public String getCantidadTickets() {
        return CantidadTickets;
    }

    public void setCantidadTickets(String CantidadTickets) {
        this.CantidadTickets = CantidadTickets;
    }
    
    
}
