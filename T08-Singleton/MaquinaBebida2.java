public class MaquinaBebida {
    // lazy instantiation
    private static MaquinaBebida instance = null;

    private MaquinaBebida() {
    }

    public static synchronized MaquinaBebida getInstance() {
        if (instance == null) {
            instance = new MaquinaBebida();
            return instance;
        }
    }

    public String entregarRefrigerante() {
        System.out.println("Pegou o refrigerante");
    }

    public String entregarSuco() {
        System.out.println("Pegou o Suco");
    }

}
