import java.util.Scanner;
public class Ex2 {
    static void main() {
        String nome, prato;
        double valor;
        Scanner sc = new Scanner(System.in);

        IO.println("---------RESTAURANTE NICK'S BURGER---------");
        IO.println("\n\nRegistro do pedido:");

        IO.println("Nome do cliente: ");
        nome = sc.nextLine();

        IO.println("Prato escolhido: ");
        prato = sc.nextLine();

        IO.println("Valor do prato: ");
        valor = sc.nextDouble();

        IO.println("----------REGISTRO DO PEDIDO----------");
        IO.println("Nome do cliente: " + nome + "\n" +
                "Prato escolhido: " + prato + "\n" +
                "Valor: " + valor);
    }
}
