package FOREACH3;

public class main {
    public static void main(String[] args) {
        String [] products = {"fuente de poder","board","cpu","gpu","perifericos","ram"};

        System.out.println("Estos son algunos de los productos que tenemos en la empresa");
        for(String product : products) {
            System.out.println(product);
        }
    }
}
