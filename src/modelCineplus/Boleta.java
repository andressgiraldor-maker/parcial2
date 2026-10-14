package modelCineplus;

import java.util.List;

public class Boleta {

    //Atributos de la clase Boleta
    public int codigo;
    public double valor;

    //Realciones de la clase Boleta
    private Asiento asiento;

    /**
     * metodo constructor de la clase Boleta
     * @param codigo de la boleta
     * @param valor de la boleta
     * @param asiento de la boleta
     */

    public Boleta(int codigo, double valor, Asiento asiento) {
        this.codigo = codigo;
        this.valor = valor;
        this.asiento = asiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "codigo=" + codigo + "\n" +
                ", valor=" + valor + "\n" +
                ", asiento=" + asiento + "\n" +
                '}';
    }
}
