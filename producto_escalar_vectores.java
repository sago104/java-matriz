 /* Escribir un programa que calcule el producto escalar de dos vectores.
Si v y w son los vectores y n su tamaño, el producto escalar se calcula como la sumatoria de V(i)*W(i) */

import javax.swing.JOptionPane;
public class productoEscalar {
    static int v[], w[];
    static int tam;
     
    public static void main(String[] args) {
       
     tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tamaño de vectores: "));
     
     // Redimensionar vectores
     v = new int[tam];
     w = new int[tam];
     
     llenarVector();
      
     JOptionPane.showMessageDialog(null, "El producto escalar es: " + pEscalar());
   }
   
   // Metodo para llenar ambos vectores
   static void llenarVector(){
     JOptionPane.showMessageDialog(null, "Llenar vector v[ ]");
     for(int i = 0; i < v.length; i++){
         v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato v["+i+"]"));
     }
     
     JOptionPane.showMessageDialog(null, "Llenar vector w[ ]");
     for(int j = 0; j < w.length; j++){
         w[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato w["+j+"]"));
     }
  }
  
  // Metodo para hallar el producto escalar
  static double pEscalar(){
   int xEscalar = 0;
   
   for(int i = 0; i < v.length; i++){
    xEscalar = xEscalar + (v[i] * w[i]);
   }
   
   return xEscalar;
  }
}

