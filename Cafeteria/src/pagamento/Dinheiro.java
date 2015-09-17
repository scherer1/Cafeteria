/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

/**
 *
 * @author Fabio
 */
public class Dinheiro implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Recebendo dinehrio");
        System.out.println("contando cedulas;;;");
        System.out.println("passando a canetinha...");
        System.out.println("confirmando pagamento");
    }
}
