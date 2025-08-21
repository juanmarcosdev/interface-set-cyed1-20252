import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class InterfaceSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> hashSet = new HashSet<>();       // No garantiza orden
        Set<String> linkedHashSet = new LinkedHashSet<>(); // Mantiene el orden de inserción
        Set<String> treeSet = new TreeSet<>();   


        System.out.println("5 palabras para HashSet:");
        for (int i = 0; i < 5; i++) {
            hashSet.add(scanner.nextLine());
        }

        System.out.println("\n5 palabras para LinkedHashSet:");
        for (int i = 0; i < 5; i++) {
            linkedHashSet.add(scanner.nextLine());
        }

        System.out.println("\n5 palabras para TreeSet:");
        for (int i = 0; i < 5; i++) {
            treeSet.add(scanner.nextLine());
        }


        System.out.println("\nHashSet (sin orden definido): " + hashSet);
        System.out.println("LinkedHashSet (mantiene orden de inserción): " + linkedHashSet);
        System.out.println("TreeSet (orden automatico): " + treeSet);

        // -------- Operaciones de conjuntos ---------

        // UNION (addAll)
        Set<String> union = new HashSet<>(hashSet);
        union.addAll(linkedHashSet); 
        System.out.println("\nUnion (hashSet U linkedHashSet): " + union);

        // INTERSECCIÓN (retainAll)
        Set<String> interseccion = new HashSet<>(hashSet);
        interseccion.retainAll(linkedHashSet);
        System.out.println("Interseccion (hashSet intersec linkedHashSet): " + interseccion);

        // DIFERENCIA (removeAll)
        Set<String> diferencia = new HashSet<>(hashSet);
        diferencia.removeAll(linkedHashSet);
        System.out.println("Diferencia (hashSet - linkedHashSet): " + diferencia);

        scanner.close();
    }
}
