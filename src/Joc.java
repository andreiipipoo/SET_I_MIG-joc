import java.util.Stack;
public class Joc {
    private final Stack<Carta> MaJugador; //M'ha recomenat la propia IDE que utilitzi private final
    private final Baralla baralla; //M'ha recomenat la propia IDE que utilitzi private final
    public Joc(){
        MaJugador = new Stack<>();
        baralla = new Baralla();
    }
    public void jugar(){
        while (true){
            Carta carta = baralla.repartirCarta();
            if(carta != null){
                MaJugador.push(carta);
                double PuntuacioJugador = calcularPuntuacio(MaJugador);
                System.out.println("La teves cartes: " + MaJugador);
                System.out.println("La teva puntuació: " + PuntuacioJugador);

                if (PuntuacioJugador >= 7.5 || baralla.isEmpty()) {
                    break;
                }
            } else {
                System.out.println("La teva baralla està buida.");
                break;
            }
        }
        double PuntuacioJugador = calcularPuntuacio(MaJugador);
        System.out.println("La teva puntuació final: " + PuntuacioJugador);
    }
    private double calcularPuntuacio(Stack<Carta> baralla){
        double puntuacio = 0;
        for(Carta carta:baralla){
            puntuacio += carta.getValor();
        }
        return puntuacio;
    }

    public static void main(String[] args){
        Joc joc = new Joc();
        joc.jugar();
    }
}
