package clases;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Toyota", "Corolla", 50.0);
        Moto moto1 = new Moto("Yamaha", "MT-03", 30.0);

        int diasAlquiler = 5;

        System.out.println("REPORTE DE ALQUILER DE VEHICULOS (" + diasAlquiler + " DIAS)\n");

        imprimirReporte(auto1, diasAlquiler);
        imprimirReporte(moto1, diasAlquiler);
    }

    public static void imprimirReporte(Vehiculo v, int dias) {
        double costoTotal = v.costoAlquiler(dias);
        
        System.out.println("Vehiculo: " + v.getClass().getSimpleName());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());
        System.out.println("Tarifa Base diaria: $" + v.getTarifaBase());
        System.out.println("Costo total por " + dias + " dias: $" + costoTotal);
        System.out.println("");
    }
}