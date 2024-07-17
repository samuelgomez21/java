package Switch2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese un numero: ");

          int p = sc.nextInt();

          Sasa sa = new Sasa();

          sa.Caso2(p);

        System.out.println("Gracias por participar!!");
    }
}
