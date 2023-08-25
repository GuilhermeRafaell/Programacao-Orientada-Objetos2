public class Gerente implements Comissao {

    @Override
    public Double comissao(Double venda) {
        return venda * 0.03;
    }
}
