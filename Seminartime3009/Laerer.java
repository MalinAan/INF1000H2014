import java.util.Scanner;

class Laerer{
	private String navn;
	private String brNavn;
	private Student [] mineStudenter = new Student[37];

	public void giVerdier(String navn, String brNavn){
		this.navn = navn;
		this.brNavn = brNavn;
	}

	public String hentNavn(){
		return this.navn;
	}

	//Legger til student paa forste ledige plass i arrayet.
	public void leggTilStudent(Student s){
		for(int i = 0; i < mineStudenter.length; i++){
			if(mineStudenter[i] == null){
				mineStudenter[i] = s;
				return;
			}
		}
	}

	//Registrerer oppmote til studentene
	public void taOpprop(){
		Scanner tastatur = new Scanner(System.in);
		for(int i = 0; i < mineStudenter.length; i ++){
			if(mineStudenter[i]!=null){
				System.out.println("Er " + mineStudenter[i].hentNavn() + " tilstede?");
				String svar = tastatur.nextLine();
				if(svar.equals("Ja")){
					mineStudenter[i].registrerOppmote();
				}
			}
		}
	}
}