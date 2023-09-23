package equipaMulti;

import copia.Copiadora;
import digita.Digitalizadora;
import impresso.Impressora;

public class EquipamentoMulti implements Copiadora, Digitalizadora, Impressora{

    public void copiar() {   
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL"); 
    }

    
    public void digitalizar() {  
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    
    public void imprimir() {     
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}
