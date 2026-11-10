public class MiPrograma {
    public static void main(String[] args) {

        int nota1 = 15;
        int nota2 = 18;
        int nota3 = 12;

        // Operaciones con variables
        int suma = nota1 + nota2 + nota3;
        double promedio = suma / 3.0;   // 3.0 para obtener decimales

        System.out.println("Suma de notas: " + suma);
        System.out.println("Promedio: " + promedio);

        // Una variable puede cambiar su valor
        int edad = 14;
        edad = edad + 5;
        System.out.println("En 5 años tendrás: " + edad + " años");

    }
}
