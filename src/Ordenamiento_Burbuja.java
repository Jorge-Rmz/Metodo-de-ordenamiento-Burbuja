
import javax.swing.JOptionPane;

public class Ordenamiento_Burbuja {

    public static void main(String[] args) {
        // TODO code application logic here
        AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();
        int opcion = 0, longitud, numero;

        try {
            longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos Números desea ordenar?"));
            int vector[] = new int[longitud];
            ordenar.rellenarArreglo(vector);
            ordenar.mostrarArreglo(vector);
            ordenar.burbuja1(vector);
            ordenar.mostrarArreglo(vector);
            ordenar.burbuja2(vector);
            ordenar.mostrarArreglo(vector);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }

}
