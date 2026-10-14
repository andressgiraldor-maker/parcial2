package modelCineplus;

import java.util.ArrayList;
import java.util.List;

public class Operario extends  Persona{

    //Atributos de la clase Operario
    private int codigoEmpleado;
    private double fechaContratacion;
    private double salarioBasico;

    //Relaciones de la clase Operario
    private List<Venta> listOperarioVentas;

    public Operario(int documento, String nombre, String correo, int telefono,int codigoEmpleado, double fechaContratacion, double salarioBasico) {
        super(documento, nombre, correo, telefono);
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
        return "Operario{" + "\n" +
                "codigoEmpleado=" + codigoEmpleado + "\n" +
                ", fechaContratacion=" + fechaContratacion + "\n" +
                ", salarioBasico=" + salarioBasico + "\n" +
                ", listOperarioVentas=" + listOperarioVentas + "\n" +
                '}';
    }
}
