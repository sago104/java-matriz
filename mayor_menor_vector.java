/* Encontrar mayor y menor de un vector */

import javax.swing.JOptionPane;
public class mayorMenorVector {
    static int v[], mayor = 0, menor = 9999, tam;
    
    public static void main(String[] args) {
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tamaño del vector: "));
        v = new int[tam];
                
        // Llenar Vector
        for(int i = 0; i < v.length; i++){
         v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato ["+i+"]"));
        }
        
        JOptionPane.showMessageDialog(null, "El numero menor es: " + nMenor());
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + nMayor());
    }
    
    // Numero Menor
    static int nMenor(){
     for(int i = 0; i < v.length; i++){
      if ( v[i] < menor){
       menor = v[i];
      }
     }
     return menor;
    }
    
    // Numero Mayor
    static int nMayor(){
     for(int i = 0; i < v.length; i++){
      if ( v[i] > mayor){
       mayor = v[i];
      }
     }
     return mayor;
    }
}

