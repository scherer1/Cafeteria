/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import bebida.Bebida;
import bebida.Cafe;
import decorator.Canela;
import decorator.Chantily;

/**
 *
 * @author UTFPR
 */
public class App {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        System.out.println("dados do cafe: ");
        System.out.println("Nome: " + cafe.getNome());
        System.out.println("Custo: " + cafe.custo());
        
        System.out.println("++ Adicionado um condimento ++");
        cafe = new Chantily(cafe);
        System.out.println("NOvos dados do cafe: ");
        System.out.println("Nome: " + cafe.getNome());
        System.out.println("Custo: " + cafe.custo());
        
        System.out.println("++ Adicionado outro condimento ++");
        cafe = new Canela(cafe);
        System.out.println("NOvos dados do cafe: ");
        System.out.println("Nome: " + cafe.getNome());
        System.out.println("Custo: " + cafe.custo());
        
        
    }
}
