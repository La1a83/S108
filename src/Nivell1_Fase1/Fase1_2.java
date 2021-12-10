package Nivell1_Fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fase1_2 {

    public static void main(String[] args) {
        List<Integer> llista = new ArrayList();
        llista.add(34);
        llista.add(3);
        llista.add(56);
        llista.add(1);
        llista.add(31);
        llista.add(14);
        llista.add(11);
        llista.add(44);
        llista.add(23);

        System.out.println("Cadena separada per comes. Cada element va precedit"
                + " d'una 'e' si es parell i d'una 'o' si es imparell.");
        
        String cadena = getString(llista);
        System.out.println("\n"+cadena);
        
    }
    
    //Mètode que retorna un String utilitzant una Lambda Stream:
    public static String getString(List<Integer> list){
        return list.stream()
               .map(i->i%2==0?"e"+i:"o"+i)
               .collect(Collectors.joining(","));
            
    }
    
}                              
