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
    private List<Funcion> listEmpresaFunciones;
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
        this.listEmpresaFunciones = new ArrayList<>();
        this.listEmpresaPersonas = new ArrayList<>();
        this.listEmpresaVentas = new ArrayList<>();
    }

    /**
     * metodo para agregar un cliente a la empresa Cineplus
     * @param documento del cliente
     * @param nombre del cliente
     * @param correo del cliente
     * @param telefono del cliente
     * @param codigoAfiliacion del cliete
     * @param porcentajeDescuento del cliente
     * @return
     */

    public boolean agregarClienteACinePlus(int documento, String nombre, String correo, int telefono, int codigoAfiliacion,double porcentajeDescuento){
        boolean existe= false;
        Cliente cliente= buscarClienteEnCinePlus(documento);

        if(cliente==null){

            Persona client= new Cliente(documento, nombre,correo, telefono,codigoAfiliacion, porcentajeDescuento );
            listEmpresaPersonas.add(client);
            existe= true;

        }
        return existe;

    }

    /**
     * metodo para buscar un cliente en CinePlus
     * @param documento del cliente
     * @return
     */

    public Cliente buscarClienteEnCinePlus(int documento){
        Cliente encontrado= null;

        for(int i=0; i<listEmpresaPersonas.size(); i++){
            Persona cliente= listEmpresaPersonas.get(i);
            if(cliente.getDocumento()== documento){
                encontrado= (Cliente) cliente;
            }
        }
        return encontrado;

    }

    /**
     * metodo para eliminar un cliente de CinePlus
     * @param documento del cliente
     */

    public void eliminarClienteDeCinePlus(int documento){
        Cliente cliente= buscarClienteEnCinePlus(documento);
        listEmpresaPersonas.remove(cliente);
    }

    /**
     * metodo para agregar un operario a la empresa CinePlus
     * @param documento del operario
     * @param nombre del operario
     * @param correo del operario
     * @param telefono del operario
     * @param codigoEmpleado del operario
     * @param fechaContratacion del operario
     * @param salarioBasico del operario
     * @return
     */

    public boolean agregarOperarioACinePlus(int documento, String nombre, String correo, int telefono,int codigoEmpleado, double fechaContratacion, double salarioBasico){
        boolean existe= false;
        Operario operario= buscarOperarioEnCinePlus(documento);

        if(operario==null){
            Persona operad= new Operario(documento, nombre, correo, telefono, codigoEmpleado, fechaContratacion, salarioBasico);
            listEmpresaPersonas.add(operad);
            existe= true;

        }
        return existe;

    }

    /**
     * metodo para buscar un operario en CinePlus
     * @param documento del operario
     * @return
     */


    public Operario buscarOperarioEnCinePlus(int documento){
        Operario encontrado= null;

        for(int i=0; i<listEmpresaPersonas.size(); i++){

            Persona operario= listEmpresaPersonas.get(i);

            if(operario.getDocumento()== documento){

                encontrado= (Operario) operario;
            }
        }
        return encontrado;

    }

    /**
     * metodo para eliminar un operario de CinePus
     * @param documento del operario
     */

    public void eliminarOperarioDeCinePlus(int documento){
        Operario operario= buscarOperarioEnCinePlus(documento);
        listEmpresaPersonas.remove(operario);
    }

    /**
     * metodo para agregar una pelicula a CinePlus
     * @param codigo de la pelicula
     * @param titulo de la pelicula
     * @param duracionMinutos de la pelicula
     * @param clasificacionEdad de la pelicula
     * @param generoPelicula de la pelicula
     * @return
     */

    public boolean agregarPelicula(int codigo, String titulo, double duracionMinutos, int clasificacionEdad, GeneroPelicula generoPelicula){
        boolean existe= false;
        Pelicula pelicula= buscarPelicula(codigo);

        if(pelicula==null){

            Pelicula pelic= new Pelicula(codigo, titulo, duracionMinutos,clasificacionEdad, generoPelicula);
            listEmpresaPeliculas.add(pelic);
            existe= true;

        }
        return existe;

    }

    /**
     * metodo para buscar una pelicula
     * @param codigo de la pelicula
     * @return
     */

    public Pelicula buscarPelicula(int codigo){
        Pelicula encontrada= null;

        for(int i=0; i<listEmpresaPeliculas.size(); i++){
            Pelicula pelicula= listEmpresaPeliculas.get(i);

            if(pelicula.getCodigo()== codigo){
                encontrada= pelicula;
            }

        }
        return encontrada;
    }

    /**
     * metodo para agregar una sala a CinePlus
     * @param codigo de la sala
     * @param nombre de la sala
     * @param capacidadmaxima de la sala
     * @param tipoSala de la sala
     * @return
     */

    public boolean agregarSalaACinePlus(int codigo, String nombre, int capacidadmaxima, TipoSala tipoSala){
        boolean pertenece= false;
        Sala sala= buscarSalaEnCinePlus(codigo);

        if(sala==null){
            Sala salat= new Sala(codigo, nombre, capacidadmaxima, tipoSala);
            listEmpresaSalas.add(salat);
            pertenece= true;
        }
        return pertenece;


    }

    /**
     * metodo para buscar una sala en CinePlus
     * @param codigo de la sala
     * @return
     */

    public Sala buscarSalaEnCinePlus(int codigo){
        Sala encontrada= null;

        for(int i=0; i<listEmpresaSalas.size(); i++){
            Sala sala= listEmpresaSalas.get(i);

            if(sala.getCodigo()== codigo){
                encontrada= sala;
            }
        }
        return encontrada;
    }

    /**
     * metodo para agregar una funcion a CinePlus
     * @param codigo de la funcion
     * @param fechaPresentacion de la funcion
     * @param horaInicio de la funcion
     * @param preioBoleta de la funcion
     * @return
     */

    public boolean agregarFuncionCinematografica(int codigo, String fechaPresentacion, String horaInicio, double preioBoleta){
        boolean pertenece= false;
        Funcion funcion= buscarFuncionCinematografica( codigo);

        if(funcion==null){
            Funcion funciont= new Funcion(codigo, fechaPresentacion, horaInicio, preioBoleta);
            listEmpresaFunciones.add(funciont);
            pertenece= true;
        }
        return  pertenece;

    }

    /**
     * metodo para buscar una función cinematografica
     * @param codigo de la función
     * @return
     */

    public Funcion buscarFuncionCinematografica(int codigo){
        Funcion encontrada= null;

        for(int i=0; i<listEmpresaFunciones.size(); i++){
            Funcion funcion= listEmpresaFunciones.get(i);

            if(funcion.getCodigo()== codigo){
                encontrada= funcion;
            }
        }
        return encontrada;
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
        return listEmpresaFunciones;
    }

    public void setListEmpresaFuncions(List<Funcion> listEmpresaFuncions) {
        this.listEmpresaFunciones = listEmpresaFuncions;
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
                "nombre='" + nombre + "\n" +
                ", NIT='" + NIT + "\n" +
                ", direccion='" + direccion +"\n" +
                ", listEmpresaPeliculas=" + listEmpresaPeliculas + "\n" +
                ", listEmpresaSalas=" + listEmpresaSalas + "\n" +
                ", listEmpresaFuncions=" + listEmpresaFunciones + "\n" +
                ", listEmpresaPersonas=" + listEmpresaPersonas + "\n" +
                ", listEmpresaVentas=" + listEmpresaVentas + "\n" +
                '}';
    }
}
