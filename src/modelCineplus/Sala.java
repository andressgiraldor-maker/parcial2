package modelCineplus;

import java.util.ArrayList;
import java.util.List;

public class Sala {

    //Atributos de la clase Sala
    public int codigo;
    public String nombre;
    public int capacidadMaxima;
    private TipoSala tipoSala;

    //Relaciones de la clase Sala
    private Empresa empresa;
    private List<Asiento> listSalaAsientos;
    private List<Funcion> listSalaFuniones;

    public Sala(int codigo, String nombre, int capacidadMaxima, TipoSala tipoSala) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.tipoSala = tipoSala;

        this.listSalaAsientos = new ArrayList<>();
        this.listSalaFuniones = new ArrayList<>();
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Asiento> getListSalaAsientos() {
        return listSalaAsientos;
    }

    public void setListSalaAsientos(List<Asiento> listSalaAsientos) {
        this.listSalaAsientos = listSalaAsientos;
    }

    public List<Funcion> getListSalaFuniones() {
        return listSalaFuniones;
    }

    public void setListSalaFuniones(List<Funcion> listSalaFuniones) {
        this.listSalaFuniones = listSalaFuniones;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", empresa=" + empresa +
                ", listSalaAsientos=" + listSalaAsientos +
                ", listSalaFuniones=" + listSalaFuniones +
                '}';
    }
}
