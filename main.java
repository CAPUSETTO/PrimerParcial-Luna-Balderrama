/*Ejercicio 7: Turnos de un Consultorio
● Consigna:
○ Crear una clase Turno con los atributos privados: paciente (String), hora
(int, de 8 a 18) y confirmado (boolean).
○ Implementar un constructor que reciba paciente y hora. Si la hora está fuera
del rango, asignar 8. El turno comienza sin confirmar.

○ Implementar confirmar() y cancelar(), que cambien el estado del turno.
○ Implementar reprogramar(int nuevaHora), que cambie la hora solo si está
dentro del rango permitido y el turno no fue confirmado.
○ Implementar String obtenerDescripcion(), que retorne un texto con el
paciente, la hora y el estado.
○ En el main, pedir por consola (con Scanner) el paciente y la hora de dos
turnos, confirmar uno, intentar reprogramar ambos con una nueva hora
ingresada por el usuario y mostrar las descripciones.

● Para Git:
○ Crear la rama feature/turnos.
○ Hacer el merge de la rama a main una vez finalizado el ejercicio.

*/

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turno t1 = new Turno();
        Turno t2 = new Turno();

        System.out.println("Ingrese el nombre del paciente");
        t1.setPaciente(sc.nextLine());
        System.out.println("Ingrese la hora del turno!");
        t1.setHora(sc.nextInt());
        System.out.println("Confirma el turno? (true = si false = no)");
        t1.setConfirmado(sc.nextBoolean());
        sc.nextLine();

        System.out.println("Ingrese el nombre del paciente");
        t2.setPaciente(sc.nextLine());
        System.out.println("Ingrese la hora del turno!");
        t2.setHora(sc.nextInt());
        System.out.println("Confirma el turno? (true = si false = no)");
        t2.setConfirmado(sc.nextBoolean());

        System.out.println("Datos turno 1");
        t1.ObtenerDescripcion();
        System.out.println("Datos turno 2");
        t2.ObtenerDescripcion();

        System.out.println("Ingrese la hora de reprogramación del primer turno");
        t1.reprogramar(sc.nextInt());
        System.out.println("Ingrese la hora de reprogramación del segundo turno");
        t2.reprogramar(sc.nextInt());

        System.out.println("Datos turno 1");
        t1.ObtenerDescripcion();
        System.out.println("Datos turno 2");
        t2.ObtenerDescripcion();

        sc.close();
    }
}
