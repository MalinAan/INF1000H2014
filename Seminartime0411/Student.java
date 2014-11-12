import java.util.HashMap;

class Student{
	private String navn;
	private HashMap<String, Fag> mineFag = new HashMap<String, Fag>();

	Student(String navn){
		this.navn = navn;
	}

	public String toString(){
		return navn;
	}

	public void leggTilFag(Fag f){
		if(f!=null && !mineFag.containsKey(f.toString())){
			//Legger til faget til studenten
			mineFag.put(f.toString(),f);
			//Legger til studenten til faget.
			f.leggTilStudent(this);
		} else {
			System.out.println("Dette gikk ikke");
		}
	}

	public HashMap<String, Fag> returnerFag(){
		return mineFag;
	}
}