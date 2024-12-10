package diccionario;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("girl", "chica");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("coche", "car");
        diccionario.put("escuela", "school");
        diccionario.put("profesor", "teacher");
        diccionario.put("mar", "sea");
        diccionario.put("montaña", "mountain");
        diccionario.put("amigo", "friend");
        diccionario.put("hermano", "brother");
        diccionario.put("hermana", "sister");
        diccionario.put("padre", "father");
        diccionario.put("madre", "mother");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("ciudad", "city");
        diccionario.put("río", "river");
        diccionario.put("árbol", "tree");
        
        
        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());
        Random random = new Random();
        ArrayList<String> seleccionadas = new ArrayList<>();
        while (seleccionadas.size() < 5) {
            String palabra = palabras.get(random.nextInt(palabras.size()));
            if (!seleccionadas.contains(palabra)) {
                seleccionadas.add(palabra);
            }
        }

        Scanner scanner = new Scanner(System.in);
        int correctas = 0, incorrectas = 0;
        
        for (String palabra : seleccionadas) {
            System.out.println("Traduce al inglés: " + palabra);
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals(diccionario.get(palabra))) {
                System.out.println("¡Correcto!");
                correctas++;
            
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + diccionario.get(palabra));
                incorrectas++;
            }
        }


        System.out.println("\nResultados:");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}
