/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic.dao;

import com.it355.jovanastricic.model.Usluga;
import java.util.List;

/**
 *
 * @author Jovana BGD
 */
public interface UslugaDao {

    public void addUsluga();

    public String addUslugaRet();

    public void addUslugaThrowException() throws Exception;

    public void addUslugaAround(String naziv_usluga);

    //SEDMI DOMACI
    public int getCount();

    public List<Usluga> getAllUsluge();

    public boolean addUsluga(Usluga usluga);

    public boolean deleteUsluga(int id_usluga);

    public Usluga getById(int id_usluga);

    public int getNextId();

    public boolean updateUsluga(Usluga usluga);

}
