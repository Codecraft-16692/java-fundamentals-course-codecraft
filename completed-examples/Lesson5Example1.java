public class Mascota {

    private String nombre;
    private int energia;

    public Mascota(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    public void mostrarEstado() {
        System.out.println("Mascota: " + nombre + " | Energía: " + energia);
    }

    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Firulais", 100);
        miMascota.mostrarEstado();
    }
}
