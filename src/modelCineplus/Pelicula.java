package modelCineplus;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    //Atributos de la clase Pelicula
    public int codigo;
    public String titulo;
    public double duracionMinutos;
    public int clasificacionEdad;
    private GeneroPelicula generoPelicula;

    //Relaciones de la clase Pelicula
    private Empresa empresa;
    private List<Funcion>  listPeliculaFunciones;

    public Pelicula(int codigo, String titulo, double duracionMinutos, int clasificacionEdad, GeneroPelicula generoPelicula) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.clasificacionEdad = clasificacionEdad;
        this.generoPelicula = generoPelicula;

        this.listPeliculaFunciones = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(double duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(int clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public GeneroPelicula getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(GeneroPelicula generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Funcion> getListPeliculaFunciones() {
        return listPeliculaFunciones;
    }

    public void setListPeliculaFunciones(List<Funcion> listPeliculaFunciones) {
        this.listPeliculaFunciones = listPeliculaFunciones;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", duracionMinutos=" + duracionMinutos +
                ", clasificacionEdad=" + clasificacionEdad +
                ", generoPelicula=" + generoPelicula +
                ", empresa=" + empresa +
                ", listPeliculaFunciones=" + listPeliculaFunciones +
                '}';
    }
}
