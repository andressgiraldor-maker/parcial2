package modelCineplus;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

    //Atributos de la clase Cliente
    private int codigoAfiliacion;
    private double procentajeDescuento;

    //Relaciones de la clase Cliente
    private List<Boleta> listClienteBoletas;

    public Cliente(int documento, String nombre, String correo, int telefono, int codigoAfiliacion, double procentajeDescuento) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.procentajeDescuento = procentajeDescuento;
        this.listClienteBoletas = new ArrayList<>();
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
        return listClienteBoletas;
    }

    public void setListClienteBoleta(List<Boleta> listClienteBoleta) {
        this.listClienteBoletas = listClienteBoletas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigoAfiliacion=" + codigoAfiliacion + "\n" +
                ", procentajeDescuento=" + procentajeDescuento + "\n" +
                ", listClienteBoletas=" + listClienteBoletas + "\n" +
                '}';
    }
}
