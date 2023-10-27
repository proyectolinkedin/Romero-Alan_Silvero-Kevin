package com.backend.parcial.dao;

import com.backend.parcial.model.Odontologo;

import java.util.List;

public interface IDao<O> {
    Odontologo registrar(Odontologo odontologo);

    List<Odontologo> listarTodos();

    Odontologo buscarPorId(int id);
}
