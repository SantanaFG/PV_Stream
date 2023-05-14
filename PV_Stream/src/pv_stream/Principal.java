/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pv_stream;

import java.io.*;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.dynalink.linker.support.Guards;

/**
 *
 * @author DELL
 */
public class Principal {
    
    static ArrayList<Persona> lista = new ArrayList<Persona>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
          cargar("src/pv_stream/archivo.txt");
//        Persona person1 = new Persona("Carlos","Oleas","Santana");
//        Persona person2 = new Persona("Juan","Orellana","Saltos");
//        Persona person3 = new Persona("Jose", "Pesantes", "Mejia");
//        ArrayList<Persona> arrayPerson = new ArrayList<Persona>();
//        arrayPerson.add(person1);
//        arrayPerson.add(person2);
//        arrayPerson.add(person3);
//        
//        Persona filterPerson = lista.stream().filter(elemento->elemento.getName().equalsIgnoreCase("Jose")).findFirst().get();
//        System.out.println(filterPerson.getName());
        
    }
    public static void cargar(String direccion) throws IOException{
        try {
            BufferedReader leer = new BufferedReader(new FileReader(direccion));
            String llenar;
            String[] datos;
            Persona per = new Persona();
            while((llenar=leer.readLine())!= null){
                datos= llenar.split(" ");
                per.setName(datos[0]);
                per.setFirstLastName(datos[1]);
                per.setSecondLastName(datos[2]);
                lista.add(per);
                System.out.println(leer.readLine());
            }            
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        }        
    }
    
}
