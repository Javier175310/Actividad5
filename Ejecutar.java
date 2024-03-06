package actividad5;
import java.util.Random;
public class Ejecutar extends Animal{


	Mamifero mamiferos = new Mamifero();
	Ave avez = new Ave();
	Pez peces = new Pez();
	
	@Override
	public String formaDeMoverse() {
		return null;
	}
	
	
	public String creadorDeOjectos (){
	Random Rand = new Random();{
		for(int i = 1; i < 11; i++) {
			System.out.println("Tu animal es el num "+ i +" y tiene "+ getNumeroDeOjos() + " ojos");
			System.out.println(getRespira());
			System.out.println(getPuedenMoverse());
			int j = Rand.nextInt(3);
			if (j == 0) {
				System.out.println("Tu animal es mamifero" );
				System.out.println("Tu animal es mamifero");
				System.out.println("El animal tiene su hijo en el vientre:( " + mamiferos.nacenDeEllos + ")"); 
				System.out.println("Tu animal tiene" + mamiferos.totalPatas + "cantidad de patas");
				System.out.println( mamiferos.formaDeMoverse());
				System.out.println("==========================");
			} else if (j == 1) {
				System.out.println("Tu animal es una ave");
				System.out.println("Tu animal tiene plumas de " + avez.sizePluma + " cm de largo");
				System.out.println("Tu animal tiene " + avez.numAlas + " alas");
				System.out.println("Tu animal " + avez.formaDeMoverse());
				System.out.println("==========================");
            } else {
            	System.out.println("Tu animal es un pez");
            	System.out.println("Tu animal nada en un banco de " + peces.tamBanco + " peces");
            	System.out.println("Tu animal tiene un total de " + peces.numAletas + "aletas");
            	System.out.println("Tu animal " + peces.formaDeMoverse());
            	System.out.println("==========================");
            }
			
		}
	}
	return "Esto es todo";
}
}

