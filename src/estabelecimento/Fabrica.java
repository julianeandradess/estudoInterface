package estabelecimento;

import copia.Copiadora;
import digita.Digitalizadora;
import equipaMulti.EquipamentoMulti;
import impresso.Deskjet;
import impresso.Impressora;
import impresso.Laserjet;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMulti em = new EquipamentoMulti();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir(); //esse imprimir é o metodo.
        copiadora.copiar();
        digitalizadora.digitalizar();
    }

    
}
