package supermercado;

/**
 * @author Brian Vanegas
 */
public class Nodo {
    private String codigo;
    private double valor;
    private Nodo liga;

    public Nodo(String pCodigo, double pValor)
    {
        codigo = pCodigo;
        valor = pValor;
        liga = null;
    }

    public void setCodigo(String pCodigo) {
        codigo = pCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setValor(double pValor) {
        valor = pValor;
    }

    public double getValor() {
        return valor;
    }

    public void setLiga(Nodo pLiga) {
        liga = pLiga;
    }

    public Nodo GetLiga() {
        return liga;
    }
}