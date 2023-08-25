public class MaquinaBebida {
    // early instantiation
    private static MaquinaBebida instance = new MaquinaBebida();

    private MaquinaBebida() {
    }

    public static MaquinaBebida getInstance() {
        return instance;
    }

    public String entregarRefrigerante();

    public String entregarSuco();

}
