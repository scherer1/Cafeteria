/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import bebida.Bebida;

/**
 *
 * @author UTFPR
 */
public class Chantily extends Decorator {

    private final Bebida b;

    public Chantily(Bebida b) {
        this.b = b;
    }

    @Override
    public String getNome() {
        return b.getNome() +", com chantily";
    }

    @Override
    public float custo() {
        return b.custo() + 0.25f;
    }

}
