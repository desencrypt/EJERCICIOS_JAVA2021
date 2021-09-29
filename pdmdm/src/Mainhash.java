//Main Hash MAIN 5
import java.util.ArrayList;
import java.util.HashMap;

public class Mainhash {
    public static void main(String[] args) {
        //clave/key jugador y value/valor equipo.
        HashMap<String, String> hmJugadores = new HashMap<String, String>();
        hmJugadores.put("Moran","Barcelona");
        hmJugadores.put("Vera","Pozuelo");
        hmJugadores.put("Recio","Retamar");
        hmJugadores.put("Maset","Madrid");
        hmJugadores.put("Vinisius","Madrid");
        hmJugadores.put("Ramos","PSG");
        System.out.println(hmJugadores);
        System.out.println("el equipo de recio es "+hmJugadores.get("Recio"));
        System.out.println("el equipo de recio es "+hmJugadores.get("RECIO"));
        // escribir los jugadores del Madrid

        //String s = getKeysFromValue("",hmJugadores);
    }
    {
        private static ArrayList<String> getKeysFromValue(String sValue,HashMap<String, String>)
    }








}
