/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.unidad01.bamm;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PrincipalScanner {
    
    public static void main(String[] args){
        
          /* var numero = 0;
            
            while(numero<10){
                      
            System.out.println("Ingrese un Numero: ");

            numero = (new Scanner(System.in)).nextInt();
    }
            System.out.println(numero);
            */
            var numeroList = new int[7];
            var i = 0;
            
            while(i==7){
                numeroList[i] = (new Scanner(System.in)).nextInt();
                System.out.println(numeroList[i]);
                i++; //i = i + 1
            }
            
            var textoList = new String[5];
            i = 0;
            do{
                textoList[i] =(new Scanner(System.in)).next();
                System.out.println(textoList[i]);
                i++;
            }while(i<5);


    }
}
