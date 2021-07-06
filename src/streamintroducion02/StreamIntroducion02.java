
package streamintroducion02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamIntroducion02 {

   
    public static void main(String[] args) {
         //convierto una lista de numero con aslist
       List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
       //la variable numero la convierto a stream
        Stream<Integer> numeroStream = numeros.stream();
        
        int suma = numeroStream
                    .filter( n -> n % 2 == 1) //1,3,5,7,9
                    .map( n -> n * n) // 1,9,25,49,81
                    //.reduce(0,(n1,n2)->n1+n2); //suma todos los numeros anteriores
                    .reduce(0, Integer::sum); //suma todos los numeros anteriores
        System.out.println("suma = " + suma);
    }
    
}
