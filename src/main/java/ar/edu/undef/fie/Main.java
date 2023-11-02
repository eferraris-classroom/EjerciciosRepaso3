package ar.edu.undef.fie;

import java.util.ArrayList;

//Remisería (Versión 2):
//Haga un sistema de gestión para una remisería.
//La misma cuenta con una flota de vehículos (dominio, marca, modelo, kilometraje). Los mismos pueden estar disponibles para trabajar o en el taller.
//Asimismo, la remisería registra el precio por hora a pagar a sus empleados por mes (es el mismo para todos los empleados, cambia todos los meses).
//A su vez, los empleados (nombre, apellido, dni, tipo de licencia y fecha de vencimiento) pueden manejar uno o más vehículos. Debe considerar que
// si tiene la licencia vencida el chofer no estará disponible para manejar.
//El sistema debe registrar la cantidad de horas trabajadas de cada chofer por mes y el kilometraje del vehículo.
//El sistema debe mostrar el sueldo a liquidar por mes de cada empleado.
//Por último, los vehículos cada 15000km deben realizar el servicio y concurrir al taller.
public class Main {
    public static void main(String[] args) {
        Remiseria remiseria = new Remiseria(100);

        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Ford", "Fiesta", 10000, true);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Ford", "Fiesta", 14000, true);
        Vehiculo vehiculo3 = new Vehiculo("GHI789", "Ford", "Fiesta", 15000, true);
        remiseria.agregarVehiculo(vehiculo1);
        remiseria.agregarVehiculo(vehiculo2);
        remiseria.agregarVehiculo(vehiculo3);

        Empleado empleado1 = new Empleado("José", "Paz", 12345678, "B", "2021-12-31", new ArrayList<>());
        Empleado empleado2 = new Empleado("Monica", "Lewisky", 87654321, "B", "2021-12-31", new ArrayList<>());
        empleado1.addVehiculo(vehiculo1);
        empleado1.addVehiculo(vehiculo2);
        empleado2.addVehiculo(vehiculo3);
        remiseria.empleadosContratados(empleado1);
        remiseria.empleadosContratados(empleado2);

        remiseria.empleadosHorasTrabajadas(empleado1, 10);
        remiseria.empleadosHorasTrabajadas(empleado2, 20);
        remiseria.empleadosHorasTrabajadas(empleado1, 5);
        remiseria.empleadosHorasTrabajadas(empleado2, 10);

        remiseria.vehiculoKilometraje(vehiculo1, 1000);
        remiseria.vehiculoKilometraje(vehiculo2, 1500);
        remiseria.vehiculoKilometraje(vehiculo3, 3000);

        remiseria.servicioVehiculos();

        remiseria.liquidarSueldos();

    }
}
