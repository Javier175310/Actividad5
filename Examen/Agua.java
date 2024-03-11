package examenSegundoParcial;

public class Agua extends Pokemon{
	String tipo = "Agua";
	public boolean VerificarPalabras(int tip) {
		
	    
	     boolean verifica = false;
	     boolean acertado = false;
	   
	     verifica = pokemones[tip].equals("Squirtle");
	       
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Totodile");
	        
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Mudkip");
	        
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Froakie");
	        
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Quaxly");
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }

	        
	        return acertado;
	    }
}
