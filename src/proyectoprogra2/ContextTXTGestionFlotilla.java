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
public class ContextTXTGestionFlotilla {
    
    static String NameTXT = "Flotilla.txt";
    
    public static void Guardardatos(ArrayList lista)
    {
        FileWriter fileWriter = null;
        
        try
        {
            
            fileWriter = new FileWriter(NameTXT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
                for (GestionFlotilla flotilla : (ArrayList<GestionFlotilla>)lista)
                {
                    bufferedWriter.write(flotilla.getPlaca()
                            +","+flotilla.getCantidadPasajeros()
                            +","+flotilla.getNombreBus()
                            +","+flotilla.getVidaUtil()+"\n");
                          
                }
                bufferedWriter.close();
            System.out.println("Este Archivo a sido creado con exito");
        }catch(Exception e)
        {
            System.out.println("Error al guardar los datos de gestion de flotilla el en txt");
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
        ArrayList listaFlotilla = new ArrayList();
        
        Scanner scanner;
        
        try {
            
            scanner = new Scanner(file);
            
            while(scanner.hasNextLine())
            {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                GestionFlotilla fl = new GestionFlotilla();
                delimitar.useDelimiter("\\s*,\\s*");
                fl.setPlaca(String.valueOf(delimitar.next()));
                fl.setCantidadPasajeros(String.valueOf(delimitar.next()));
                fl.setNombreBus(String.valueOf(delimitar.next()));
                fl.setVidaUtil(Integer.parseInt(delimitar.next()));
                listaFlotilla.add(fl);
            }
            scanner.close();
            
        } catch (Exception e) 
        {
            System.out.println("A ocurrido un error al traer los datos de gestion de flotilla.txt \n"
                    + "(Revisar el metodo Leer datos())");
        }
    
    return listaFlotilla;
    }
    
}

    

