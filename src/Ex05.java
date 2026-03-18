import java.util.Scanner;
public class Ex05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double guardado, meta;
        meta = 500;
        IO.println("Quanto você guardou esse mês?");
        guardado = sc.nextDouble();
        if(guardado >= meta){
            IO.println("Você alcançou sua meta de dinheiro");
            IO.println("Você excedeu " + (guardado - meta) + " de dinheiro nesse mês.");
        }else {
            IO.println("Você não alcançou sua meta de dinheiro");
            IO.println("Faltaram " + (meta - guardado) + " guardados nesse mês.");
        }
    }
}