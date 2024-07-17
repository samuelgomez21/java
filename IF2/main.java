package IF2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero del 0 al 30 para ganarte una rifa: ");

        int t = sc.nextInt();

        Iff2 if2 = new Iff2();

        if2.Condicion2(t);

        System.out.println("Si no fue esta, sera la proxima :)");
    }
}
