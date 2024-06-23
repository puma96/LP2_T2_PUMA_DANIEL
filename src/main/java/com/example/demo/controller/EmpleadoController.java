package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.repository.AreaRepository;
import com.example.demo.repository.EmpleadoRepository;

@Controller
public class EmpleadoController {
@Autowired
private AreaRepository areaRepository;

@Autowired
private EmpleadoRepository empleadoRepository;
}
