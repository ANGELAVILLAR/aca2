public class DatoPaciente {

    //Paciente-Atributos
    public int cedula;
    public String nombre;
    public String apellido;
    public String fechaNacimiento;
    public String genero;
    public String ciudad;
    public String departamento;
    public String direccion;
    public String celular;
    public String eps;
    public String arl;
    public String profesion;

    //Comportamientos - Metodos

    public void consultarDatoPaciente() {
        consultarDatoPaciente();

        System.out.println("\tPaciente Genero = " + genero);
        System.out.println("\tFechaNacimiento = " + fechaNacimiento);
        System.out.println("\tEps = " + eps);
        System.out.println("\tArl = " + arl);
        System.out.println("\tProfesion = " + profesion);
        System.out.println("\tDireccion = " + direccion);
        System.out.println("\tCelular = " + celular);
        System.out.println("\tCiudad = " + ciudad);
        System.out.println("\tDepartamento = " + departamento);
        }



    private String construirDatosPaciente() {
        return new StringBuilder().append("Los datos del paciente son: ")
                .append("\nNombre: ").append(nombre)
                .append("\nApellido: ").append(apellido)
                .append("\nCédula: ").append(cedula)
                .append("\nFecha de nacimiento: ").append(fechaNacimiento)
                .append("\nGenero: ").append(genero)
                .append("\nCiudad: ").append(ciudad)
                .append("\nDepartamento: ").append(departamento)
                .append("\nDirección: ").append(direccion)
                .append("\nCelular: ").append(celular)
                .append("\nEps del paciente: ").append(eps)
                .append("\nArl del paciente: ").append(arl)
                .append("\nProfesión del paciente: ").append(profesion).toString();
    }



}


