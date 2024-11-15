/* Un porto turistico affitta i propri
posti-barca (circa un centinaio) alle imbarca-
zioni che ne fanno richiesta. Per legge è tenuto
a registrare per ogni barca ospitata le seguen-
ti informazioni: nome, nazionalità, lunghezza,
stazza, tipologia (vela o motore); ma non vi è ob-
bligo di mantenere le informazioni relative alle
imbarcazioni dopo che hanno lasciato il porto. I
posti-barca sono numerati: i posti da 1 a 20 non
possono ospitare barche più lunghe di IO m e le
barche a vela devono essere piazzate in via prio-
ritaria nei posti successivi al 50. II costo dell'af-
fitto per le barche a vela è di IO € per metro di
lunghezza al giorno, mentre per le barche a mo-
tore è di 20 € per tonnellata di stazza al giorno. È
richiesta la progettazione di una possibile solu-
zione per la gestione informatica dei posti-barca
che implementi le seguenti funzionalità:
•
assegnazione di un posto a una barca in ar-
liberazione di un posto occupato con calcolo
dell'importo dell'affitto (in input viene forni-
to il numero dei giorni di sosta);
ricerca delle informazioni relative alla barca
che occupa un dato posto;
salvataggio su file dello stato del porto in un
certo istante in modo da renderlo persistente;
produrre una struttura dati (array) dei nomi
delle barche di una certa nazionalità specifi-
cata dall'utente. */

public class Porto {

    private Barca[] postiBarca = new Barca[100];

    public Porto() {
        for (int i = 0; i < postiBarca.length; i++) {
            postiBarca[i] = null;
        }
    }

    public void assegnaPosto(Barca b, int giorni) {
        int posto = 0;
        if (b.getLunghezza() < 10) {

            for (int i = 0; i < 20; i++) {
                if (postiBarca[i] == null) {
                    postiBarca[i] = b;
                    posto = i;
                    break;
                }
            }

        } else {

            for (int i = 20; i < 50; i++) {
                if (postiBarca[i] == null) {
                    postiBarca[i] = b;
                    posto = i;
                    break;
                }
            }
        }

        if (!b.getTipologia()) {
            for (int i = 50; i < postiBarca.length; i++) {
                if (postiBarca[i] == null) {
                    postiBarca[i] = b;
                    posto = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < 50; i++) {
                if (postiBarca[i] == null) {
                    postiBarca[i] = b;
                    posto = i;
                    break;
                }
            }
        }
        if (b.getTipologia()) {
            System.out.println("Il costo dell'affitto è di " + 20 * b.getLunghezza() * giorni + "eur");
        } else {
            System.out.println("Il costo dell'affitto è di " + 10 * b.getStazza() * giorni + "eur");
        }
        System.out.println("La barca è stata assegnata al posto " + posto);
    }

}
