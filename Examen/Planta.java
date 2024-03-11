package examenSegundoParcial;

public class Planta extends Pokemon{
	String tipo = "Planta";
	public boolean VerificarPalabras(int tip) {
	
	    
	     boolean verifica = false;
	     boolean acertado = false;
	   
	     verifica = pokemones[tip].equals("Bulbasaur");
	       
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Chikorita");
	        
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Treecko");
	        
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Rowlet");
	        
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Sprigatito");
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }

	        
	        return acertado;
	    }
	}


