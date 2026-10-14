package modelCineplus;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    // atributos de la clase venta
    public int codigo;
    public String fechaRealizacion;

    // relaciones
    private List<Boleta> listVentaBoletas;

    /**
     * metodo constructor de la clase Venta
     * @param codigo de la venta
     * @param fechaRealizacion de la venta
     */

    public Venta(int codigo, String fechaRealizacion ) {
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.listVentaBoletas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public List<Boleta> getListVentaBoletas() {
        return listVentaBoletas;
    }

    public void setListVentaBoletas(List<Boleta> listVentaBoletas) {
        this.listVentaBoletas = listVentaBoletas;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "codigo=" + codigo + "\n" +
                ", fechaRealizacion='" + fechaRealizacion + "\n" +
                ", listVentaBoletas=" + listVentaBoletas + "\n" +
                '}';
    }
}
