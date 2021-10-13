//Main Hash MAIN 5
import java.util.ArrayList;
import java.util.HashMap;

public class Mainhash {
    public static void main(String[] args) {

        //clave/key jugador y value/valor equipo.
        HashMap<String, String> hmJugadores = new HashMap<String, String>();
        hmJugadores.put("Moran", "Barcelona");
        hmJugadores.put("Vera", "Pozuelo");
        hmJugadores.put("Recio", "Retamar");
        hmJugadores.put("Maset", "Madrid");
        hmJugadores.put("Vinisius", "Madrid");
        hmJugadores.put("Ramos", "PSG");
        System.out.println(hmJugadores);
        System.out.println("el equipo de recio es " + hmJugadores.get("Recio"));
        System.out.println("el equipo de recio es " + hmJugadores.get("RECIO"));


        // escribir los jugadores del Madrid
        //utilizamos un metodo que devuelva las claves de valor

        System.out.println(getKeysFromValue("Madrid", hmJugadores));

        // crear otra estructura HASH con clave jugador y valor nacionalidad
        //crear funcion getNumberFromequipo, que dado una nacionalidad
        //devuelva el numero de jugadores de esa nacionalidad y
        // ese equipo.

        HashMap<String, String> hmNacionalidades = new HashMap<String, String>();
        hmNacionalidades.put("Moran", "España");
        hmNacionalidades.put("Vera", "Italia");
        hmNacionalidades.put("Recio", "España");
        hmNacionalidades.put("Maset", "Francia");
        hmNacionalidades.put("Vinisius", "España");
        hmNacionalidades.put("Ramos", "Francia");
        System.out.println(hmJugadores);
        System.out.println("el equipo de recio es " + hmJugadores.get("Recio"));
        System.out.println("el equipo de recio es " + hmJugadores.get("RECIO"));

        //int numero = getNumberNacFinc
        int numeroJugadores = getNumberNacFromEquipo("Madrid", "España",hmJugadores,hmNacionalidades);
        System.out.println("El numeroo de jugadores es "+numeroJugadores);

        //clases/objetos, los introducidos en arraylist y hash
    }

    private static int getNumberNacFromEquipo(String sEquipo, String sPais, HashMap<String, String> hmJugadoresLocal, HashMap<String, String> hmNacionalidadesLocal)
    {
        ArrayList<String> alJugadores = getKeysFromValue(sEquipo,hmJugadoresLocal);
        int intContador = 0;
        for (String jugador: alJugadores)
        {
            if(hmNacionalidadesLocal.get(jugador).equals(sPais))
            {
                intContador++;
            }
        }

        return intContador;
    }
        private static ArrayList<String> getKeysFromValue(String sValue, HashMap<String, String> hMap)
        {
            ArrayList<String> resultado = new ArrayList<>();
            for (String i : hMap.keySet())
            {
                if (hMap.get(i).equals(sValue))
                {
                    resultado.add(i);
                }
            }
            return resultado;

        }
