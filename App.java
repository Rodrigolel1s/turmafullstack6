import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.println("Digite o valor de y: ");
        int y = sc.nextInt();

        sc.close();

        double media = (x + y) /2.0;
        
        System.out.printf("A media de X e Y eh: %.2f\n", media);


    }
    
}
