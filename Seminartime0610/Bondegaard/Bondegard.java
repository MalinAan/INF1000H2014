class Bondegard{
	Gris [] grisebinge = new Gris[10];

	public static void main(String [] args){
		
		Bondegard bondegard = new Bondegard();
		//For aa unnga aa lage alt static.

		Gris gris1 = new Gris("Andreas");
		Gris gris2 = new Gris("Bjorn");
		Gris gris3 = new Gris("Marie");
		Gris gris4 = new Gris("Michal");
		Gris gris5 = new Gris("Ingvild");
		//Oppretter alle grisene.

		bondegard.settInnGris(gris1);
		bondegard.settInnGris(gris2);
		bondegard.settInnGris(gris3);
		bondegard.settInnGris(gris4);
		bondegard.settInnGris(gris5);
		//Legger grisene inn i arrayet

		bondegard.selgDyr("gris", 3);
		bondegard.selgDyr("gris", 3);


	}

	public void settInnGris(Gris grisen){
		//Grisen leter etter plass.
		for(int i = 0; i < grisebinge.length; i++){
			if(grisebinge[i] == null){
				//Plassen er ledig.
				grisebinge[i] = grisen;
				System.out.println(grisen.hentNavn() + " har faatt plass " + i + " i bingen.");
				return;
				//Med engang den finner en plass, vil metoden retunere
			}
		}
		System.out.println("Sorry, ingen plass til " + grisen.hentNavn());

	}

	public void selgDyr(String type, int antall){
		if(type.equalsIgnoreCase("gris")){
			for(int i = 0; i < antall; i++){
				Gris solgtGris = selgGris();
				//Kaller paa metoden for hver gris vi skal selge.
				if(solgtGris != null){
					//Sjekker for null-pekere
					System.out.println(solgtGris.hentNavn() + " ble solgt. Hade bra!");
				} else{
					System.out.println("Ingen griser aa selge.");
				}
				
			}
		}
	}


	private Gris selgGris(){
		for(int i = 0; i < grisebinge.length; i++){
			if(grisebinge[i] != null){
				//Det er en gris paa plass i.
				Gris midlertidig = grisebinge[i];
				grisebinge[i] = null;
				//Setter plassen til aa vaere ledig.
				return midlertidig;
			}
		} return null;
		//Om det ikke var noen griser å selge.
	}
}