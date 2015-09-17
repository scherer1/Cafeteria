/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import bebida.Bebida;
import java.util.ArrayList;
import pagamento.Pagamento;
import state.Aberto;

/**
 *
 * @author Fabio
 */
public class Pedido {

    ArrayList<Bebida> bebidas;
    private Status estado;

    public void pagar(Pagamento p){
        estado.pagar(p);
    }
    public void abrirPedido() {
    estado.abrirPedido();
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;

    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public Status getEstado() {
        return estado;
    }

    public Pedido() {
        this.bebidas = new ArrayList();
        this.estado = new Aberto(this);
    }

    public void fecharPedido() {
        estado.fecharPedido();
    }

    public void addItem(Bebida b) {
        estado.addItem(b);
    }

    public float valorTotal() {
        float total = 0;
        for (Bebida bebida : bebidas) {
            total += bebida.custo();
        }
        return total;

    }

}
