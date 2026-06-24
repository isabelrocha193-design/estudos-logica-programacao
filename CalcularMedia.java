import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner ler = new Scanner(System.in);

        double n1, n2, n3;
        System.out.println("Digite tres notas: ");

        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        n3 = ler.nextDouble();
        double media = (n1+n2+n3)/3;
        double resultado = (media/2+ 4);

        System.out.println("O valor final é " +resultado);
    }
}
