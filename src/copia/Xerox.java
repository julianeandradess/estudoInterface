package copia; 
public class Xerox implements Copiadora{
    public void copiar() {
        System.out.println("COPIANDO");
        
    }
    
}
/* antes era extends porque extendia, agora ela implementa porque virou inteface.
 * precisa clicar no override
 */