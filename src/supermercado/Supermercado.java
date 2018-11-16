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
        int n;
        int colaIndicada;
        char opc;
        String aCod;
        double aVC;

        do
        {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de colas a procesar", "Entrada"));
        }
        while(n < 0);

        ListaLigada objColas = new ListaLigada(n);
        do
        {
            System.out.println("\n");
            do
            {
                colaIndicada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de la cola (-1 para salir):"));
            }
            while(colaIndicada < -1 || colaIndicada > n-1);
            if(colaIndicada != -1)
            {
                do
                {
                    opc = Menu(colaIndicada);
                    System.out.println("\n");
                    switch (opc) {
                        case '1':
                            //Encolar
                            aCod = JOptionPane.showInputDialog(null, "Ingrese código:", "Entrada", JOptionPane.INFORMATION_MESSAGE);
                            aVC = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese valor compra", "Entrada", JOptionPane.INFORMATION_MESSAGE));
                            objColas.Encolar(colaIndicada, aCod, aVC);
                            break;
                        case '2':
                            //Desencolar
                            if(!objColas.ColaVacia(colaIndicada)) {
                                JOptionPane.showInputDialog(null, "El codigo desencolado es "+objColas.Desencolar(colaIndicada));
                            }
                            break;
                        case '3':
                            if(objColas.ColaVacia(colaIndicada)) {
                                System.out.println("La cola #"+ colaIndicada +" está vacía");
                            } else {
                                objColas.MostrarCola(colaIndicada);
                            }
                            break;
                        case '4':
                            //Mostrar Cola
                            System.out.println("El acumulado de la cola #"+ colaIndicada +" es $"+objColas.GetAcumulado(colaIndicada));
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
            opcion = JOptionPane.showInputDialog(null, "1. Encolar\n2. Desencolar\n3. Mostrar Cola\n4. Mostrar Acumulado\n5. Salir").charAt(0);
        }
        while(opcion < '1' || opcion > '5');
        return opcion;
    }
}