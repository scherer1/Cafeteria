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
public class CartaoDeCredito implements Pagamento{

    @Override
    public void pagar() {
        System.out.println("Inserindo o cartão..");
        System.out.println("Digitando valor...");
        System.out.println("Digitando a senha...");
        System.out.println("Autorizando a transação...");
        System.out.println("Pagamento confirmado");
    }
    
}
