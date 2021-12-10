
package Nivell1_Fase2;


public class Fase2_1 {

   
    public static void main(String[] args) {
        InterficieFuncionalPi instancia = () -> 3.1415;
        double resultat = instancia.getPiValue();
        System.out.println("Imprimint resultat de getPiValue(): "+resultat);
        
        
    }
    
}
