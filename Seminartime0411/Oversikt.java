import java.util.Scanner;
import java.io.*;
import java.util.HashMap;

class Oversikt{
	private HashMap<String, Student> studenter = new HashMap<String, Student>();
	private HashMap<String, Fag> fag = new HashMap<String, Fag>();

	public static void main(String [] args) throws Exception{
		Oversikt oversikt = new Oversikt();
		oversikt.lesFraFil();
		oversikt.skrivUtStudenter();

	}

	public void lesFraFil() throws Exception{
		Scanner fil = new Scanner(new File("fagliste.txt"));
		
		String fagkode = null;
		while(fil.hasNextLine()){
			String linje = fil.nextLine();
			if(linje.startsWith("*")){
				fagkode = linje.substring(1);
				Fag f = new Fag(fagkode);
				fag.put(f.toString(), f);
			} else {
				Student s;
				if(!studenter.containsKey(linje)){
					//Hvis studenten ikke finnes fra for av.
					s = new Student(linje);
					studenter.put(s.toString(), s);
				} else {
					//Student finnes fra for av.
					s = studenter.get(linje);
				}
				s.leggTilFag(fag.get(fagkode));
			}
			
		}


	}

	public void skrivUtStudenter(){
		for(Student s : studenter.values()){
			HashMap<String, Fag> studFag = s.returnerFag();
			System.out.println(s.toString() + " tar folgenden fag:");
			for(Fag f : studFag.values()){
				System.out.println(f.toString());
			}
			System.out.println();
		}
	}	


	
}