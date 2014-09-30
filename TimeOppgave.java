import java.util.Scanner;
import java.io.*;

public class TimeOppgave{
	public static void main(String [] args) throws Exception{
		
		//Oppretter innlesningsobjekt
		String filnavn = "klasseliste.txt";
		File file = new File(filnavn);
		Scanner fil = new Scanner(file);

		String lBrNavn = fil.nextLine();
		String lNavn = fil.nextLine();

		Laerer l = new Laerer();
		l.giVerdier(lNavn, lBrNavn);

		while(fil.hasNextLine()){
			String brNavn = fil.nextLine();
			String navn = fil.nextLine();

			Student student = new Student();
			student.giVerdier(navn, brNavn, l);
			l.leggTilStudent(student);
		}

		l.taOpprop();




	}
}