
public class HarvesterAlternative {

	public static void main(String[] args) {
		int zeilen = Integer.parseInt(args[0]);
		int spalten = Integer.parseInt(args[1]);
		int startZeile = Integer.parseInt(args[2]);
		int startSpalte = Integer.parseInt(args[3]);
		String richtung = ""; 
		zeilen = 4;
		spalten = 5;
		int[][] feld = new int[zeilen+1][spalten+1];
				
		// Feld/Matrix initialisieren
		int zahl = 0;
		for (int z=1; z<=zeilen; z++) {
			for (int s=1; s<=spalten; s++) {
				feld[z][s] = ++zahl;
				if (zahl < 10) {
					System.out.print("0");
				}
				System.out.print(zahl + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		// Harvester starten
		startZeile  = 4; // @todo: change to param values
		startSpalte = 1; // @todo: change to param values
		
		if (startSpalte == 1) {
			richtung = "links2rechts";
		} else {
			richtung = "rechts2links";
		}
		
		if (startZeile > 1) {
			for (int z=startZeile; z>=1; z--) {
				if (richtung.equals("rechts2links")) {
					// von rechts nach links
					for (int s=spalten; s>=startSpalte; s--) {
						System.out.print(feld[z][s]+" ");
					}
					richtung = "links2rechts";
				} else {
					// von links nach rechts (default)
					for (int s=startSpalte; s<=spalten; s++) {
						System.out.print(feld[z][s]+" ");
					}
					richtung = "rechts2links";
				}
			}
		} else {
			for (int z=startZeile; z<=zeilen; z++) {
				if (z % 2 == 0) {
					// von rechts nach links
					for (int s=spalten; s>=startSpalte; s--) {
						System.out.print(feld[z][s]+" ");
					}
				} else {
					// von links nach rechts (default)
					for (int s=startSpalte; s<=spalten; s++) {
						System.out.print(feld[z][s]+" ");
					}
				}
			}
		}
	}

}
