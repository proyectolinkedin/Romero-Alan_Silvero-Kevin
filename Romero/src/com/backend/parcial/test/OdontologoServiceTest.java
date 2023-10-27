package com.backend.parcial.test;

import com.backend.parcial.dao.impl.OdontologoDaoH2;
import com.backend.parcial.model.Odontologo;
import com.backend.parcial.service.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class OdontologoServiceTest {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @BeforeAll
    static void doBefore() {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/testClase;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "sa");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Test
    void deberiaAgregarUnOdontologo(){
        Odontologo odontologo = new Odontologo(123456, "Nombre", "Apellido");
        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);
        Assertions.assertTrue(odontologoRegistrado.getId() != 0);
    }

    @Test
    void deberiaRetornarUnaListaNoVaciaDeOdontologos(){
        assertFalse(odontologoService.listarOdontologos().isEmpty());
    }
}

