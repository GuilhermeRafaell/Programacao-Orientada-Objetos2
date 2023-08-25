public class Main {
    public static void main(String[] args) {
        Atendente atend = new Atendente();
        Vendedor vend = new Vendedor();
        Gerente ger = new Gerente();
        Diretor dir = new Diretor();

        Funcionario f1 = new Funcionario("Atendente", 500.0, atend);
        f1.printComissao();

        Funcionario f2 = new Funcionario("Vendedor", 500.0, vend);
        // Funcionario f2 = new Funcionario("Vendedor", 500.0, ger); Faz com que o
        // vendedor receba comissão de gerente
        f2.printComissao();

        Funcionario f3 = new Funcionario("Gerente", 500.0, ger);
        f3.printComissao();

        Funcionario f4 = new Funcionario("Diretor", 500.0, dir);
        f4.printComissao();

    }
}
