import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int fib1 = 0;
        int fib2 = 1;
        System.out.println("Por favor, digite um número: ");
        int num = sc.nextInt();
        while (num >= fib1 && num >= fib2){
            if (fib1 < fib2){
                fib1 = fib1 + fib2;
            } else{
                fib2 = fib2 + fib1;
            }
        }

        if (num == fib1 || num == fib2){
            System.out.println("O número faz parte da sequência de Fibonacci!");
        } else {
            System.out.println("O número não faz parte da sequência de Fibonacci");
        }
    }
}