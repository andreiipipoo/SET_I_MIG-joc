public class Carta {
    private final String nom; //M'ha recomenat la propia IDE que utilitzi private final
    private final double valor; //M'ha recomenat la propia IDE que utilitzi private final

    public Carta(String nom, double valor){
        this.nom = nom;
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
    public String toString(){
        return nom;
    }
}
