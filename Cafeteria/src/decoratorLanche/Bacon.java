package decoratorLanche;

import lanche.Lanche;
import lanche.Xbacon;


/**
 */
public class Bacon extends Decorator {
    Lanche x;
    public Bacon(Lanche x){
        this.x=x;
    }
    @Override
    public double custo() {
        return (x.custo()+1.5);
    }

    @Override
    public String getNome() {
        if(x instanceof Xbacon){return (this.x.getNome()+", com mais Bacon");}
        else return (this.x.getNome()+", com Bacon");
    }

}

