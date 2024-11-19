import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Barca> barche = new ArrayList<>();
        Porto p = new Porto();

        int scelta = 0;
        do {
            Menu();
            System.out.println("Inserisci la tua scelta: ");
            if (scanner.hasNextInt()) {
                scelta = scanner.nextInt();
                scanner.nextLine(); // Pulisce il buffer
                switch (scelta) {
                    case 1:
                        System.out.println("Inserisci il nome della barca: ");
                        String nome = scanner.nextLine();
                        System.out.println("Inserisci la nazionalità della barca: ");
                        String nazionalita = scanner.nextLine();
                        System.out.println("Inserisci la lunghezza della barca: ");
                        int lunghezza = scanner.nextInt();
                        System.out.println("Inserisci la stazza della barca: ");
                        int stazza = scanner.nextInt();
                        scanner.nextLine(); // Pulisce il buffer
                        System.out.println("Inserisci la tipologia della barca (true/false): ");
                        boolean tipologia = scanner.nextBoolean();
                        scanner.nextLine(); // Pulisce il buffer
                        Barca b = new Barca(nome, nazionalita, lunghezza, stazza, tipologia);
                        barche.add(b);
                        System.out.println("Barca aggiunta con successo.");
                        break;
                    case 2:
                        System.out.println("Elenco delle barche:");
                        for (Barca barca : barche) {
                            System.out.println(barca);
                        }
                        break;
                    case 3:
                        System.out.println("Inserisci il nome della barca: ");
                        String nomeBarca = scanner.nextLine();
                        System.out.println("Inserisci il numero di giorni: ");
                        if (scanner.hasNextInt()) {
                            int giorni = scanner.nextInt();
                            scanner.nextLine(); // Pulisce il buffer
                            boolean trovato = false;
                            for (Barca barca : barche) {
                                if (barca.getNome().equalsIgnoreCase(nomeBarca)) {
                                    p.assegnaPosto(barca, giorni);
                                    trovato = true;
                                    System.out.println("Posto assegnato con successo.");
                                    break;
                                }
                            }
                            if (!trovato) {
                                System.out.println("Barca non trovata.");
                            }
                        } else {
                            System.out.println("Input non valido per i giorni.");
                            scanner.nextLine(); // Pulisce il buffer
                        }
                        break;
                    case 4:
                        System.out.println("Uscita dal programma.");
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprova.");
                        break;
                }
            } else {
                System.out.println("Inserisci un numero valido.");
                scanner.nextLine(); // Pulisce il buffer
            }
        } while (scelta != 4);

        scanner.close();
    }

    public static void Menu() {
        System.out.println("\nMenu");
        System.out.println("1. Inserisci barca");
        System.out.println("2. Visualizza barche");
        System.out.println("3. Assegna posto");
        System.out.println("4. Esci");
    }
}
