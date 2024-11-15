import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Barca> barche = new ArrayList<Barca>();
        
        Barca b1 = new Barca("Barca1", "Italia", 10, 100, true);
        Barca b2 = new Barca("Barca2", "Spagna", 20, 200, false);
        Barca b3 = new Barca("Barca3", "Francia", 30, 300, true);
        
        barche.add(b1);
        barche.add(b2);
        barche.add(b3);
        
        for(Barca b : barche){
            System.out.println(b);
        }

        Porto p = new Porto();
        p.assegnaPosto(b1, 5);
        p.assegnaPosto(b2, 5);
        p.assegnaPosto(b3, 5);

    }
}