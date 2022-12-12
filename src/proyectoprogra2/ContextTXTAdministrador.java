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
 * @author rosbinvasquez
 */
public class ContextTXTAdministrador {
    
    static String NameTXT = "Administrador.txt";
    
      public static void GuardarDatos(ArrayList lista)
    {
        FileWriter fileWriter = null;
        
        try
        {
            
            fileWriter = new FileWriter(NameTXT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
                for (Administrador administrador : (ArrayList<Administrador>)lista)
                {
                    bufferedWriter.write(administrador.getUsuario()
                            +","+administrador.getContrasena ()
                            +","+administrador.getCorreo()+"\n");
                }
                bufferedWriter.close();
            System.out.println("Este Archivo a sido creado con exito");
        }catch(Exception e)
        {
            System.out.println("Error al guardar los datos de administradores el en txt");
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
        ArrayList listaAdministradores = new ArrayList();
        
        Scanner scanner;
        
        try {
            
            
            scanner = new Scanner(file);
            
            while(scanner.hasNextLine())
            {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                Administrador Ad = new Administrador();
                delimitar.useDelimiter("\\s*,\\s*");
                Ad.setUsuario(String.valueOf(delimitar.next()));
                Ad.setContrasena(String.valueOf(delimitar.next()));
                Ad.setCorreo(String.valueOf(delimitar.next()));
                
               listaAdministradores.add(Ad);
            }
            scanner.close();
            
        } catch (Exception e) 
        {
            System.out.println(" A ocurrido un error al traer los datos de administradores.txt \n"
                    + "(Revisar el metodo Leer Datos())");
        }
    
    return listaAdministradores;
    
}
}
