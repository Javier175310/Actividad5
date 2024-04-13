package lista;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {
    public static void saveNumbers(List<Integer> numbers, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Integer number : numbers) {
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ejecutar(List<Integer> generaFibonacci) {
        saveNumbers(generaFibonacci, "fibonacci.txt");
        List<Integer> evenNumbers = Splitter.evenNum(generaFibonacci);
        List<Integer> oddNumbers = Splitter.oddNum(generaFibonacci);
        saveNumbers(evenNumbers, "evenNumbers.txt");
        saveNumbers(oddNumbers, "oddNumbers.txt");
    }
}
