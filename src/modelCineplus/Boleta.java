package modelCineplus;

import java.util.List;

public class Boleta {

    //Atributos de la clase Boleta
    public int codigo;
    public double valor;

    //Realciones de la clase Boleta
    private Asiento asiento;
    private List<Venta> listVentaBoletas;
    private List<Empresa> listEmpresaBoletas;
    private Funcion funcion;

}
