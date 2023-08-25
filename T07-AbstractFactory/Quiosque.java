public class Quiosque implements MaquinaBebida {

    private MaquinaBebida maquinaBebida;

    public Quiosque(MaquinaBebida maquinaBebida) {
        this.maquinaBebida = maquinaBebida;
    }

    public String pegarRefri() {
        return maquinaBebida.entregarRefrigerante();
    }

    public String pegarSuco() {
        return maquinaBebida.entregarSuco();
    }

}
