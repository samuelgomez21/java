package Switch3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Colaboranos con tu opinion y di un numero");
        int k = sc.nextInt();

        Sisi sisi = new Sisi();


        sisi.Ciclo3(k);
        System.out.println("Ya sabiamos eso de Arle :)");
    }
}
