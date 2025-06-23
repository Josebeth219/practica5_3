public class cls_RegistroDental {
    private String fechaHora;
    private String descripcion;
    private String recomendacion;

    public cls_RegistroDental(String fechaHora, String descripcion, String recomendacion) {
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.recomendacion = recomendacion;
    }

    public String toString() {
        return "Fecha y Hora: " + fechaHora + ", Descripción: " + descripcion + ", Recomendación: " + recomendacion;
    }
}
