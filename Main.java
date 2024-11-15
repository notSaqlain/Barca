import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Barca> barche = new ArrayList<Barca>();
        Porto p = new Porto();

        int scelta = 0;
        do {
            Menu();
            System.out.println("Inserisci la tua scelta: ");
            scelta = scanner.nextInt();
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
                    System.out.println("Inserisci la tipologia della barca: ");
                    boolean tipologia = scanner.nextBoolean();
                    Barca b = new Barca(nome, nazionalita, lunghezza, stazza, tipologia);
                    barche.add(b);
                    break;
                case 2:
                    for(Barca barca : barche){
                        System.out.println(barca);
                    }
                    break;
                case 3:
                    System.out.println("Inserisci il nome della barca: ");
                    String nomeBarca = scanner.nextLine();
                    System.out.println("Giorni: ");
                    int giorni = scanner.nextInt();
                    for(Barca barca : barche){
                        if(barca.getNome().equals(nomeBarca)){
                            p.assegnaPosto(barca, giorni);
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
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