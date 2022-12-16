/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author rosbinvasquez
 */
public class GestionFlotilla {
    /**
    *
    * Atributos Gestion Flotilla
    */ 
    private String Placa;
    private String CantidadPasajeros;
    private String NombreBus;
    private String VidaUtil;

    public GestionFlotilla(String Placa, String CantidadPasajeros, String NombreBus, String VidaUtil) {
        /**
        *
        *@param arg Contructores con parametros flotilla
        */ 
        this.Placa = Placa;
        this.CantidadPasajeros = CantidadPasajeros;
        this.NombreBus = NombreBus;
        this.VidaUtil = VidaUtil;
    }

    public GestionFlotilla() {
        /**
        *
        *@param arg Contructores sin parametros flotilla
        */ 
        this.Placa = "";
        this.CantidadPasajeros = "";
        this.NombreBus = "";
        this.VidaUtil = "";
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(String CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public String getNombreBus() {
        return NombreBus;
    }

    public void setNombreBus(String NombreBus) {
        this.NombreBus = NombreBus;
    }

    public String getVidaUtil() {
        return VidaUtil;
    }

    public void setVidaUtil(String VidaUtil) {
        this.VidaUtil = VidaUtil;
    }
        
}
