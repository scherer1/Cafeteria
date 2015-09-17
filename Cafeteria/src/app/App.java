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
import pagamento.Dinheiro;
import pagamento.Pagamento;
import pedido.Pedido;

/**
 *
 * @author UTFPR
 */
public class App {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        cafe = new Chantily(cafe);
        Pedido p = new Pedido();
        Pagamento pagamento = new Dinheiro();
        p.addItem(cafe);
        
        System.out.println("--> Fechando o pedido");
        p.fecharPedido();
        System.out.println("Valor toal do pedido: " + p.valorTotal());   
        p.addItem(cafe);
        System.out.println("Abrindo o pedido novamente:");
        p.abrirPedido();
        p.addItem(cafe);
        p.fecharPedido();
        p.pagar(pagamento);
    }
}
