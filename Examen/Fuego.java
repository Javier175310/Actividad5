package examenSegundoParcial;

public class Fuego extends Pokemon {
	String[] tipoFuego;
	


	public void setTipoFuego(String[] tipoFuego) {
		this.tipoFuego = tipoFuego;
	}
	
	public boolean VerificarPalabras(int tip) {
		
	    
	     boolean verifica = false;
	     boolean acertado = false;
	   
	     verifica = pokemones[tip].equals("Charmander");
	       
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Cyndaquil");
	        
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Torchic");
	        
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Litten");
	        
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }
	        verifica = pokemones[tip].equals("Fuecoco");
	        if (verifica) {
	            acertado = verifica;
	            return acertado;
	        }

	        
	        return acertado;
	    }
	}


