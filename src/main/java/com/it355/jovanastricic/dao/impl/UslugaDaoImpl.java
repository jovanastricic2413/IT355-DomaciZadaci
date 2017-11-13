/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic.dao.impl;

import com.it355.jovanastricic.dao.UslugaDao;

/**
 *
 * @author Jovana BGD
 */
public class UslugaDaoImpl implements UslugaDao {

    @Override
    public void addUsluga() {
        System.out.println("Adding usluga...");
    }

    @Override
    public String addUslugaRet() {
        System.out.println("Adding usluga and returning value...");
        return "Added succesfully!";
    }

    @Override
    public void addUslugaThrowException() throws Exception {
        System.out.println("Adding usluga and throwing exception...");
        throw new Exception("Generic Exception");
    }

    @Override
    public void addUslugaAround(String naziv_usluga) {
        System.out.println("Adding usluga with name: " + naziv_usluga);
    }

}
