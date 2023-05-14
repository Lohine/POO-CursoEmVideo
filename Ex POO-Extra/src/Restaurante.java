import java.util.Scanner;

public class Restaurante {
    private static Scanner scanner = new Scanner(System.in);
    private static PedidoRestaurante pedido;

    public static void main(String[] args) {
        exibirMenu();
        scanner.close();
    }

    private static void exibirMenu() {

        while (true) {
            System.out.println("\n------------------- Bem vindo ao Restaurante -------------------");
            System.out.println("1 - Fazer Pedido");
            System.out.println("2 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            if (opcao == 2) {
                System.out.println("Encerrando o programa...");
                break;
            }

            switch (opcao) {
                case 1:
                    fazerPedido();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void fazerPedido() {
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        pedido = new PedidoRestaurante(nomeCliente);

        System.out.println("\nCardápio");
        System.out.println("1 - Prato Executivo (R$ 20.00)");
        System.out.println("2 - Bebida (R$ 5.00)");
        System.out.println("3 - Sobremesa (R$ 10.00)");
        System.out.println("4 - SelfService (R$ 22.50)");
        System.out.println("0 - Finalizar pedido");
        
        while (true) {
            System.out.print("Digite o número do item desejado ou 0 para finalizar o pedido: ");
            int item = scanner.nextInt();
            scanner.nextLine();

            if (item == 0) {
                break;
            }

            switch (item) {
                case 1:
                    pedido.adicionarItem(new PratoExecutivo());
                    break;
                case 2:
                    pedido.adicionarItem(new Bebida());
                    break;
                case 3:
                    pedido.adicionarItem(new Sobremesa());
                    break;
                case 4:
                    pedido.adicionarItem(new SelfService());
                    break;    
                default:
                    System.out.println("Opção inválida!");
            }
        }

        System.out.println("Pedido finalizado!");

        pedido.exibirNotaFiscal();

        System.out.print("\nDigite o valor recebido: ");
        double valorRecebido = scanner.nextDouble();

        double troco = valorRecebido - pedido.calcularTotalComTaxa();

        System.out.printf("Troco: R$ %.2f\n", troco);

    }
}
