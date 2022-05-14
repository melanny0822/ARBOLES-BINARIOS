
package arboles;

/**
 *
 * @author melan
 */
public class Nodo {
    
     private int dato;
    
    private Nodo Li,Ld;
    
    public Nodo(int dato)
    {
        this.dato = dato;
        Li=null;
        Ld=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getLi() {
        return Li;
    }

    public void setLi(Nodo Li) {
        this.Li = Li;
    }

    public Nodo getLd() {
        return Ld;
    }

    public void setLd(Nodo Ld) {
        this.Ld = Ld;
    }
}
