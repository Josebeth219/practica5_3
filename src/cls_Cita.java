public class cls_Cita {
    private cls_Paciente paciente;
    private String dentista;
    private String fechaHora;
    private String estado;
    private String observaciones;

    public cls_Cita(cls_Paciente paciente, String dentista, String fechaHora, String estado, String observaciones) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public void mostrarCita() {
        System.out.println("Paciente: " + paciente.getNombreCompleto());
        System.out.println("Dentista: " + dentista);
        System.out.println("Fecha y Hora: " + fechaHora);
        System.out.println("Estado: " + estado);
        System.out.println("Observaciones: " + observaciones);
    }
}
