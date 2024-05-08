package com.etrujiilo.quiz.operaciones;

import com.etrujiilo.quiz.entidades.Tecnologico;

import java.util.List;

public interface OperacionesTecnologico {
    public Tecnologico crear(Tecnologico tecnologico);
    public Tecnologico actualizar(Tecnologico tecnologico);
    public void borrar(Tecnologico tecnologico);
    public List<Tecnologico> consultarT();
    public Tecnologico consultarPk(int pk);
}
