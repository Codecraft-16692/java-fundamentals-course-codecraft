public class MiPrograma {

    // Buena práctica: valores fijos como constantes en MAYÚSCULAS
    static final int NOTA_MINIMA = 11;

    public static void main(String[] args) {

        // Buena práctica: nombres de variables que expliquen qué guardan
        // Mal:   int x = 14;
        // Bien:
        int notaFinal = 14;
        String nombreEstudiante = "Diego";

        // Buena práctica: imprimir valores para depurar (encontrar errores)
        System.out.println("[depuración] notaFinal = " + notaFinal);

        if (notaFinal >= NOTA_MINIMA) {
            System.out.println(nombreEstudiante + " aprobó el curso");
        } else {
            System.out.println(nombreEstudiante + " debe reforzar el curso");
        }

    }
}
