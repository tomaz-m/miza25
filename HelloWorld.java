/**
* HelloWorld.java
*
* Opis:
* Program, ki v ukazno konzolo izpiše "Pozdravljen, Svet!"
* V nadaljevanju služi prikazu delovanja razredov in objektov
*
* @author Tomaž Mikolaj
* @version Primer 19a (vmesniki)
*/

// Uvozimo vse razrede iz paketa za delo z V/I napravami in pripomiočki
import java.io.*;
import java.util.*;

/**
* Javni razred za prikaz delovanja jave
* @author Tomaž Mikolaj
* @version Primer 19a (vmesniki)
*/
public class HelloWorld {
	
	//Deklariramo statične lastnosti (objekti)
	
	// Objekt za vnos iz konzole
	private static BufferedReader in;
	
	// abstraktni seznam objektov razreda
	private static ArrayList<PivskaSteklenica> pivskeSteklenice;
	
	/** Javna statična metoda, ki se izvede ob zagonu programa
	* @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
	* @return Metoda ne vrača nič (ker je tipa void)
	*/
	
	public static void main(String[] args){
	
		// Inicializiramo statično lastnost za vnos iz tipkovnice
		// Kontruktor kot vhodni parameter prejme anonimni objekt razreda InputStreamReader
		
		in = new BufferedReader(new InputStreamReader(System.in));
	
		// Inicializiramo seznam pivskih steklenice
		pivskeSteklenice = new ArrayList<PivskaSteklenica>();
		
		// izpišemo pozdrav v konzolo
		System.out.println("Pozdravljen, Svet!");
	
		// Ustvarimo dva objekta tipa/razreda Steklenica
		Steklenica zganje = new Steklenica(50, "Žganje");
		Steklenica voda = new Steklenica(500, "Voda");
		
		// Deklariramo in incializiramo spremenjlivko za količino vode
		int kv = 0;
	
		// poizkusimo prebrati niz s tipkovnico
		try {
			System.out.print("Koliko vode naj natočim v kozarec?");
		
			// Niz, vnešen preko tipkovnice, preberemo v spremeljivko
			String kolicinaVode = in.readLine();
			
			// Niz zapišemo v celo število
			kv = Integer.parseInt(kolicinaVode);
		
			System.out.println("V kozarec bom natočil" + kolicinaVode + " ml vode.");
	}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri vnosu: " + e);
		}
	
		// iz steklenice za vodo poizkusmo izpraznitti toliko, kot smo vnesli v konzolo (kličemo metodo izprazni objekta voda)
		try {
		voda.odpri();
		String vsebinaKozarca = voda.izprazni(kv);
		System.out.println("Vsebina kozarca je" + vsebinaKozarca);
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri praznenju steklenice: " + e);
		}
	
		// Odpremo steklenico z žganjem
		zganje.odpri();
	
		//poizkusimo napraviti požirek
		try {
		String pozirek = zganje.izprazni(20);
		System.out.println("Naredili smo požirek " + pozirek);
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri praznenju steklenice zganja: " + e);
		}
		
		// 

		// Ustvarimo tri pivske steklenice
		PivskaSteklenica velikoLasko = new PivskaSteklenica("Laško", 500);
		PivskaSteklenica maliUnion = new PivskaSteklenica("Union", 330);
		PivskaSteklenica heineken = new PivskaSteklenica("Heineken", 330);
		
		// Steklenice dodamo v seznam
		pivskeSteklenice.add(velikoLasko);
		pivskeSteklenice.add(maliUnion);
		pivskeSteklenice.add(heineken);
		
		// Dodamo novo brezalkoholno pivo
		pivskeSteklenice.add(new PivskaSteklenica ("Laško Malt", 500, 0.0));
		
		// Odpremo vse steklenice v seznamu
		for(int c=0; c<pivskeSteklenice.size(); c++) {
			
			if (pivskeSteklenice.get(c).odpri());
				System.out.println("Steklenica st. " + c + " uspešno odprta");
			
		}
		
		// Kličemo metode, ki so bile deklarirane že v nadrazredu
		try {
		//velikoLasko.odpri();
		System.out.println("Naredili smo požirek " + velikoLasko.izprazni(50));
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri praznenju steklenice Laškega: " + e);
		}
	
	}
}
