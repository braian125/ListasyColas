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
        String codDesencolado;
        Nodo p = cabezas[pI].GetLiga();
        cabezas[pI].setLiga(p.GetLiga());
        codDesencolado = p.getCodigo();
        if(p == ultimos[pI]){
            ultimos[pI] = cabezas[pI];
        }
        return codDesencolado;
    }
    public void MostrarCola(int pI) {
        Nodo p = cabezas[pI].GetLiga();
        while (p != null) {
            System.out.println(p.getCodigo() + "\t" + p.getValor() + "\n");
            p = p.GetLiga();
        }
    }
}