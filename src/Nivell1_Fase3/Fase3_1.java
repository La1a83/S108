
package Nivell1_Fase3;
import javax.swing.JOptionPane;



public class Fase3_1 {

   
    public static void main(String[] args) {
        
        
        InterficieFuncionalReverse instancia = (s) -> 
        new StringBuilder(s).reverse().toString();
        
        
        String frase = JOptionPane.showInputDialog("Escriu una frase: ");
        String resultat = instancia.reverse (frase);
        System.out.println("La frase al revés és: " + resultat);
             
    }

    
    
}
