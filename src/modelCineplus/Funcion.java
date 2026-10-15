package modelCineplus;

import java.util.ArrayList;
import java.util.List;

public class Funcion {

    //Atributos de la clase Funcion
    public int codigo;
    public String fechaPresentacion;
    public String horaInicio;
    public Double precioBase;

    //Relaciones de la clase Funcion
    private List<Boleta> listFuncionBoletas;
    private Pelicula pelicula;
    private Sala sala;


    /**
     * metodo constructor de la clase Funcion
     * @param codigo de la funcion
     * @param fechaPresentacion de la funcion
     * @param horaInicio de la funcion
     * @param precioBase de la funcion
     */

    public Funcion(int codigo, String fechaPresentacion, String horaInicio, Double precioBase) {

        this.codigo = codigo;
        this.fechaPresentacion = fechaPresentacion;
        this.horaInicio = horaInicio;
        this.precioBase = precioBase;
        this.listFuncionBoletas= new ArrayList<>();

    }

    /**
     * metodo para calcular el precio de una boleta
     * @param cliente quien compra
     * @return
     */
    public double calcularPrecioBoleta(Cliente cliente){
        double recargo = 0;
        TipoSala tipo = sala.getTipoSala();
        if(tipo == TipoSala.VIP){
            recargo = 0.30;
        }else if(tipo == TipoSala.TRES_D){
            recargo = 0.20;
        }
        double valor = precioBase * (1 + recargo);
        valor = valor * (1- cliente.getProcentajeDescuento() / 100);
        return valor;
    }

    /**
     * metodo para calcular ingresos por funcion
     * @return
     */
    public double calcularIngresos(){
        double total= 0;
        for(Boleta boleta1 : listFuncionBoletas){
            total += boleta1.getValor();
        }
        return total;
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

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
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
                ", precioBase=" + precioBase + "\n" +
                ", listFuncionBoletas=" + listFuncionBoletas + "\n" +
                '}';
    }
}



