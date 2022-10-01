public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Federico", "García", "Lorka", "Escritor", "Español"};

        String nombreCompleto = "";
        for (String nombre : nombres) {
            //nombreCompleto = nombreCompleto + " " + nombre;
            
        }
        //System.out.println(nombreCompleto);

        //Creamos el array de tipo String
        String[] texto = new String[]{"Texto 1 ", "Texto 2 ", "Texto 3 "};

        //Recorremos el array y mostramos su contenido
        for (int i = 0; i < texto.length; i++) {
            System.out.print(texto[i]);
        }
    }
}

