import java.util.Random;
import java.util.Stack;

public class Baralla {
    private Stack<Carta> cartas;
    private final Random random;  //M'ha recomenat la propia IDE que utilitzi private final

    public Baralla(){
        cartas = new Stack<>();
        random = new Random();
        inicialitzarBaralla();
    }
    private void barrejarBaralla(){
        Stack<Carta> BarallaBarrejada = new Stack<>();
        while (!cartas.isEmpty()) {
            int index = random.nextInt(cartas.size());
            BarallaBarrejada.push(cartas.remove(index));
        }
        cartas = BarallaBarrejada;
    }
    private void inicialitzarBaralla(){
        String[] noms = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
        double[] valors = {1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5};

        for (int i=0; i< noms.length;i++){
            Carta carta = new Carta(noms[i], valors[i]);
            for (int j = 0; j<4; j++){
                cartas.push(carta); //Afegeix 4 copias de cada carta a la baralla
            }
        }
        barrejarBaralla();
    }
    public Carta repartirCarta(){
        if(!cartas.isEmpty()){
            return cartas.pop();
        }
        return null;
    }
    public boolean isEmpty() {
        return cartas.isEmpty();
    }
}
