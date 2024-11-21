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

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNazionalita(String nazionalita){
        this.nazionalita = nazionalita;
    }

    public void setLunghezza(int lunghezza){
        this.lunghezza = lunghezza;
    }

    public void setStazza(int stazza){
        this.stazza = stazza;
    }

    public void setTipologia(boolean tipologia){
        this.tipologia = tipologia;
    }
    
    @Override
    public String toString(){
        if (tipologia){
            return "Nome: " + nome + " | Nazionalita: " + nazionalita + " | Lunghezza: " + lunghezza + " | Stazza: " + stazza + " | Tipologia: Motore";
        } else {
            return "Nome: " + nome + " | Nazionalita: " + nazionalita + " | Lunghezza: " + lunghezza + " | Stazza: " + stazza + " | Tipologia: Vela";
        }
    }
}
