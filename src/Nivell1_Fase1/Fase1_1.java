package Nivell1_Fase1;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Fase1_1 {

   
    public static void main(String[] args) {
        List <String> noms = new ArrayList<String>();
        noms.add("Alexia");
        noms.add("Pep");
        noms.add("Albert");
        noms.add("Ana");
        noms.add("Sandra;");
        noms.add("Flavio");
        noms.add("Marta");
        noms.add("Ava");
        noms.add("Lluís");
         
        
        System.out.println("noms que comencen per A i tenen tres lletres: ");
        
        List<String> novaLLista = getList(noms);
        System.out.println("\nImprimint la nova llista: "+ novaLLista);
        
              
    }
    
    /*Mètode que retorna una llista amb els String que comencen per "A"
    i que tenen 3 lletres.
    */
    public static List<String> getList(List <String> llista) {
        
        return llista.stream().filter(c -> c.charAt(0)=='A' &&
                c.length()==3).collect(Collectors.toList());
    }
    
}
