import java.util.ArrayList;

public class cls_PiezaDental {
    private int numero;
    private ArrayList<cls_RegistroDental> historial;

    public cls_PiezaDental(int numero) {
        this.numero = numero;
        this.historial = new ArrayList<>();
    }

    public void agregarRegistro(cls_RegistroDental registro) {
        historial.add(registro);
    }

    public String getHistorial() {
        String data = "Historial de pieza " + numero + ":\n";
        if (historial.isEmpty()) {
            data += "  (Sin registros)\n";
        } else {
            for (cls_RegistroDental r : historial) {
                data += "  - " + r.toString() + "\n";
            }
        }
        return data;
    }

    public int getNumero() {
        return numero;
    }
}
