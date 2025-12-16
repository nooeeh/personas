package personas;
import java.util.regex.Pattern;

public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    static final int MAYORIA_EDAD = 18;
    static final int JUBILACION_EDAD = 65;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    Persona(String nombre, String apellidos, int edad){
        this("-", nombre, apellidos, edad);
    }
    
    public Persona() {
    	this("", "", "", 0);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad; 
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void updateEdad() {
        this.edad = this.edad + 1;
        
    }

    public boolean esMenor() {
        return this.edad < Persona.MAYORIA_EDAD;
    }
    
    public boolean esJubilado() {
    	return this.edad >= JUBILACION_EDAD;
    }

    public int diferenciaEdad(Persona p) {
        return this.edad - p.edad;
    }

    public void imprime() {
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
    }

    @Override
    public String toString(){
    	return "Persona{" + "nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", dni=" + this.dni + ", edad=" + this.edad + '}';
    }
    
    public static boolean validarDNI(String valor) {
        // Expresion regular que indica 8 digitos y al final alguna de las letras que se permiten
        // rangos A-H J-N P-T V-Z (recordad, algunas no se permiten)

        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
        return Pattern.matches(dniRegexp, valor);
    }
    
}