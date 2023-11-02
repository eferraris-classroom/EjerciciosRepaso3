package ar.edu.undef.fie;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private final String nombre;
    private final String apellido;
    private final int dni;
    private final String tipoLicencia;
    private final String fechaVencimiento;
    private List<Vehiculo> vehiculos;

    private double horasTrabajadas;

    public Empleado(String nombre, String apellido, int dni, String tipoLicencia, String fechaVencimiento, List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipoLicencia = tipoLicencia;
        this.fechaVencimiento = fechaVencimiento;
        this.vehiculos = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public int getDni() {
        return dni;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", tipoLicencia='" + tipoLicencia + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                '}';
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


}
