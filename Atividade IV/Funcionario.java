public class Funcionario implements Comissao {
    public String cargo;
    public Double valorVenda;
    public Comissao tipoComissao;

    public Funcionario(String cargo, Double valorVenda, Comissao tipoComissao) {
        this.cargo = cargo;
        this.valorVenda = valorVenda;
        this.tipoComissao = tipoComissao;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public String getCargo() {
        return cargo;
    }

    public Comissao getTipoComissao() {
        return tipoComissao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setTipoComissao(Comissao tipoComissao) {
        this.tipoComissao = tipoComissao;
    }

    public void printComissao() {
        System.out.println("Cargo: " + this.cargo + " ; Valor da venda: " + this.valorVenda + " ; Valor da comissão: "
                + this.tipoComissao.comissao(this.valorVenda));
    }

    @Override
    public Double comissao(Double venda) {
        // TODO Auto-generated method stub
        return null;
    }

}
