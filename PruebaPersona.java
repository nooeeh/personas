package personas;

public class PruebaPersona {

    public static void main(String[] args) {
    	
         // Creamos varias instancias de personas
         Persona per1 = new Persona("20222444L", "María", "Carcelén Sánchez", 67);
         Persona per2 = new Persona("José", "Serrano Márquez", 25);
         Persona per3 = new Persona("64578488K","Pedro", "De la Calle García", 55);
         
         //Almacenamos las instancias de personas en un array
         Persona[] arrayPersonas = new Persona[3];
         arrayPersonas[0] = per1;
         arrayPersonas[1] = per2;
         arrayPersonas[2] = per3;
         
         //Imprimimos los datos de todas las personas
         System.out.println("LISTA DE PERSONAS:");
         System.out.println("----------------------------------");
         for (Persona per : arrayPersonas) {       
             per.imprime();
             System.out.println();
         }
        
        //Mostramos información de la edad sobre las
         System.out.println("EDAD DE PERSONAS:");
         System.out.println("----------------------------------");
         for (Persona per : arrayPersonas) {
             System.out.println("La persona con DNI: " + per.getDni() + " ¿es menor de edad? --> " + per.esMenor());
             System.out.println("La persona con DNI: " + per.getDni() + " ¿es jubilado/a? --> " + per.esJubilado());
             System.out.println();
         }
         
         //Mostramos la diferencia de edad entre dos personas
         System.out.println("DIFERENCIA DE EDAD DE PERSONAS:");
         System.out.println("----------------------------------");
         int dif=per1.diferenciaEdad(per2);
         System.out.println("Diferencia de edad entre persona 1 y persona 2 es de " + dif + " años");
    }
    
}
