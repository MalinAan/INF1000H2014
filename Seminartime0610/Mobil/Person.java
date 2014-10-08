class Person{
	private String navn;
	private int alder;
	private String bosted;
	private Mobil mobil;


	Person(String navn, int alder, String bosted){
		this.navn = navn;
		this.alder = alder;
		this.bosted = bosted;
	}

	public void giMobil(Mobil mobil){
		this.mobil = mobil;
	}

	public boolean erOver14(){
		if(this.alder > 14){
			return true;
		} return false;
	}

}