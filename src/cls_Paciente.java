public class cls_Paciente {
    private String id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private cls_PiezaDental[] piezas;

    public cls_Paciente(String id, String nombre, String apellidos, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;

        piezas = new cls_PiezaDental[32];
        for (int i = 0; i < 32; i++) {
            piezas[i] = new cls_PiezaDental(i + 1); // Números del 1 al 32
        }
    }

    public cls_PiezaDental getPieza(int numero) {
        return piezas[numero - 1];
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String getDatosPaciente() {
        return "ID: " + id + "\nNombre: " + nombre + " " + apellidos +
                "\nTeléfono: " + telefono + "\nEmail: " + email;
    }

    public void mostrarHistorial() {
        System.out.println(getDatosPaciente());
        for (cls_PiezaDental p : piezas) {
            System.out.println(p.getHistorial());
        }
    }
}
