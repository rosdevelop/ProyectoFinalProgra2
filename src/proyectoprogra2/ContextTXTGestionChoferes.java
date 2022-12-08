package proyectoprogra2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeaus
 */
public class ContextTXTGestionChoferes {
    
    static String NameTXT = "Choferes.txt";
    
    public static void GuardarDatos(ArrayList lista)
    {
        FileWriter fileWriter = null;
        
        try
        {
            
            fileWriter = new FileWriter(NameTXT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
                for (Choferes choferes : (ArrayList<Choferes>)lista)
                {
            bufferedWriter.write(choferes.getNombre()
                            +","+choferes.getCedula()
                            +","+choferes.getApellido1()
                            +","+choferes.getApellido2()
                            +","+choferes.getTelefono()
                            +","+choferes.getExperiencia()+"\n");
            
            
                }
                bufferedWriter.close();
            System.out.println("Este Archivo a sido creado con exito");
        }catch(Exception e)
        {
            System.out.println("Error al guardar los datos de choferes el en txt");
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
        ArrayList listaChoferes = new ArrayList();
        
        Scanner scanner;
        
        try {
            
            scanner = new Scanner(file);
            
            while(scanner.hasNextLine())
            {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                Choferes ch = new Choferes();
                delimitar.useDelimiter("\\s*,\\s*");
                ch.setNombre(String.valueOf(delimitar.next()));
                ch.setCedula(String.valueOf(delimitar.next()));
                ch.setApellido1(String.valueOf(delimitar.next()));
                ch.setApellido2(String.valueOf(delimitar.next()));
                ch.setTelefono(String.valueOf(delimitar.next()));
                ch.setExperiencia(Integer.parseInt(delimitar.next()));
                listaChoferes.add(ch);
            }
            scanner.close();
            
        } catch (Exception e) 
        {
            System.out.println("A ocurrido un error al traer los datos de Choferes.txt \n"
                    + "(Revisar el metodo Leer Datos())");
        }
    
    return listaChoferes;
    
}
}
