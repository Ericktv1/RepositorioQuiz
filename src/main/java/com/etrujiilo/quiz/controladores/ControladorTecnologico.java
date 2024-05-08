package com.etrujiilo.quiz.controladores;

import com.etrujiilo.quiz.entidades.Tecnologico;
import com.etrujiilo.quiz.servicios.ServiciosTecnologico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorTecnologico {
    @Autowired
    ServiciosTecnologico serviciosTecnologico;

    @GetMapping({"/Tecnologico/lista"})
    public String listartecnologico(Model model){
        model.addAttribute("listatecnologicoT",serviciosTecnologico.consultarT());
        for(Tecnologico eltecnologico: serviciosTecnologico.consultarT()){
            System.out.println(eltecnologico);
        }
        System.out.println("paso por aca");
        return "listaTecnologico";
    }

    @GetMapping({"/tecnologico/nuevo"})
    public String cargarTecnologicoModelo(Model model){
        Tecnologico tecnologicollenar=new Tecnologico();

        model.addAttribute("Tecnologicollenar",tecnologicollenar);
        System.out.println("paso por aca formulario");
        return "crearTecnologico";
    }

    @PostMapping({"/accioncrear"})
    public String accioncrear(@ModelAttribute("Tecnologicollenar")Tecnologico tecnologico){
        System.out.println("Paso por aca para guardar formulario");
        System.out.println(tecnologico);
        this.serviciosTecnologico.crear(tecnologico);
        return "redirect:/Tecnologico/lista";
    }

    public void crearTecnologico(Tecnologico tecnologico){serviciosTecnologico.crear(tecnologico);}
    public Tecnologico buscarTecnologico(int pk){
        Tecnologico tecnologico= serviciosTecnologico.consultarPk(pk);
        return  null;
    }
}

