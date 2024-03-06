package actividad5;

import java.util.Random;

public class Pez extends Animal {
	Random Rand2 = new Random();
	int tamBanco = Rand2.nextInt(200);
	int numAletas = Rand2.nextInt(3);
	int totalAletas = numAletas * 2;

	@Override
	public String formaDeMoverse() {
	String move2 = "Se mueven mediante aleteos";
	return move2;
	
	}

}
