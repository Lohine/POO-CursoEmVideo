public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumconta(1);
        p1.setDono("Lohine");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumconta(2);
        p2.setDono("Case");
        p2.abrirConta("CP");

        p1.depositar(600);
        p2.depositar(500);
        p2.sacar(10);

        p1.sacar(150);
        p1.fecharConta();
        p1.statusAtual();
        p2.statusAtual();

    }
}