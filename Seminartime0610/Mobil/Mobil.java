class Mobil{
	private String merke;
	private Person eier;
	private int tlf;

	//Gir verdier
	Mobil(String merke, int tlf, Person eier){
		this.merke = merke;
		this.tlf = tlf;
		this.eier = eier;
	}

	/*
	Uten konstruktor
	
	public void giVerdier(String merke, int tlf){
		this.merke = merke;
		this.tlf = tlf
	}*/
}