/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import bebida.Bebida;
import pagamento.Pagamento;
import pedido.Pedido;
import pedido.Status;

/**
 *
 * @author Fabio
 */
public class Fechado extends Status {

    private Pedido p;
    Pagamento pgto;

    public Fechado(Pedido p) {
        this.p = p;
    }
    
    @Override
    public void addItem(Bebida b) {
        System.out.println("Seu pedido foi fechado."
                + "\n não é possivel adiconar mais nada");
    }

    public void fecharPedido() {    
        System.out.println("Este pedido ja foi fechado, "
                + "\nvocê não pode fecha-lo novamente");
    
    }

    @Override
    public void abrirPedido() {
        System.out.println(" ok, vamos reabrir o seu pedido..");
        p.setEstado(new Aberto(p));
    }

    @Override
    public void pagar(Pagamento p) {
        pgto = p;
        pgto.pagar();
        
    }

}
