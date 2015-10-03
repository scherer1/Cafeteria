package decoratorLanche;

import lanche.Lanche;
import lanche.Xcalabresa;

/**
 */
public class Calabresa extends Decorator {

    Lanche x;

    public Calabresa(Lanche x) {
        this.x = x;
    }

    @Override
    public String getNome() {
        if (x instanceof Xcalabresa) {
            return (this.x.getNome() + ", com mais Calabresa");
        } else {
            return (this.x.getNome() + ", com Calabresa");
        }
    }

    @Override
    public double custo() {
        return (this.x.custo() + 1.5);
    }

}
