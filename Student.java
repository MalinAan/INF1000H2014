class Student{
	private String navn;
	private String brNavn;
	private int oppmote;
	private Laerer laerer;

	//Gir verdier til studenten.
	public void giVerdier(String navn, String brNavn, Laerer l){
		this.navn = navn;
		this.brNavn = brNavn;
		laerer = l;
	}

	//Registrerer oppmote
	public void registrerOppmote(){
		oppmote++;
	}

	public String hentNavn(){
		return this.navn;
	}

	public String hentBrukernavn(){
		return this.brNavn;
	}

	public int antOppmote(){
		return this.oppmote;
	}
}