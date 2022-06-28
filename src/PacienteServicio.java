
import java.util.Scanner;

public class PacienteServicio {

    public String registrarPaciente() {

        Scanner scan = new Scanner(System.in);
        DatoPaciente datoPaciente = new DatoPaciente();

        System.out.println("\tIngrese el nombre del paciente: ");
        String nombre = scan.next();
        datoPaciente.nombre = nombre;

        System.out.println("\tIngrese el apellido del paciente: ");
        String apellido = scan.next();
        datoPaciente.apellido = apellido;

        System.out.println("\tIngrese la fecha de nacimiento del paciente (AAAA/MM/DD): ");
        String fechaNacimiento = scan.next();
        datoPaciente.fechaNacimiento = fechaNacimiento;

        System.out.println("\tIngrese el genero del paciente: ");
        String genero = scan.next();
        datoPaciente.genero = genero;

        System.out.println("\tIngrese la ciudad del paciente: ");
        String ciudad = scan.next();
        datoPaciente.ciudad = ciudad;

        System.out.println("\tIngrese el departamento del paciente: ");
        String departamento = scan.next();
        datoPaciente.departamento = departamento;

        System.out.println("\tIngrese la dirección del paciente: ");
        String direccion = scan.next();
        datoPaciente.direccion = direccion;

        System.out.println("\tIngrese el numero celular del paciente: ");
        String celular = scan.next();
        datoPaciente.celular = celular;

        System.out.println("\tIngrese la EPS del paciente: ");
        String eps = scan.next();
        datoPaciente.eps = eps;

        System.out.println("Ingrese la ARL del paciente");
        String arl = scan.next();
        datoPaciente.arl = arl;

        System.out.println("Ingrese la profesion del paciente");
        String profesion = scan.next();
        datoPaciente.profesion = profesion;

    }
            public static void main(String[] args) {
}
