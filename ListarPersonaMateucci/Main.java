package ListarPersonaMateucci;

//importacion del arraylist
import java.util.ArrayList;
//importacion de la coleccion
import java.util.Collections;
//importacion del comparador
import java.util.Comparator;
//importacion de la list
import java.util.List;

//extension de la clase persona
public class Main extends Persona{
    public Main(String nombre, String apellido) {
       
        super(nombre, apellido);
    }

    public static void main(String[] args) {
        //creo un ArrayList
List<Persona> listaPersonas = new ArrayList<>();

        //Creo los 5 objetos
        Persona persona0 = new Persona("Martin", "Mateucci");
        Persona persona1 = new Persona("Juan", "Ruiz");
        Persona persona2 = new Persona("Luis", "Salvatierra");
        Persona persona3 = new Persona("Celina", "Monteverde");
        Persona persona4 = new Persona("Catalina", "Gomez");

        //Agrego los objetos a la lista
        listaPersonas.add(persona0);
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);

    
    // Ordenar por nombre
        Collections.sort(listaPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getNombre().compareTo(persona2.getNombre());
            }
        });

        System.out.println("Ordenado por nombre:");
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
        }

        // Ordenar por apellido
        Collections.sort(listaPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getApellido().compareTo(persona2.getApellido());
            }
        });

        System.out.println("\nOrdenado por apellido:");
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
        }

        // Ordenar inversamente por apellido
        Collections.sort(listaPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona2.getApellido().compareTo(persona1.getApellido());
            }
        });

        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
        }
    }

}
