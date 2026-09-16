package clases;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double costoAlquiler(int dias) {
        return (getTarifaBase() + 10.0) * dias;
    }
}
