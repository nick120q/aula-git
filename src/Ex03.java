import java.util.Scanner;
public class Ex03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nickname, favgame;
        double pt;
        IO.println("Perfil de jogos\n");
        IO.println("Qual seu nickname?");
        nickname = sc.nextLine();
        IO.println("Qual seu jogo favorito?");
        favgame = sc.nextLine();
        IO.println("Qual sua pontuação atual?");
        pt = sc.nextDouble();

        IO.println("Perfil de jogador.\n" +
                "Nickname: " + nickname + "\n" +
                "Jogo favorito: " + favgame + "\n" +
                "Pontuação atual: " + pt);
    }
}
