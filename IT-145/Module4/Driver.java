public class Driver {
	public static void main(String[] args) {
		//Corgi variables to use
		String type = "cattle herding";
		String breed = "welsh corgi";
		String name = "Corgilicious";
		int pounds = 25;
		int years = 5;
		
		//Create Corgi object
		Corgi cutiePie = new Corgi(type, breed, name, pounds, years);
		
		//Do some stuff
		cutiePie.setTopTrick("Super-Mega-Quadruple-Backflip");
		System.out.println(cutiePie.toString());
	}
}
