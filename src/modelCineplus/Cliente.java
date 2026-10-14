package modelCineplus;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

    //Atributos de la clase Cliente
    private int codigoAfiliacion;
    private double procentajeDescuento;

    //Relaciones de la clase Cliente
    private List<Boleta> listClienteBoleta;

    public Cliente(int documento, String nombre, String correo, int telefono, int codigoAfiliacion, double procentajeDescuento) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.procentajeDescuento = procentajeDescuento;
        this.listClienteBoleta = new ArrayList<>();
    }

    public int getCodigoAfiliacion() {
        return codigoAfiliacion;
    }

    public void setCodigoAfiliacion(int codigoAfiliacion) {
        this.codigoAfiliacion = codigoAfiliacion;
    }

    public double getProcentajeDescuento() {
        return procentajeDescuento;
    }

    public void setProcentajeDescuento(double procentajeDescuento) {
        this.procentajeDescuento = procentajeDescuento;
    }

    public List<Boleta> getListClienteBoleta() {
        return listClienteBoleta;
    }

    public void setListClienteBoleta(List<Boleta> listClienteBoleta) {
        this.listClienteBoleta = listClienteBoleta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigoAfiliacion=" + codigoAfiliacion +
                ", procentajeDescuento=" + procentajeDescuento +
                ", listClienteBoleta=" + listClienteBoleta +
                '}';
    }
}
