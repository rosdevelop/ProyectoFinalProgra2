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
public class ContextTXTGestionRuta {
    
    
    static String NameTXT = "Rutas.txt";
    
    public static void Guardardatos(ArrayList lista)
    {
        FileWriter fileWriter = null;
        
        try
        {
            
            fileWriter = new FileWriter(NameTXT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
                for (GestionRuta Rutas : (ArrayList<GestionRuta>)lista)
                {
                    bufferedWriter.write(Rutas.getId()
                            +","+Rutas.getSalida()
                            +","+Rutas.getLLegada()
                            +","+Rutas.getRuta()
                            +"," +Rutas.getHora()+"\n");
                          
                }
                bufferedWriter.close();
            System.out.println("Este Archivo a sido creado con exito");
        }catch(Exception e)
        {
            System.out.println("Error al guardar los datos de gestion de rutas el en txt");
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
        ArrayList listaRutas = new ArrayList();
        
        Scanner scanner;
        
        try {
            
            scanner = new Scanner(file);
            
            while(scanner.hasNextLine())
            {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                GestionRuta ru = new GestionRuta();
                delimitar.useDelimiter("\\s*,\\s*");
                ru.setId(String.valueOf(delimitar.next()));
                ru.setSalida(String.valueOf(delimitar.next()));
                ru.setLLegada(String.valueOf(delimitar.next()));
                ru.setRuta(String.valueOf(delimitar.next()));
                ru.setHora(String.valueOf(delimitar.next()));
                listaRutas.add(ru);
            }
            scanner.close();
            
        } catch (Exception e) 
        {
            System.out.println("A ocurrido un error al traer los datos de gestion de Rutas.txt \n"
                    + "(Revisar el metodo Leer datos())");
        }
    
    return listaRutas;
    }
    
}

    

