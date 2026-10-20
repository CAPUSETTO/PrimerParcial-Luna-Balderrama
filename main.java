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
