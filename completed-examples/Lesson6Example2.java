public class MiPrograma {

    static final int NOTA_MINIMA = 11;

    public static void main(String[] args) {

        int notaFinal = 14;
        String nombreEstudiante = "Diego";

        System.out.println("[depuración] notaFinal = " + notaFinal);

        if (notaFinal >= NOTA_MINIMA) {
            System.out.println(nombreEstudiante + " aprobó el curso");
        } else {
            System.out.println(nombreEstudiante + " debe reforzar el curso");
        }

    }
}
