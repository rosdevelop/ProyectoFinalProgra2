/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jeaus
 */
public class ContextTXTVentaTicket {
    
    
      static String NameTXT = "Venta Ticket.txt";
    
    public static void Guardardatos(ArrayList lista)
    {
        FileWriter fileWriter = null;
        
        try
        {
            
            fileWriter = new FileWriter(NameTXT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
                for (VentaTicket Venta : (ArrayList<VentaTicket>)lista)
                {
                    bufferedWriter.write(Venta.getIdViaje()
                            +","+Venta.getPlacaBus()
                            +","+Venta.getCedulaChofer()
                            +","+Venta.getIdRuta()
                            +","+Venta.getFecha()
                             +","+Venta.getHora()
                            +","+Venta.getCantidadTickets()+"\n");
                          
                    
  

                }
                bufferedWriter.close();
            System.out.println("Este Archivo a sido creado con exito");
        }catch(Exception e)
        {
            System.out.println("Error al guardar los datos de Vesntas de tickets el en txt");
        }
        finally
        {
            if(fileWriter!=null)
            {
                try {
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    
    
    
    
    }
    
    public static ArrayList LeerDatos()
    {
        File file = new File(NameTXT);
        ArrayList listaVentas = new ArrayList();
        
        Scanner scanner;
        
        try {
            
            scanner = new Scanner(file);
            
            while(scanner.hasNextLine())
            {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                VentaTicket ve = new VentaTicket();
                delimitar.useDelimiter("\\s*,\\s*");                                    
                ve.setIdViaje(String.valueOf(delimitar.next()));
                ve.setPlacaBus(String.valueOf(delimitar.next()));
                ve.setCedulaChofer(String.valueOf(delimitar.next()));
                ve.setIdRuta(String.valueOf(delimitar.next()));
                ve.setFecha(String.valueOf(delimitar.next()));
                ve.setHora(String.valueOf(delimitar.next()));
                ve.setCantidadTickets(Integer.parseInt(delimitar.next()));
                listaVentas.add(ve);
            }
            
           
            scanner.close();
            
        } catch (Exception e) 
        {
            System.out.println("A ocurrido un error al traer los de Ventas de tickets.txt \n"
                    + "(Revisar el metodo Leer datos())");
        }
    
    return listaVentas;
    }
    
}
