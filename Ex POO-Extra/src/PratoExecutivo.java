class PratoExecutivo extends ItemMenu {
    public PratoExecutivo() {
        super(1,"Prato executivo", 20.00);
    }

    @Override
    public String getDescricao() {
        return "Prato executivo (R$ 20.00)";
    }
}