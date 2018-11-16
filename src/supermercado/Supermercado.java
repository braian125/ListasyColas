package supermercado;

import javax.swing.JOptionPane;

/**
 * @author Brian Vanegas
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListaLigada objColas = new ListaLigada(n);
        do
        {
            System.out.println("\n");
            do
            {
                colaIndicada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de la cola (-1 para salir):"));
            }
            while(colaIndicada != -1 || colaIndicada > n-1);
            if(colaIndicada != -1)
            {
                do
                {
                    opc = Menu(colaIndicada);
                    System.out.println("\n");
                    switch (opc) {
                        case '1':

                            break;
                        case '3':
                            if(objColas.ColaVacia(colaIndicada)) {
                                System.out.println("La cola #"+ colaIndicada +" está vacía");
                            } else {
                                objColas.MostrarCola(colaIndicada);
                            }
                            break;
                        case '4':
                            System.out.println("El acumulado de la cola #"+ colaIndicada +" es $"+objColas.getAcumulado(colaIndicada));
                            break;
                        case '5':
                            //salir
                            break;
                        default:
                            break;
                    }
                }while(opc != '5');
            }
        }
        while(colaIndicada != -1);
    }

    static char Menu(int pI)
    {
        char opcion;
        do{
            opcion = JOptionPane.showInputDialog(null, "1. Encolar\n2. Desencolar\n3. Mostrar Cola\n4. Mostrar Acumulado\n5. Salir");
        }
        while(opcion < '1' || opcion > '5');
        return opcion;
    }
}