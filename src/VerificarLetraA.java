import java.util.Scanner;

public class VerificarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contador = contarLetraA(frase);

        if(contador>0){
            System.out.println("A letra 'A' aparece "+ contador + " vezes na frase.");
        }else {
            System.out.println("A frase não tem nenhuma letra 'A'!");
        }

    }

    public static int contarLetraA(String frase){
        int contador = 0;

        for (int i=0; i<frase.length(); i++){
            char letra = frase.charAt(i);

            if (letra == 'A' || letra == 'a'){
                contador++;
            }
        }
        return contador;
    }
}
