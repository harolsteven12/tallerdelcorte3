/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuesta;

import java.util.Scanner;

/**
 *
 * @author 57314
 */
public class Encuesta {

    /**
     * @param args the command line arguments
     */
   private Persona[] personas;
    private int contador;

  
    public Encuesta() {
        personas = new Persona[6]; // Arreglo de tamaño 6
        contador = 0;
    }

   
    public void agregarPersona(Persona persona) {
        if (contador < 6) {
            personas[contador] = persona;
            contador++;
        } else {
            System.out.println("Capacidad máxima de personas alcanzada.");
        }
    }

    
    public void mostrarInformacionPersona(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            personas[posicion].mostrarInformacion();
        } else {
            System.out.println("Posición inválida.");
        }
    }

    // Método principal
    public void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar información de una persona");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (opcion == 1) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Cédula: ");
                String cedula = scanner.nextLine();
                System.out.print("Fecha de Nacimiento: ");
                String fechaNacimiento = scanner.nextLine();
                System.out.print("Correo: ");
                String correo = scanner.nextLine();
                System.out.print("Ciudad de Residencia: ");
                String ciudadResidencia = scanner.nextLine();
                System.out.print("Ciudad de Origen: ");
                String ciudadOrigen = scanner.nextLine();
                Persona persona = new Persona(nombre, cedula, fechaNacimiento, correo, ciudadResidencia, ciudadOrigen);
                
                for (int i = 0; i < 3; i++) {
                    System.out.print("Ingrese el título de la canción favorita " + (i + 1) + ": ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el artista de la canción favorita " + (i + 1) + ": ");
                    String artista = scanner.nextLine();
                    Cancion cancion = new Cancion(titulo, artista);
                    persona.agregarCancion(cancion, i);
                }
                
                
            } else if (opcion == 2) {
                System.out.print("Ingrese la posición de la persona (0-5): ");
                int posicion = scanner.nextInt();
                mostrarInformacionPersona(posicion);
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    
    public static void main(String[] args) {
        Encuesta encuesta = new Encuesta();
        encuesta.main();
    }

       }
       
    
    

    
