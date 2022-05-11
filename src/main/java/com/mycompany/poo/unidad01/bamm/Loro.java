/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.unidad01.bamm;

/**
 *
 * @author USER
 */
public class Loro {

    private int numerosPalabras;

    public Loro(int numerosPalabras) {
        this.numerosPalabras = numerosPalabras;
    }
    
    public boolean tieneAmplioVocabulario(int palabrasMaximas){
     
            var retorno = true;
            if(this.numerosPalabras >= palabrasMaximas);
            return false;
    }

    public int getNumerosPalabras() {
        return numerosPalabras;
    }

    public void setNumerosPalabras(int numerosPalabras) {
        this.numerosPalabras = numerosPalabras;
    }
    
    
}
