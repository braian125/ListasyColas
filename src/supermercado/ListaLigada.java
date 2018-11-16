package supermercado;

/**
 * @author Brian Vanegas
 */
public class ListaLigada
{
    private Nodo[] cabezas, ultimos;
    private double[] acumulados;
    private int numColas;

    public ListaLigada(int pNumColas)
    {
        numColas = pNumColas;

        cabezas = new Nodo[numColas];
        ultimos = new Nodo[numColas];
        acumulados = new double[numColas];

        for(int i=0; i<numColas; i++)
        {
            cabezas[i] = new Nodo("", 0.0);
            ultimos[i] = cabezas[i];
            acumulados[i] = 0.0;
        }
    }

    public boolean ColaVacia(int pI)
    {
        return (cabezas[pI].GetLiga() == null);
    }

    public double GetAcumulado(int pI)
    {
        return acumulados[pI];
    }

    public void Encolar(int pI, String pCodigo, double pValor)
    {
        Nodo p = new Nodo(pCodigo, pValor);
        ultimos[pI].setLiga(p);
        ultimos[pI] = p;
        acumulados[pI] += p.getValor();
    }

    public String Desencolar(int pI)
    {
        //String c
    }


    /*public void MostrarCola() {

    }*/
}