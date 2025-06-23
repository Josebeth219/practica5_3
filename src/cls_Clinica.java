public class cls_Clinica {
    public static void main(String[] args) {
        // Crear paciente
        cls_Paciente p1 = new cls_Paciente("301110222", "Laura", "Cascante", "8888-9999", "laura@email.com");

        // Registrar tratamiento en la pieza #11
        cls_RegistroDental r1 = new cls_RegistroDental("2025-06-21 10:00", "Limpieza", "Control en 6 meses");
        p1.getPieza(11).agregarRegistro(r1);

        // Registrar otra intervención en la pieza #12
        cls_RegistroDental r2 = new cls_RegistroDental("2025-06-21 10:30", "Extracción", "Usar antibióticos");
        p1.getPieza(12).agregarRegistro(r2);

        // Crear cita
        cls_Cita cita1 = new cls_Cita(p1, "Dr. José Soto", "2025-06-21 10:00", "realizada", "Paciente con buena higiene.");

        // Mostrar info
        System.out.println("=== CITA ===");
        cita1.mostrarCita();

        System.out.println("\n=== HISTORIAL DENTAL ===");
        p1.mostrarHistorial();
    }
}
