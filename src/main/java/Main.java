import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String[] args){
        Persona persona1 = new Persona("Juan", "Otero");
        Persona persona2 = new Persona("Carlos", "Gomez");
        Persona persona3 = new Persona("Maria", "Lopez");
        Persona persona4 = new Persona("Ana", "Martinez");
        Persona persona5 = new Persona("Pedro", "Rodriguez");

        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        System.out.println("Personas de la lista ordenadas por el nombre");
        for (Persona persona : personas){
            System.out.println(persona);
        }

        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("Personas de la lista ordenadas por el apellido");
        for (Persona persona : personas){
            System.out.println(persona);
        }

        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("Personas de la lista ordenadas inversamente por el apellido");
        for (Persona persona : personas){
            System.out.println(persona);
        }


    }
}

