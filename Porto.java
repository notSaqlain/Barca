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
        
        System.out.println("La barca " + b.getNome() + " è stata assegnata al posto " + posto);
        if (b.getTipologia()) {
            System.out.println("Il costo dell'affitto è di " + 20 * b.getLunghezza() * giorni + " eur");
        } else {
            System.out.println("Il costo dell'affitto è di " + 10 * b.getStazza() * giorni + " eur");
        }
        System.out.print("\n");
    }

}
