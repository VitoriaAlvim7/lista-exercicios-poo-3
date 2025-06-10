package planoTelefonia;

public class Plano {

    private int minutos;

    public Plano(int minutos) {
        this.minutos = minutos;
    }

    public double calcularValor() {
        if (minutos <= 100) {
            return 50.0;
        } else {
            return 50.0 + (minutos - 100) * 2.0;
        }
    }
}
