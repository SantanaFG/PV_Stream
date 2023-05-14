/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pv_stream;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Persona {
    private String name;
    private String firstLastName;
    private String secondLastName;
    static ArrayList<Persona> lista = new ArrayList<Persona>();
    
    public Persona() {
    }

    public Persona(String name, String firstLastName, String secondLastName) {
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }
    
}
