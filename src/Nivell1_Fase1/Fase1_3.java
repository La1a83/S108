
package Nivell1_Fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Fase1_3 {

    
    public static void main(String[] args) {
       
        List <String> llista = new ArrayList();
        llista.add("porta");
        llista.add("sabata");
        llista.add("casa");
        llista.add("cargol");
        llista.add("samarreta");
        llista.add("portal");
        llista.add("java");
        llista.add("programa");
        llista.add("cosa");
        
        System.out.println("Impresió de la primera llista:" +llista);
        
        List<String> newList = getList(llista);
        System.out.println("\nImpresió de la segona llista, amb les paraules que"
                + " contenen la lletra 'o':  "+ newList);
        
        
        
        
    }
    
    public static List<String> getList (List<String> llista)  {
        return llista.stream().filter(c -> c.contains("o")).
                collect(Collectors.toList());
    }
    
}
