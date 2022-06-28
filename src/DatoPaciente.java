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
        System.out.println(mostrarInfo());
    }


    private String mostrarInfo() {
        return new StringBuilder()
                .append("\n---- Inicio data paciente ---- ")
                .append("Los datos del paciente son: ")
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
                .append("\nProfesión del paciente: ").append(profesion)
                .append("\n---- fin data paciente ---- ").toString();
    }


}


