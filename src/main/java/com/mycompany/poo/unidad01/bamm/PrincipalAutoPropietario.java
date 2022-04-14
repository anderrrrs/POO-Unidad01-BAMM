/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.unidad01.bamm;

/**
 *
 * @author USER
 */
public class PrincipalAutoPropietario {
    public static void main(String[] args){
    
        var auto = new Auto();
        auto.color = "amarillo";
        auto.marca = "chevrolet";
        auto.year = 2017;
        auto.placa = "ABF8592";
        auto.precio = 12000;
        var propietario = new Propietario();
        propietario.nombre = "juan";
        propietario.direccion = "ricaurte";
        propietario.telefono = "0988094034";
        auto.unPropietario=propietario;
        System.out.println("PLACA: "+auto.placa+" es: "+auto.unPropietario.nombre);
    }    
}
