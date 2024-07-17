package FOREACH1;

public class main {
    public static void main(String[] args) {
        String[] nombres = {"Arle", "Manolo", "Peter", "Miguel", "Samuel"};


        System.out.println("Estos son los estudiantes del semestre II:");
        for (String nombre : nombres) {
            System.out.println(nombre);

        }
    }
}
