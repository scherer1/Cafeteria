/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import bebida.Bebida;
import pagamento.Pagamento;

/**
 *
 * @author Fabio
 */
public abstract class Status {

    public abstract void addItem(Bebida b);
    public abstract void fecharPedido();
    public abstract void abrirPedido();
    public abstract void pagar(Pagamento p);

   
}
