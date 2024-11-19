/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encuesta;

/**
 *
 * @author 57314
 */
public class Persona {

 private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String correo;
    private String ciudadResidencia;
    private String ciudadOrigen;
    private Cancion[] cancionesFavoritas;

   
    public Persona(String nombre, String cedula, String fechaNacimiento, String correo, String ciudadResidencia, String ciudadOrigen) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.ciudadResidencia = ciudadResidencia;
        this.ciudadOrigen = ciudadOrigen;
        this.cancionesFavoritas = new Cancion[3]; // Arreglo de tamaño 3
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    // Método para agregar canción
    public void agregarCancion(Cancion cancion, int posicion) {
        if (posicion >= 0 && posicion < 3) {
            cancionesFavoritas[posicion] = cancion;
        } else {
            System.out.println("Posición inválida. Debe ser 0, 1 o 2.");
        }
    }

   
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Cédula: " + cedula + ", Fecha de Nacimiento: " + fechaNacimiento +
                ", Correo: " + correo + ", Ciudad de Residencia: " + ciudadResidencia + ", Ciudad de Origen: " + ciudadOrigen);
        System.out.println("Canciones Favoritas:");
        for (Cancion cancion : cancionesFavoritas) {
            if (cancion != null) {
                cancion.mostrarCancion();
            }
        }
    }

    }

