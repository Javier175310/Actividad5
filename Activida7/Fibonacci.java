package lista;

import java.util.List;

import java.util.ArrayList;

public class Fibonacci {
	 List<Integer> listaEnteros = new ArrayList<Integer>();
	
	public static void main(String[] args) {
        List<Integer> fibonacciList = generaFibonacci();
       
        for (int num : fibonacciList) {
            System.out.println(num );
        }
    }
	public static List<Integer> generaFibonacci() {
        List<Integer> fibonacciSequence = new ArrayList<>();
        int a = 0, b = 1;
        fibonacciSequence.add(a);
        fibonacciSequence.add(b);
        
        do {
        	int temp = a + b;
        fibonacciSequence.add(temp);
        a = b;
        b = temp;
        }
        while (b <= 1000000);

        return fibonacciSequence;
    }
}
