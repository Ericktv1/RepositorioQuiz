package com.etrujiilo.quiz.servicios;


import com.etrujiilo.quiz.entidades.Tecnologico;
import com.etrujiilo.quiz.operaciones.OperacionesTecnologico;
import com.etrujiilo.quiz.repositorios.RepositorioTecnologico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiciosTecnologico implements OperacionesTecnologico {
    @Autowired
    RepositorioTecnologico repositorioTecnologico;

    @Override
    public Tecnologico crear(Tecnologico tecnologico) {
        return repositorioTecnologico.save(tecnologico);
    }

    @Override
    public Tecnologico actualizar(Tecnologico tecnologico) {
        if(this.consultarPk(tecnologico.getCodigoTec())!=null)
            return  repositorioTecnologico.save(tecnologico);
        return null;
    }

    @Override
    public void borrar(Tecnologico tecnologico) {
        repositorioTecnologico.delete(tecnologico);
    }

    @Override
    public  List<Tecnologico> consultarT() {
        return  repositorioTecnologico.findAll();
    }

    @Override
    public Tecnologico consultarPk(int pk) {
        return   repositorioTecnologico.findById(pk).orElse(null);
    }
}

