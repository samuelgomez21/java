package FOREACH2;

public class main {
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};

        System.out.println("Esta es una secuencia de unos cuantos numeros pares");
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
