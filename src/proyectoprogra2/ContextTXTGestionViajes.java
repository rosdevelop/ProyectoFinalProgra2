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
public class ContextTXTGestionViajes{
    
    
    static String NameTXT = "Viajes.txt";
    
    public static void GuarDatos(ArrayList lista)
    {
        FileWriter fileWriter = null;
        
        try
        {
            
            fileWriter = new FileWriter(NameTXT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
                for (GestionViajes Viajes : (ArrayList<GestionViajes>)lista)
                {
                    bufferedWriter.write(Viajes.getIdViaje()
                            +","+Viajes.getPlacaBus()
                            +","+Viajes.getCedulaChofer()
                            +","+Viajes.getIdRuta()
                            +","+Viajes.getFecha()
                            +"," +Viajes.getHora()+"\n");
                          
                    
  

                }
                bufferedWriter.close();
            System.out.println("Este Archivo a sido creado con exito");
        }catch(Exception e)
        {
            System.out.println("Error al guardar los datos de gestion de Viajes el en txt");
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
        ArrayList listaViajes = new ArrayList();
        
        Scanner scanner;
        
        try {
            
            scanner = new Scanner(file);
            
            while(scanner.hasNextLine())
            {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                GestionViajes vi = new GestionViajes();
                delimitar.useDelimiter("\\s*,\\s*");                                    
                vi.setIdViaje(String.valueOf(delimitar.next()));
                vi.setPlacaBus(String.valueOf(delimitar.next()));
                vi.setCedulaChofer(String.valueOf(delimitar.next()));
                vi.setIdRuta(String.valueOf(delimitar.next()));
                vi.setFecha(String.valueOf(delimitar.next()));
                vi.setHora(String.valueOf(delimitar.next()));
                listaViajes.add(vi);
            }
            
           
            scanner.close();
            
        } catch (Exception e) 
        {
            System.out.println("A ocurrido un error al traer los datos de gestion de Viajes.txt \n"
                    + "(Revisar el metodo Leer datos())");
        }
    
    return listaViajes;
    }
    
    
}
