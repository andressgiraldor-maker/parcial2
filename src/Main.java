import modelCineplus.*;

import javax.swing.*;

public class Main {
    static void main(String[] args) {

        Empresa empresaCinePlus= new Empresa("CinePlus", "777", "Armenia Quindio, 2N");


        int opcion= 0;

        while(opcion!=16){

            opcion= Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Ingrese una opción
                    
                    1. Agregar un cliente a CinePlus
                    2. Buscar un cliente en CinePlus
                    3. Agregar un operario a CinePlus
                    4. Buscar un operario en CinePlus
                    5. Agregar una pelicula
                    6. Buscar una pelicula
                    7. Agregar una sala
                    8. Buscar una sala
                    9. Agregar una función cinematografica
                    10. Buscar una función cinematografica
                    11. Realizar una venta de boletas
                    12. Calcular el valor total de una venta
                    13.Consultar las peliulas disponibes
                    14.Consultar ingresos por función
                    15. Mostrar la información de Cineplus
                    16. Salir del programa
                    """));

            if(opcion==1) {
                int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento"));
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
                String correo = JOptionPane.showInputDialog(null, "Ingrese el correo elctronico");
                int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de telefono"));
                int codigoAfiliacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo de afiliación"));
                double porcentajeDescuento = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el porcentaje de descuento"));

                empresaCinePlus.agregarClienteACinePlus(documento, nombre, correo, telefono, codigoAfiliacion, porcentajeDescuento);
                JOptionPane.showMessageDialog(null, "Cliente agregado, Bienvenido a cinePlus");

            }else if(opcion==2){
                int documento= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento"));
                Cliente cliente = empresaCinePlus.buscarClienteEnCinePlus(documento);

                if(cliente!=null){
                    JOptionPane.showMessageDialog(null, "Cliente encontrado" + cliente.toString());
                } else{
                    JOptionPane.showMessageDialog(null, "El cliente no existe");
                }
            } else if(opcion==3){
                int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento"));
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
                String correo = JOptionPane.showInputDialog(null, "Ingrese el correo elctronico");
                int telefono = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de telefono"));
                int codigoEmpleado= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo del empleado"));
                double fechaContratacio= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la fecha de contratación"));
                double salarioBasico= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario basico"));

                empresaCinePlus.agregarOperarioACinePlus(documento, nombre, correo, telefono, codigoEmpleado, fechaContratacio, salarioBasico);
                JOptionPane.showMessageDialog(null, "El operario fue aceptado en CinePlus");

            } else if(opcion==4){
                int documento= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento "));
                Operario operario= empresaCinePlus.buscarOperarioEnCinePlus(documento);

                if(operario!=null){
                    JOptionPane.showMessageDialog(null, "Operario encontrado" + operario.toString());
                } else{
                    JOptionPane.showMessageDialog(null, "El operario no existe");
                }
            } else if(opcion==5){
                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo"));
                String titulo= JOptionPane.showInputDialog(null, "Ingrese el titulo de la pelicula");
                double duracionMinutos= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la duración de la pelicula"));
                int clasificacionEdad= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));

                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"""
                        Ingrese el genero de la pelicula
                        1. ACCION
                        2. COMEDIA
                        3. DRAMA
                        4. TERROR 
                        5. ANIMACION
                        """));
                GeneroPelicula generoPelicula= null;
                if(opcion==1){
                    generoPelicula= GeneroPelicula.ACCION;
                    
                } else if(opcion==2){
                    generoPelicula= GeneroPelicula.COMEDIA;
                } else if(opcion==3){
                    generoPelicula= GeneroPelicula.DRAMA;
                } else if(opcion==4){
                    generoPelicula= GeneroPelicula.TERROR;
                } else if(opcion==5){
                    generoPelicula= GeneroPelicula.ANIMACION;
                }
                empresaCinePlus.agregarPelicula(codigo, titulo, duracionMinutos,clasificacionEdad, generoPelicula);
                JOptionPane.showMessageDialog(null, "La pelicula fue agregada exitosamente");




            } else if(opcion==6){
                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo"));
                Pelicula pelicula= empresaCinePlus.buscarPelicula(codigo);

                if(pelicula!=null){
                    JOptionPane.showMessageDialog(null, "Pelicula encontrada"+ pelicula.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "La pelicula no existe");
                }
            } else if(opcion==7) {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codgio "));
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
                int capacidadmaxima = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad maxima"));

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                        Ingrese el tipo de sala
                        1.TRADICIONAL
                        2.VIP
                        3.3D
                        """));

                TipoSala tipoSala = null;

                if (opcion == 1) {
                    tipoSala = TipoSala.TRADICIONAL;
                } else if (opcion == 2) {
                    tipoSala = TipoSala.VIP;
                } else if (opcion == 3) {
                    tipoSala = TipoSala.TRES_D;
                }
                empresaCinePlus.agregarSalaACinePlus(codigo, nombre, capacidadmaxima, tipoSala);
                JOptionPane.showMessageDialog(null, "La sala fue agregada exitosamente");

            } else if(opcion==8){
                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo"));
                Sala sala= empresaCinePlus.buscarSalaEnCinePlus(codigo);

                if(sala!=null){
                    JOptionPane.showMessageDialog(null, "Sala encontrada" + sala.toString());
                } else{
                    JOptionPane.showMessageDialog(null, "La sala no existe");
                }
            } else if(opcion==9){
                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo"));
                String fechaPresentacion= JOptionPane.showInputDialog(null, "Ingrese la fecha de presentación");
                String horaInicio= JOptionPane.showInputDialog(null, "Ingrese la hora de inicio");
                double precioBoleta= Double.parseDouble(JOptionPane.showInputDialog(null, "Inrese el precio de la boleta"));

                empresaCinePlus.agregarFuncionCinematografica(codigo, fechaPresentacion, horaInicio, precioBoleta);
                JOptionPane.showMessageDialog(null, "La función cinmatografica fue agrega exitosamente");

            } else if(opcion==10){
                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo"));
                Funcion funcion= empresaCinePlus.buscarFuncionCinematografica(codigo);

                if(funcion!=null){
                    JOptionPane.showMessageDialog(null, "Función encontrada" + funcion.toString());
                } else{
                    JOptionPane.showMessageDialog(null, "La función no existe");
                }
            }else if(opcion == 11){

            }else if(opcion == 12){

            }else if(opcion == 13){

            }else if (opcion == 14){

            }else if (opcion == 15){

            }else if (opcion == 16){


            }else if (opcion == 17){
                JOptionPane.showMessageDialog(null,"opcion invalida");
                break;
            }








        }



    }
}
