import java.util.Scanner;
public class Ex1 {
    static void main() {
        String nome, curso;
        int idade;
        Scanner sc = new Scanner(System.in);

        IO.println("Cadastro do aluno\n\n" +
                "Insira seu nome: ");
        nome = sc.nextLine();

        IO.println("Em que curso você está matriculado?");
        curso = sc.nextLine();

        IO.println("Qual sua idade?");
        idade = sc.nextInt();

        IO.println("Nome do aluno: " + nome + "\n" +
                "Curso: " + curso + "\n" +
                "Idade: " + idade);
    }
}
