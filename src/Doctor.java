public class Doctor {

    private int id;
    private String nombreCompleto;
    private String especialidad;

    public Doctor(int id, String nombreCompleto, String especialidad) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método para dar de alta un doctor
    public static void darDeAltaDoctor(int id, String nombreCompleto, String especialidad) {
        Doctor nuevoDoctor = new Doctor(id, nombreCompleto, especialidad);
        // Aquí se debería implementar la lógica para almacenar al doctor en una base de datos o en otra estructura de datos.
        System.out.println("Se ha dado de alta al doctor: " + nuevoDoctor.getNombreCompleto() + " con especialidad en " + nuevoDoctor.getEspecialidad());
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        darDeAltaDoctor(1, "Juan Pérez", "Cardiología");
        darDeAltaDoctor(2, "Ana López", "Pediatría");
        darDeAltaDoctor(3, "Carlos Gómez", "Medicina General");
    }
}
