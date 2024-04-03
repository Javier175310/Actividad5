package lista;

import java.util.List;

public class Manager {
    public static void saveNumbers(List<Integer> generaFibonacci) {
    }
    
    public static void saveEvenNumbers(List<Integer> evenNumbers) {
    }
    
    public static void saveOddNumbers(List<Integer> oddNumbers) {
    }
    
    public static void ejecutar(List<Integer> generaFibonacci) {
        saveNumbers(generaFibonacci);
        saveEvenNumbers(Splitter.evenNum(generaFibonacci));
        saveOddNumbers(Splitter.oddNum(generaFibonacci));
    }
}