/**
* LesenaOmara.java
*
* Opis:
* Razširite razred iz vaje 27 s še vsaj 2 dvema podrazredoma in v glavnem programu s kreiranjem objektov prikažite njuno delovanje.
* Vsak podrazred naj ima še vsaj eno dodatno lastnost in vsaj eno dodatno metodo, ki smiselno implementira poslovno logiko podrazreda.
* @author Tomaž Mikolaj
* @version Vaja 30
*/

public class LesenaOmara extends Omara {
    // Dodatna lastnost
    private String vrstaLesu;

    // Konstruktor
    public LesenaOmara(int steviloPolj, String material, String vrstaLesu) {
        super(steviloPolj, material);
        this.vrstaLesu = vrstaLesu;
    }

    // Dodatna metoda
    public void pohvaliSeZLesom() {
        System.out.println("Omara je izdelana iz " + vrstaLesu + " lesa.");
    }

    // Dodatna metoda
    public void preglejNapake() throws Exception {
        // Pregled napak na leseni omari
        if (vrstaLesu.equalsIgnoreCase("hrast")) {
            throw new Exception("Napaka na omari: Hrast ne sme imeti napak.");
        }
        System.out.println("Omara je brez vidnih napak.");
    }

    @Override
    public String toString() {
        return "Lesena omara "; // Vrne oznako objekta lesene omare
    }
}


