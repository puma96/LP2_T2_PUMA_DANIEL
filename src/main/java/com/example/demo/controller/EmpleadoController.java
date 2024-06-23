package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.AreaEntity;
import com.example.demo.entity.EmpleadoEntity;

import com.example.demo.repository.AreaRepository;
import com.example.demo.repository.EmpleadoRepository;

@Controller
public class EmpleadoController {
	
@Autowired
private AreaRepository areaRepository;
@Autowired
private EmpleadoRepository empleadoRepository;


@GetMapping({"/empleados" , "/"})
public String listarEmpleados(Model model) {
    List<EmpleadoEntity> empleados = empleadoRepository.findAll();
    model.addAttribute("empleados", empleados);
    return "ListEmpleados"; 
}

@GetMapping({"/Registrar_Empleado" , "/"})
public String showRegistrarEmpleado(Model model) {
    List<AreaEntity> areas = areaRepository.findAll();
    model.addAttribute("areas", areas);
    model.addAttribute("empleado", new EmpleadoEntity());
    return "Registrar_Empleado";
}


@PostMapping({"/Registrar_Empleado" , "/"} )
public String registrarEmpleado(Model model, @ModelAttribute EmpleadoEntity empleado) {
    empleadoRepository.save(empleado);
    return "redirect:/empleados"; 
}

}
