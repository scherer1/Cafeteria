/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import bebida.Bebida;
import pagamento.Pagamento;
import pedido.*;

/**
 *
 * @author Fabio
 */
public class Aberto extends Status {

    Pedido p;

    public Aberto(Pedido p) {
        this.p = p;
    }


    @Override
    public void addItem(Bebida b) {
        System.out.println("Adicionando ao seu pedido "+b.getNome());
        p.getBebidas().add(b);
    }
    @Override
    public void fecharPedido() {
    System.out.println("Ok, vamos lá, fecharemos o seu pedido");
    p.setEstado(new Fechado(p));
    
    }

    @Override
    public void abrirPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pagar(Pagamento p) {
        System.out.println("seu pedido esta em aberto");}

}
