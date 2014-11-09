import java.util.HashMap;

class Fag{
	private String fagkode;
	private HashMap<String, Student> studenter = new HashMap<String, Student>();
	
	Fag(String f){
		this.fagkode = f;
	}

	public void leggTilStudent(Student s){
		if(s!=null && !studenter.containsKey(s)){
			studenter.put(s.toString(), s);
		}
	}

	public String toString(){
		return fagkode;
	}
	
}