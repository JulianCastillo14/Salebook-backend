package com.SaleBook.backend.servicio;

import com.SaleBook.backend.modelo.Empleado;
import com.SaleBook.backend.modelo.Login;
import java.util.List;

/**
 *
 * @author julia
 */
public interface IEmpleadoServicio {
    
    List<Empleado> getEmpleados();
    Empleado nuevoEmpleado(Empleado empleado);
    Empleado buscarEmpleado(Integer numeroDocumento);
    int borrarEmpleado(Integer numeroDocumento);
    int login(Login empleadoDto);
}