/**
* GlavniProgram.java
*Opis:
* Izdelajte vsaj en vmesnik ali abstraktni razred, ki ga boste nato smiselno implementirali v vašem osnovnem razredu.
* @author Tomaž Mikolaj
* @version Vaja 34
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GlavniProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Omara> seznamOmar = new ArrayList<>();
        int stevec = 1;

        boolean dodajanjeOmare = true;
        while (dodajanjeOmare) {
            try {
                System.out.println("Ustvarjanje nove omare...");
                System.out.println("Omara " + stevec + ":");
                System.out.print("Vnesi število polic omare: ");
                int steviloPolj = Integer.parseInt(scanner.nextLine());

                System.out.print("Vnesi material omare: ");
                String material = scanner.nextLine();

                System.out.print("Je omara lesena? (da/ne): ");
                String odgovor = scanner.nextLine();
                Omara novaOmara;
                if (odgovor.equalsIgnoreCase("da")) {
                    System.out.print("Vnesi vrsto lesa: ");
                    String vrstaLesu = scanner.nextLine();
                    novaOmara = new LesenaOmara(steviloPolj, material, vrstaLesu);
                } else {
                    System.out.print("Je omara odporna na vodo? (true/false): ");
                    boolean odpornaNaVodo = Boolean.parseBoolean(scanner.nextLine());
                    novaOmara = new KovinskaOmara(steviloPolj, material, odpornaNaVodo);
                }

                seznamOmar.add(novaOmara);
                novaOmara.prikaziInformacije(); // Dodaj ta del

                stevec++;
                System.out.print("Želiš dodati še eno omaro? (da/ne): ");
                String ponovno = scanner.nextLine();
                dodajanjeOmare = ponovno.equalsIgnoreCase("da");
            } catch (Exception e) {
                System.out.println("Napaka pri ustvarjanju omare: " + e.getMessage());
            }
        }

        // Izpis vseh objektov v seznamu
        System.out.println("\nVse omare v seznamu:");
        for (int i = 0; i < seznamOmar.size(); i++) {
            System.out.println("Omara " + (i + 1) + ":");
            seznamOmar.get(i).prikaziInformacije();
        }

        scanner.close();
    }
}

