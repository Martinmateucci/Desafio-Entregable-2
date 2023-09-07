//Paquete del archivo
package ListarPersonaMateucci;

//Nombre de la clase
public class Persona {
    //Se definen los atributos
    String nombre;
    String apellido;

    

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Se crean los metodos getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
