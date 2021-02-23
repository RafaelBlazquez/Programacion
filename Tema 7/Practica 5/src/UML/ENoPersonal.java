 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;

/**
 *
 * @author leora
 */
public class ENoPersonal extends Empleado{
    
    public ENoPersonal(String dNI, String nSS, String nombreApellidos, String direccion, String telefono, boolean sexo, boolean estadoCivil, Contrato tipoContrato, Departamento nombreDepartamento, LocalDate fechaAlta) {
        super(dNI, nSS, nombreApellidos, direccion, telefono, sexo, estadoCivil, tipoContrato, nombreDepartamento, fechaAlta);
    }
    
}
