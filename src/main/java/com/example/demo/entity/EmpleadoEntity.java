package com.example.demo.entity;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_empleado")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoEntity {
	
	
		@Id
		@Column(name = "dni_empleado", nullable = false, unique = true)
		private String dni_empleado;
		
		
		@Column(name = "nombre_empleado", nullable = false)
		private String nombre_empleado;
		
		
		@Column(name = "apellido_empleado", nullable = false)
		private String apellido_empleado;
		
		
		@Column(name = "fecha_nacimiento", nullable = false)
		private Date fecha_nacimiento;
		
		
		@Column(name = "direccion", nullable = false)
		private String direccion;
		
		
		@Column(name = "correo", nullable = false, unique = true)
		private String correo;
		
		@ManyToOne
	    @JoinColumn(name = "area_id", nullable = false)
	    private AreaEntity areaEntity;
	

}
