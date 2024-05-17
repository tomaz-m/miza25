/**
* Omara.java
*
* Opis:
*Izdelajte vsaj en vmesnik ali abstraktni razred, ki ga boste nato smiselno implementirali v vašem osnovnem razredu.
* @author Tomaž Mikolaj
* @version Vaja 34
*/

/**
* Javni razred za prikaz dela z razredi in objekti
*/
public class Omara implements InformacijeOOmari {
    private int steviloPolj;
    private String material;
    private boolean zaklenjena;

    public Omara(int steviloPolj, String material) {
        this.steviloPolj = steviloPolj;
        this.material = material;
        this.zaklenjena = false; // Privzeto je omara odklenjena
    }

    public void odpriOmaro() {
        System.out.println("Omara je odprta.");
    }

    public void zakleniOmaro() {
        this.zaklenjena = true;
        System.out.println("Omara je bila zaklenjena.");
    }

    public void odkleniOmaro() {
        this.zaklenjena = false;
        System.out.println("Omara je bila odklenjena.");
    }

    public boolean jeOmarazaklenjena() {
        return this.zaklenjena;
    }

    @Override
    public void prikaziInformacije() {
        System.out.println("Informacije o omari:");
        System.out.println("Število polic: " + steviloPolj);
        System.out.println("Material: " + material);
    }
}



