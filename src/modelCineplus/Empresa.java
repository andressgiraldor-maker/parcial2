package modelCineplus;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    //Atributos de la clase Empresa
    public String nombre;
    public String NIT;
    public String direccion;

    //Relaciones de la clase Empresa
    private List<Pelicula> listEmpresaPeliculas;
    private List<Sala> listEmpresaSalas;
    private List<Funcion> listEmpresaFuncions;
    private List<Persona> listEmpresaPersonas;
    private List<Venta> listEmpresaVentas;

    /**
     * metodo contructor de la clase Empresa
     * @param nombre de la empresa
     * @param NIT de la empresa
     * @param direccion de la empresa
     */
    public Empresa(String nombre, String NIT, String direccion) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.direccion = direccion;

        this.listEmpresaPeliculas = new ArrayList<>();
        this.listEmpresaSalas = new ArrayList<>();
        this.listEmpresaFuncions = new ArrayList<>();
        this.listEmpresaPersonas = new ArrayList<>();
        this.listEmpresaVentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Pelicula> getListEmpresaPeliculas() {
        return listEmpresaPeliculas;
    }

    public void setListEmpresaPeliculas(List<Pelicula> listEmpresaPeliculas) {
        this.listEmpresaPeliculas = listEmpresaPeliculas;
    }

    public List<Sala> getListEmpresaSalas() {
        return listEmpresaSalas;
    }

    public void setListEmpresaSalas(List<Sala> listEmpresaSalas) {
        this.listEmpresaSalas = listEmpresaSalas;
    }

    public List<Funcion> getListEmpresaFuncions() {
        return listEmpresaFuncions;
    }

    public void setListEmpresaFuncions(List<Funcion> listEmpresaFuncions) {
        this.listEmpresaFuncions = listEmpresaFuncions;
    }

    public List<Persona> getListEmpresaPersonas() {
        return listEmpresaPersonas;
    }

    public void setListEmpresaPersonas(List<Persona> listEmpresaPersonas) {
        this.listEmpresaPersonas = listEmpresaPersonas;
    }

    public List<Venta> getListEmpresaVentas() {
        return listEmpresaVentas;
    }

    public void setListEmpresaVentas(List<Venta> listEmpresaVentas) {
        this.listEmpresaVentas = listEmpresaVentas;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", NIT='" + NIT + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listEmpresaPeliculas=" + listEmpresaPeliculas +
                ", listEmpresaSalas=" + listEmpresaSalas +
                ", listEmpresaFuncions=" + listEmpresaFuncions +
                ", listEmpresaPersonas=" + listEmpresaPersonas +
                ", listEmpresaVentas=" + listEmpresaVentas +
                '}';
    }
}
