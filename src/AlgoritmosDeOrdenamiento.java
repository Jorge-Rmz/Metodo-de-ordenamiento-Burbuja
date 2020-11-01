
import javax.swing.JOptionPane;

public class AlgoritmosDeOrdenamiento {
    int i, j, temporal;
    
    public AlgoritmosDeOrdenamiento(){
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }
    
    //Método Burbuja
    //Version 1.
    public void burbuja1(int [] arreglo ){
        for(i = 0; i < arreglo.length; i ++){
            for(j = i + 1; j < arreglo.length; j++){
                if(arreglo[i] > arreglo[j]){
                    temporal = arreglo[i];
                    arreglo[i] = arreglo [j];
                    arreglo[j] = temporal;
                }
            }
        }
    }
    //Método Burbuja
    //Version 2.
    public void burbuja2 (int [] arreglo){
        for(i = 1; i < arreglo.length; i ++){
            for(j = 0; j < arreglo.length-1; j++){
                if(arreglo[j] > arreglo[j+1]){
                    temporal = arreglo[j];
                    arreglo[j] = arreglo [j+1];
                    arreglo[j+1] = temporal;
                }
            }
        }
    }
    
    //Mostrar los datos del vector 
    
    public void mostrarArreglo(int []arreglo){
        int k;
        for(k = 0; k < arreglo.length; k++){
            System.out.print("[" + arreglo[k] + "]--->");
        }    
        System.out.println();
    }
    
     public void rellenarArreglo(int []arreglo){
        int k, numero = 0;
        for(k = 0; k < arreglo.length; k++){
           numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el numero " + (k+1) ));
           arreglo [k] = numero; 
        }
        
    }
    
}
