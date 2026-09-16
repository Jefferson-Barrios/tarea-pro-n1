package clases;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new Auto("Toyota", "Corolla", 50.0));
        flota.add(new Moto("Yamaha", "MT-03", 30.0));

        int diasAlquiler = 5;

        System.out.println("REPORTE DE ALQUILER DE VEHICULOS (" + diasAlquiler + " DIAS)\n");

        for (Vehiculo v : flota) {
            double costoTotal = v.costoAlquiler(diasAlquiler);

            System.out.println("Vehiculo: " + v.getClass().getSimpleName());
            System.out.println("Marca: " + v.getMarca());
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Tarifa Base diaria: $" + v.getTarifaBase());
            System.out.println("Costo total por " + diasAlquiler + " dias: $" + costoTotal);
            System.out.println("");
        }
    }
}