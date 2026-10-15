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

    /**
     * metodo para agrear una boleta a la venta
     * @param codigo de la boleta
     * @param valor de la boleta
     * @param asiento de la boleta
     * @return
     */

    public boolean agregarBoleta(int codigo, double valor, Asiento asiento){
        boolean existe= false;
        Boleta boleta= buscarBoleta(codigo);

        if (boleta==null) {

            Boleta bolet= new Boleta(codigo, valor, asiento);
            listVentaBoletas.add(bolet);
            existe= true;

        }
        return existe;

    }

    /**
     * metodo para buscar una boleta
     * @param codigo de la boleta
     * @return
     */

    public Boleta buscarBoleta(int codigo ){
        Boleta encontrada= null;

        for(int i=0; i<listVentaBoletas.size(); i++){
            Boleta boleta= listVentaBoletas.get(i);
            if(boleta.getCodigo()== codigo){
                encontrada= boleta;

            }

        }
        return  encontrada;
    }

    /**
     * metodo para calcula el valor total de una venta
     * @return
     */
    public double calcularPrecioVenta(){
        double total = 0;
        for(Boleta boleta1 : listVentaBoletas){
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
