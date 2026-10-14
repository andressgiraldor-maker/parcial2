package modelCineplus;

import java.util.ArrayList;
import java.util.List;

public class Operario {

    //Atributos de la clase Operario
    private int codigoEmpleado;
    private double fechaContratacion;
    private double salarioBasico;

    //Relaciones de la clase Operario
    private List<Venta> listOperarioVentas;

    public Operario(int codigoEmpleado, double fechaContratacion, double salarioBasico) {
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salarioBasico = salarioBasico;
        this.listOperarioVentas = new ArrayList<>();
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public double getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(double fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public List<Venta> getListOperarioVentas() {
        return listOperarioVentas;
    }

    public void setListOperarioVentas(List<Venta> listOperarioVentas) {
        this.listOperarioVentas = listOperarioVentas;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "codigoEmpleado=" + codigoEmpleado +
                ", fechaContratacion=" + fechaContratacion +
                ", salarioBasico=" + salarioBasico +
                ", listOperarioVentas=" + listOperarioVentas +
                '}';
    }
}
