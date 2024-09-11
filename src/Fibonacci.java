import java.util.Scanner;

public class Fibonacci {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int numero = scanner.nextInt();

        if (isFibonacci(numero)){
            System.out.println("O número "+ numero+ " faz parte da sequência de Fibonacci!");
        }else{
            System.out.println("O número " + numero+ " não faz parte da sequência de Fibonacci!");
        }
        scanner.close();
    }

    public static boolean isFibonacci(int numero){
        int fib1 = 0;
        int fib2 = 1;
        int fibNext = 0;

        while (fibNext < numero){
            fibNext = fib1+fib2;
            fib1 = fib2;
            fib2 = fibNext;
        }
        return fibNext == numero || numero ==0;
    }
}