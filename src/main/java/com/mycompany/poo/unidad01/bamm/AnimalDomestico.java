/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.unidad01.bamm;

/**
 *
 * @author USER
 */
public class AnimalDomestico extends Animal {
    
     private String propietario;

    public AnimalDomestico(String propietario) {
        this.propietario = propietario;
    }

    public String convertirEnMayusculas() {
        var retorno = "IBD";
        System.out.println(retorno.toUpperCase());
        return retorno;
    }
    
    
    //Getters & Setters
    
    
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
