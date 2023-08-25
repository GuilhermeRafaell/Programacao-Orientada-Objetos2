public class Vendedor implements Comissao {

    @Override
    public Double comissao(Double venda) {
        return venda * 0.02;
    }

}
