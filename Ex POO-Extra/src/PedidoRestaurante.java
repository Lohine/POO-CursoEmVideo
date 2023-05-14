import java.util.ArrayList;
import java.util.List;

class PedidoRestaurante implements Pedido {
    private String nomeCliente;
    private List<ItemMenu> itens;
    private static final double TAXA_SERVICO = 0.1;

    public PedidoRestaurante(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.itens = new ArrayList<>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public List<ItemMenu> getItens() {
        return itens;
    }

    public void adicionarItem(ItemMenu item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemMenu item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public double calcularTaxaServico() {
        return calcularTotal() * TAXA_SERVICO;
    }

    public double calcularTotalComTaxa() {
        return calcularTotal() + calcularTaxaServico();
    }

    public void exibirNotaFiscal() {
        System.out.println("\nNota Fiscal");
        System.out.println("------------");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Itens do Pedido: ");
        for (ItemMenu item : itens) {
            System.out.println("- " + item.getDescricao());
        }
        System.out.printf("Taxa de serviço (10%%): R$ %.2f\n", calcularTaxaServico());
        System.out.printf("Valor total: R$ %.2f\n", calcularTotalComTaxa());
    }
}