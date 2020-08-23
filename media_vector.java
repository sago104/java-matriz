/* Media de los elementos de un vector JAVA */

import javax.swing.JOptionPane;
public class mediaVector {
    public static void main(String[] args) {
        int tam,v[];
        double media,suma = 0;
        
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tamaño del vector: "));
        v = new int[tam];
                
        // Llenar Vector
        for(int i = 0; i < v.length; i++){
         v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato ["+i+"]"));
        }
        
        // Calcular Suma elementos vector
        for(int j = 0; j < v.length; j++){
         suma += v[j];
        }
        
        // Calcular Media
        media = suma / tam;
        
        JOptionPane.showMessageDialog(null, "La media del vector es: " + media);
        
    }
}