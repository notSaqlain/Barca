public class Barca {
    private String nome;
    private String nazionalita;
    private int lunghezza;
    private int stazza;
    private boolean tipologia;

    public Barca(String nome, String nazionalita, int lunghezza, int stazza, boolean tipologia) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipologia = tipologia;
    }

    public String getNome() {
        return nome;
    }

    public String getNazionalita(){
        return nazionalita;
    }

    public int getLunghezza(){
        return lunghezza;
    }

    public int getStazza(){
        return stazza;
    }

    public boolean getTipologia(){
        return tipologia;
    }
}
