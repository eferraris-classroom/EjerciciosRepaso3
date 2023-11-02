package ar.edu.undef.fie;

import java.util.ArrayList;
import java.util.List;

public class Remiseria {
    private final List<Empleado> empleados;
    private final List<Vehiculo> vehiculos;
    private final double precioPorHora;

    public Remiseria(double precioPorHora) {
        this.empleados = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.precioPorHora = precioPorHora;
    }

    public void empleadosContratados(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void empleadosHorasTrabajadas(Empleado empleado, double horasTrabajadas) {
        double horas = empleado.getHorasTrabajadas();
        horas += horasTrabajadas;
        empleado.setHorasTrabajadas(horas);
    }

    public void vehiculoKilometraje(Vehiculo vehiculo, int kilometraje) {
        int km = vehiculo.getKilometraje();
        km += kilometraje;
        vehiculo.setKilometraje(km);
    }


    public void servicioVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getKilometraje() >= 15000) {
                System.out.println("El vehiculo " + vehiculo.getDominio() + " debe realizar el servicio");
            }
        }
    }

    public void liquidarSueldos() {
        empleados.forEach(empleado -> {
            var horasTrabajadas = empleado.getHorasTrabajadas();
            var sueldo = horasTrabajadas * precioPorHora;
            System.out.println("El sueldo de " + empleado.getNombre() + " es " + sueldo);
        });
    }

}