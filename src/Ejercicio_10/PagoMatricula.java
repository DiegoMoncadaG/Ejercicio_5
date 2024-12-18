package Ejercicio_10;

public class PagoMatricula {
    private String numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estrato;

    public PagoMatricula(String numeroInscripcion, String nombres, double patrimonio, int estrato) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }

    public double calcularPago() {
        double pagoMatricula = 50000;
        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }
        return pagoMatricula;
    }

    public String obtenerInformacion() {
        return "El estudiante con numero de inscripcion " + numeroInscripcion + 
               " y nombre " + nombres + " debe pagar $" + String.format("%.2f", calcularPago());
    }
}
