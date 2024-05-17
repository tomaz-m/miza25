/**
* KovinskaOmara.java
*
* Opis:
* Razširite razred iz vaje 27 s še vsaj 2 dvema podrazredoma in v glavnem programu s kreiranjem objektov prikažite njuno delovanje.
* Vsak podrazred naj ima še vsaj eno dodatno lastnost in vsaj eno dodatno metodo, ki smiselno implementira poslovno logiko podrazreda.
* @author Tomaž Mikolaj
* @version Vaja 30
*/

public class KovinskaOmara extends Omara {
    // Dodatna lastnost
    private boolean odpornaNaVodo;

    // Konstruktor
    public KovinskaOmara(int steviloPolj, String material, boolean odpornaNaVodo) {
        super(steviloPolj, material);
        this.odpornaNaVodo = odpornaNaVodo;
    }

    // Dodatna metoda
    public void preveriVodotesnost() throws Exception {
        if (!odpornaNaVodo) {
            throw new Exception("Omara ni odporna na vodo.");
        }
        System.out.println("Omara je odporna na vodo.");
    }

    // Dodatna metoda
    public void preglejRjavenje() throws Exception {
        // Pregled rjavenja na kovinski omari
        if (getMaterial().equalsIgnoreCase("kovina")) {
            throw new Exception("Napaka na omari: Kovinska omara ne sme imeti rjavenja.");
        }
        System.out.println("Omara je brez rjavenja.");
    }
	
    @Override
    public String toString() {
        return "Kovinska omara "; // Vrne oznako objekta kovinske omare
    }
}

