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
public abstract class Decorator extends Bebida{
    @Override
    public abstract String getNome();
}
