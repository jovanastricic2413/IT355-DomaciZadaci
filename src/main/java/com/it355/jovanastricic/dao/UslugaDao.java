/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic.dao;

/**
 *
 * @author Jovana BGD
 */
public interface UslugaDao {

    public void addUsluga();

    public String addUslugaRet();

    public void addUslugaThrowException() throws Exception;

    public void addUslugaAround(String naziv_usluga);
}
