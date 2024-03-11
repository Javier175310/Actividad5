package examenSegundoParcial;

import java.util.Random;

public class Ejecutar {
	Agua aguita = new Agua();
	Planta plantita = new Planta();
	Fuego fueguito = new Fuego();
	Menu menu = new Menu();
	Random rand = new Random();
	String[][] selecciones = new String[15][6];
	String[] valor ; 
	String[] pokees = Pokemon.getPokemones();
	String elegido  ;
	int aleatorio3 = rand.nextInt(15);
	
	
	public String Aleatorizar() {
		int aleatorio2 = rand.nextInt(15); 
		boolean[] pokedex = new boolean[Pokemon.getPokemones().length];
	
	
		 for (int i = 0; i < 15; i++) {
			 
			 System.out.println("---------------------------------------------------------------------"  );
			 boolean[] ataquesSeleccionados = new boolean[Pokemon.ataques.length];//0
			 do {
		            aleatorio2 = rand.nextInt(15);//1
		        } while (pokedex[aleatorio2]);
		        selecciones[i][0] = Pokemon.pokemones[aleatorio2];
		        pokedex[aleatorio2] = true;
		        //System.out.println(selecciones[i][0]);
		        
		        
		        
			 for (int j = 0; j < 6; j++) {
					 int aleatorio = rand.nextInt(Pokemon.ataques.length);
					 //System.out.println(aleatorio2);
					 if (j >= 2){
						 
						 selecciones [i][j] = Pokemon.ataques[aleatorio];
						 do {
			                    aleatorio = rand.nextInt(Pokemon.ataques.length);//1
			             } while (ataquesSeleccionados[aleatorio]); 

			                selecciones[i][j] = Pokemon.ataques[aleatorio];
			                ataquesSeleccionados[aleatorio] = true;
			                //System.out.println(selecciones[i][j]);
						 
					 } else if (j == 1){
						 int tip = aleatorio2;
						 boolean esFuego= fueguito.VerificarPalabras(tip);
						 boolean esPlanta= plantita.VerificarPalabras(tip);
						 boolean esAgua= aguita.VerificarPalabras(tip);
						 if(esFuego) {
							 selecciones[i][1] = "Fuego";
							 //System.out.println(selecciones[i][j]);
						 }else if (esPlanta) {
							 selecciones[i][1] = "Planta";
							 //System.out.println(selecciones[i][j]);
						 }else if(esAgua) {
							 selecciones[i][1] = "Agua";
							 //System.out.println(selecciones[i][j]);
						 }
						 
					 
					    }	
			 }
			 //System.out.println("Imprimiendo el arreglo selecciones al final:");
		
			        for (int j = 0; j < 6; j++) {
			            System.out.print(selecciones[i][j] + " | ");
			        }
			        System.out.println(); 
			        
			        
			        
	}
		 int aleatorio3 = rand.nextInt(15); //seleccion
	        for (int j = 0; j < 6; j++) {
	        	elegido = selecciones[aleatorio3][j];
	            System.out.print(selecciones[aleatorio3][j] + " ");
	        }
		 return "null";
	}
	public String Eliminar() {
		int k = 0;
		for (k = 0; k < 3; k++) {
			String opcion = menu.mostrarMenu(); 
		    boolean contieneOpcion = false;

		    for (int j = 0; j < 6; j++) {
		        if (selecciones[aleatorio3][j].equals(opcion)) {
		            contieneOpcion = true;
		            break;
		        }
		    }

		    
		    for (int i = 0; i < selecciones.length; i++) {
		        boolean eliminar = false;
		        for (int j = 0; j < 6; j++) {
		            if (contieneOpcion) {
		                
		                if (!contieneOpcionEnFila(selecciones[i], opcion)) {
		                    eliminar = true;
		                    break;
		                }
		            } else {
		                
		                if (contieneOpcionEnFila(selecciones[i], opcion)) {
		                    eliminar = true;
		                    break;
		                }
		            }
		        }
		       
		        if (eliminar) {
		            for (int j = 0; j < 6; j++) {
		                selecciones[i][j] = null; 
		            }
		        }
		    }
		    for (int i = 0; i < selecciones.length; i++) {
		        for (int j = 0; j < 6; j++) {
		            if (selecciones[i][j] != null) {
		                System.out.print(selecciones[i][j] + " ");
		            }
		        }
		        System.out.println();
		    }

		    
		}
		return "El juego ha concluido";
	}
		private boolean contieneOpcionEnFila(String[] fila, String opcion) {
		    for (String elemento : fila) {
		        if (opcion.equals(elemento)) {
		            return true;
		        }
		    }
		    return false;
		}
	
}