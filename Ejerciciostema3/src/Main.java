public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Federico", "García", "Lorka", "Escritor", "Español"};

        String nombreCompleto = "";
        for (String nombre : nombres) {
            nombreCompleto = nombreCompleto + " " + nombre;
        }
        System.out.println(nombreCompleto);
    }
}

