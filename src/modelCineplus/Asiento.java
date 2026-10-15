package modelCineplus;

public class Asiento {
    //Atributos de la clase asiento
    public int fila;
    public int columna;

    // Relaciones
    private Boleta boleta;
    private EstadoAsiento estadoAsiento;

    /**
     * metodo constructor de la clase Asiento
     * @param fila de la sala
     * @param columna de la sala
     */

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "fila=" + fila + "\n" +
                ", columna=" + columna + "\n" +
                '}';
    }
}
