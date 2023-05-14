class Bebida extends ItemMenu {
    public Bebida() {
        super(2,"Bebida", 5.00);
    }

    @Override
    public String getDescricao() {
        return "Bebida (R$ 5.00)";
    }
}