package decoratorLanche;


import lanche.Lanche;
import lanche.Xsalada;

/**
 */
public class Salada extends Decorator {
    Lanche x;

    public Salada(Lanche x) {
        this.x = x;
    }

    @Override
    public String getNome() {
        if(x instanceof Xsalada){return (this.x.getNome()+", com mais Salada");}
        else return (this.x.getNome()+", com Salada");
    }

    @Override
    public double custo() {
        return (this.x.custo()+0.50);
    }

}

