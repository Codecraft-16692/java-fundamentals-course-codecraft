public class MiPrograma {
    public static void main(String[] args) {

        // ERROR COMÚN 1: olvidar el punto y coma
        // Incorrecto: System.out.println("Hola")
        System.out.println("Hola");

        // ERROR COMÚN 2: escribir mal mayúsculas y minúsculas
        // Incorrecto: system.out.println("Hola");  -> Java distingue mayúsculas
        // Incorrecto: string nombre = "Ana";
        String nombre = "Ana";

        // ERROR COMÚN 3: confundir = (asignar) con == (comparar)
        int edad = 15;
        // Incorrecto: if (edad = 15)
        if (edad == 15) {
            System.out.println(nombre + " tiene 15 años");
        }

        // ERROR COMÚN 4: comparar textos con == en vez de equals
        String respuesta = "si";
        if (respuesta.equals("si")) {
            System.out.println("Respuesta correcta");
        }

        // ERROR COMÚN 5: dividir enteros y perder los decimales
        System.out.println("7 / 2 = " + (7 / 2));      // muestra 3
        System.out.println("7 / 2.0 = " + (7 / 2.0)); // muestra 3.5

    }
}
