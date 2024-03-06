package actividad5;

public abstract class Animal {
    private int numeroDeOjos = 2;
    private Boolean respira = true;
    private Boolean puedenMoverse = true;
    
    protected Boolean seAlimentan() {
    	Boolean animales= true;
    	return animales;
    }
    
    public abstract String formaDeMoverse();

	public int getNumeroDeOjos() {
		return numeroDeOjos;
	}

	public void setNumeroDeOjos(int numeroDeOjos) {
		this.numeroDeOjos = numeroDeOjos;
	}

	public Boolean getRespira() {
		System.out.println("Tu animal respira");
		return respira;
	}

	public void setRespira(Boolean respira) {
		this.respira = respira;
	}

	public Boolean getPuedenMoverse() {
		System.out.println("Tu animal se puede mover");
		return puedenMoverse;
	}

	public void setPuedenMoverse(Boolean puedenMoverse) {
		this.puedenMoverse = puedenMoverse;
	}

}
