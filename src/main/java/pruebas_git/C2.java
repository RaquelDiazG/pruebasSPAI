package pruebas_git;

public class C2 {

    private int denominador;

    private int numerador;

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return "C2 [denominador=" + denominador + ", numerador=" + numerador + "]";
    }

}
