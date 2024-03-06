package actividad5;

import java.util.Random;

public class Mamifero extends Animal {
	Random Rand1 = new Random();
	Boolean nacenDeEllos = true;
	
	int numPatas= Rand1.nextInt(3);
	int totalPatas = numPatas * 2;

	@Override
	public String formaDeMoverse() {
		String move= "La mayoria de mamiferos se mueven con sus patas y solo las ballenas ocupan aleta";
		return move;
	}
	

}
