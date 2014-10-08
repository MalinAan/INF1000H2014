class Oppgave51{
	public static void main(String [] args){
		Person person = new Person("Kari Nordmann", 40, "Oslo");
		Mobil mobil = new Mobil("Samsung", 22334455, person);
		if(person.erOver14()){
			person.giMobil(mobil);
		}
	}
}