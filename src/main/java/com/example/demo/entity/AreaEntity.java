package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_area")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AreaEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "area_id")
	private Integer area_id;
	
	
	
	@Column(name = "nombre_area", nullable = false)
	private String nombre_area;
	

}

