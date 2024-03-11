package examenSegundoParcial;

public abstract class Pokemon {
	static String[] ataques = {"Hydro pump","Solar Beam", "Eruption", "Flamethrower", 
			"Aqua Jet","Whirlpool", "Synthesis", "Petal Dance"};
	
	static String[] pokemones = {"Squirtle", "Totodile", "Mudkip", "Froakie", "Quaxly",
	"Charmander", "Cyndaquil", "Torchic", "Litten", "Fuecoco",
	"Bulbasaur", "Chikorita", "Treecko", "Rowlet", "Sprigatito"} ;
	
	
	/*
	public abstract String[] guardarEnArreglo(String[] TiposFuego);
*/

	public static void setPokemones(String[] pokemones) {
		Pokemon.pokemones = pokemones;
	}
	public static String[] getPokemones() {
		return pokemones;   
	}

}
	

