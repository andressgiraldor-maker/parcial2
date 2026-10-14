package modelCineplus;

import java.util.ArrayList;
import java.util.List;

public class Funcion {

    //Atributos de la clase Funcion
    public int codigo;
    public String fechaPresentacion;
    public String horaInicio;
    public Double precioBoleta;

    //Relaciones de la clase Funcion
    private List<Boleta> listFuncionBoletas;


    /**
     * metodo constructor de la clase Funcion
     * @param codigo de la funcion
     * @param fechaPresentacion de la funcion
     * @param horaInicio de la funcion
     * @param precioBoleta de la funcion
     */

    public Funcion(int codigo, String fechaPresentacion, String horaInicio, Double precioBoleta) {

        this.codigo = codigo;
        this.fechaPresentacion = fechaPresentacion;
        this.horaInicio = horaInicio;
        this.precioBoleta = precioBoleta;
        this.listFuncionBoletas= new ArrayList<>();

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(String fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Double getPrecioBoleta() {
        return precioBoleta;
    }

    public void setPrecioBoleta(Double precioBoleta) {
        this.precioBoleta = precioBoleta;
    }

    public List<Boleta> getListFuncionBoletas() {
        return listFuncionBoletas;
    }

    public void setListFuncionBoletas(List<Boleta> listFuncionBoletas) {
        this.listFuncionBoletas = listFuncionBoletas;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "codigo=" + codigo + "\n" +
                ", fechaPresentacion='" + fechaPresentacion + "\n" +
                ", horaInicio='" + horaInicio + "\n" +
                ", precioBoleta=" + precioBoleta + "\n" +
                ", listFuncionBoletas=" + listFuncionBoletas + "\n" +
                '}';
    }
}



