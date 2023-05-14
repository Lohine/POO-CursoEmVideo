
abstract class ItemMenu {
    private int codigo;
    private String nome;
    private double preco;

    public ItemMenu(int codigo,String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract String getDescricao();
}
