public class Main {
    public static void main(String[] args) {
        // Criando um Quiosque Coca-Cola
        MaquinaBebida maquinaBebida = new MaquinaCocaColaCompany();
        Quiosque quiosque = new Quiosque(maquinaBebida);
        System.out.println(quiosque.entregarRefrigerante());
        System.out.println(quiosque.entregarSuco());
        
        // Criando um Quiosque Ambev
        maquinaBebida = new MaquinaAmbev();
        quiosque = new Quiosque(maquinaBebida);
        System.out.println(quiosque.entregarRefrigerante());
        System.out.println(quiosque.entregarSuco());

    }

}
