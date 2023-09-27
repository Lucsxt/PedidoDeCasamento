import java.util.Scanner;

// By Sandro Lucas...
// For Nicole, my girlfriend!

public class Pedido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oi Nicole, tudo bem? (sim/não)");
        String resposta1 = scanner.nextLine();

        if (resposta1.equalsIgnoreCase("sim")) {
            System.out.println("Posso te fazer uma pergunta? (sim/não)");
            String resposta2 = scanner.nextLine();

            if (resposta2.equalsIgnoreCase("sim")) {
                System.out.println("Você realmente ama o Lucas? (sim/não)");
                String resposta3 = scanner.nextLine();

                if (resposta3.equalsIgnoreCase("sim")) {
                    System.out.println("Você quer continuar namorando com ele? (sim/não)");
                    String resposta4 = scanner.nextLine();

                    if (resposta4.equalsIgnoreCase("sim")) {
                        System.out.println("Então olha para o lado e aceite...");
                    } else {
                        System.out.println("Perdeu o presente");
                    }
                } else {
                    System.out.println("Perdeu o presente");
                }
            } else {
                System.out.println("Perdeu o presente");
            }
        } else {
            System.out.println("Perdeu o presente");
        }

        scanner.close();
    }
}
