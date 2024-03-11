package examenSegundoParcial;
import java.util.Scanner;
public class Menu {
	public String mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
	    String resultado = "";

	    System.out.println("Menu de Preguntas");
	    System.out.println("1. Consultar tipo de Pokemon");
	    System.out.println("2. Consultar si un ataque está en el Pokemon");
	    System.out.println("3. Consultar Pokemon directo");
	    System.out.println("4. Salir");

	    System.out.print("Ingrese su eleccion: ");
	    int opcion = scanner.nextInt();

	    if (opcion == 1) {
	        System.out.println("Ingrese el tipo de Pokemon: ");
	        System.out.println("1. Agua");
	        System.out.println("2. Planta");
	        System.out.println("3. Fuego");
	        int clasePokemon = scanner.nextInt();
	        if (clasePokemon == 1) {
	            resultado = "Agua";
	        } else if (clasePokemon == 2) {
	            resultado = "Planta";
	        } else if (clasePokemon == 3) {
	            resultado = "Fuego";
	        } else {
	            System.out.println("No valido");
	        }
	    } else if (opcion == 2) {
	        System.out.println("Seleccione el nombre del ataque: ");
	        System.out.println("Hydro pump");
	        System.out.println("Solar Beam");
	        System.out.println("Eruption");
	        System.out.println("Flamethrower");
	        System.out.println("Aqua Jet");
	        System.out.println("Whirlpool");
	        System.out.println("Synthesis");
	        System.out.println("Petal Dance ");
	        resultado = scanner.next();
	    } else if (opcion == 3) {
	        System.out.println("Seleccione el nombre del Pokémon: ");
	        System.out.println("Squirtle");
	        System.out.println("Totodile");
	        System.out.println("Mudkip");
	        System.out.println("Froakie");
	        System.out.println("Quaxly");
	        System.out.println("Charmander");
	        System.out.println("Cyndaquil");
	        System.out.println("Torchic");
	        System.out.println("Litten");
	        System.out.println("Fuecoco");
	        System.out.println("Bulbasaur");
	        System.out.println("Chikorita");
	        System.out.println("Treecko");
	        System.out.println("Rowlet");
	        System.out.println("Sprigatito");
	        resultado = scanner.next();
	    } else if (opcion == 4) {
	        return resultado; //
	    } else {
	        System.out.println("No valido");
	    }

	    return resultado;
	}
}