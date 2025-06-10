package medidorGlicose;

public class MedidorGlicose {

    private float valorGlicose;

    public MedidorGlicose(float valorGlicose) {
        this.valorGlicose = valorGlicose;
    }

    public String classificarGlicose() {
        if (valorGlicose <= 100) {
            return "Normal";
        } else if (valorGlicose >= 101 && valorGlicose <= 140) {
            return "Elevado";
        } else{
            return "Diabetes";
        }
    }
}
