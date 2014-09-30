import java.util.Scanner;
import java.io.*;

public class TimeOppgave{
	public static void main(String [] args) throws Exception{
		
		/*Oppretter innlesningsobjekt. Husk at du trenger en 
		tekstfil med brukernavn og deretter fullt navn for aa kjore filen selv*/
		String filnavn = "klasseliste.txt";
		File file = new File(filnavn);
		Scanner fil = new Scanner(file);

		//Leser inn laerer og oppretter et Laerer-objekt.
		String lBrNavn = fil.nextLine();
		String lNavn = fil.nextLine();
		Laerer l = new Laerer();
		l.giVerdier(lNavn, lBrNavn);

		//Leser inn alle studentene fra fil.
		while(fil.hasNextLine()){
			//Leser inn student og oppretter et Student-objekt.
			String brNavn = fil.nextLine();
			String navn = fil.nextLine();
			Student student = new Student();
			student.giVerdier(navn, brNavn, l);

			//Legger til student i Laerer-objektet.
			l.leggTilStudent(student);
		}

		//Tar opprop. 
		l.taOpprop();

	}
}