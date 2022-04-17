import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * @author autourducode
 */
public class Java8StreamFilter {
    public static void main(String[] args) {
        // Liste des fruits
        Stream<String> fruits = Stream.of("Pomme", "Mangue", "Fraise", "Banane", "Avocat", "Framboise");
        // filtre des fruits contenant 'm' dans le nom
        fruits.filter(f -> f.contains("m")).forEach(System.out::println);
        // Affiche: Pomme, Framboise
        // filtre des fruits ayant plus de 6 caractères dans le nom
        fruits.filter(f -> f.length() > 6).forEach(System.out::println);
        // Affiche: Framboise
    }
}
