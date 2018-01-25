/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic.service;

import com.it355.jovanastricic.model.Korisnik;
import java.util.List;

/**
 *
 * @author Jovana BGD
 */
public interface KorisnikService {

    public int getCount();

    public List<Korisnik> getAllKorisnici();

    public boolean addKorisnik(Korisnik korisnik);
}
