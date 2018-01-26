/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic.hibernatecrud.dao;

/**
 *
 * @author Jovana BGD
 */
import com.it355.jovanastricic.hibernatecrud.entity.Ordinacija;
import com.it355.jovanastricic.hibernatecrud.entity.Usluga;

import java.util.List;

public interface PromenaDao {

    public List<Usluga> getUsluge();

    public Usluga getUslugaById(int id);

    public List<Ordinacija> getOrdinacije();

    public Ordinacija getOrdinacijaById(int id);

    public List<Usluga> getUslugaByOrdinacija(Ordinacija ordinacija);

    public void editOrdinacija(Ordinacija ordinacija);

    public Ordinacija addOrdinacija(Ordinacija ordinacija);

    public void editUsluga(Usluga usluga);

    public Usluga addUsluga(Usluga usluga);

    public int getCountUslugeInOrdinacija(int ordinacijaId);

    public int getCountUsluge();

    public void deleteUsluga(Usluga usluga);

    public void deleteOrdinacija(Ordinacija ordinacija);

}
