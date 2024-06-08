import java.util.ArrayList;
//USAMOS EL METODO SORT DE LA CLASE COLLECTIONS PARA ORDENAR LA LISTA DE OBJETOS PERSONA//
import java.util.Collections;
//USAMOS COMPARATOR PARA ORDENAR LA LISTA DE PERSONAS DE 3 MANERAS DIFERENTES//
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String[] args){
        //CREAMOS LOS OBJETOS PERSONA QUE VAN A ESTAR EN LA LISTA//
        Persona persona1 = new Persona("Juan", "Otero");
        Persona persona2 = new Persona("Carlos", "Gomez");
        Persona persona3 = new Persona("Maria", "Lopez");
        Persona persona4 = new Persona("Ana", "Martinez");
        Persona persona5 = new Persona("Pedro", "Rodriguez");

        //AÑADIMOS LOS OBJETOS PERSONA AL ARRAYLIST/
        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        //ORDENAR POR NOMBRES, UTILIZAMOS COMPARATOR PARA COMPARAR LOS NOMBRES DE LAS PERSONAS//
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        System.out.println("Personas de la lista ordenadas por el nombre");
        for (Persona persona : personas){
            System.out.println(persona);
        }

        //ORDENAR POR APELLIDOS, UTILIZAMOS COMPARATOR PARA COMPARAR LOS APELLIDOS DE LAS PERSONAS//
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("Personas de la lista ordenadas por el apellido");
        for (Persona persona : personas){
            System.out.println(persona);
        }

        //ORDENAR POR APELLIDOS DE MANERA INVERSA, UTILIZAMOS COMPARATOR PARA COMPARAR LOS APELLIDOS DE LAS PERSONAS PERO LUEGO LLAMAMAOS AL METODO REVERSED PARA INVERTIR EL ORDEN DE LA COMPARACION//
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("Personas de la lista ordenadas inversamente por el apellido");
        for (Persona persona : personas){
            System.out.println(persona);
        }


    }
}

