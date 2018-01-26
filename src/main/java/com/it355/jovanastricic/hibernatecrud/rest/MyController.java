/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic.hibernatecrud.rest;

/**
 *
 * @author Jovana BGD
 */
import com.it355.jovanastricic.hibernatecrud.dao.PromenaDao;
import com.it355.jovanastricic.hibernatecrud.entity.Usluga;
import com.it355.jovanastricic.hibernatecrud.entity.Ordinacija;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController{

    @Autowired
    PromenaDao promenaDao;
//metoda koja prikazuje sve produkte, tipa get, a proizvode prikazuje u JSON formatu
@RequestMapping(value = "/uslugice", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<Usluga>> getUsluge() {
        System.out.println("Fetching usluge");
        List<Usluga> usluge = promenaDao.getUsluge();
        if (usluge.size() == 0) {
            System.out.println("Usluge list empty");
            return new ResponseEntity<List<Usluga>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Usluga>>(usluge, HttpStatus.OK);
    }
//metoda koja po id-ju prikazuje jedan produkt.
//na adresi http://localhost:8080/HibernateCRUD/product/4 pozivamo ovu metodu

    @RequestMapping(value = "/usluga/{id}", method = RequestMethod.GET, produces
            = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usluga> getUsluga(@PathVariable("id") int id) {
        System.out.println("Fetching product with id " + id);
        Usluga usluga = promenaDao.getUslugaById(id);
        if (usluga == null) {
            System.out.println("Usluga with " + id + " not found");
            return new ResponseEntity<Usluga>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Usluga>(usluga, HttpStatus.OK);
    }
//metoda koja cuva uslugu u bazu

    @RequestMapping(value = "/usluga/", method = RequestMethod.POST)
    public ResponseEntity<Void> addUsluga(@RequestBody Usluga usluga) {
        System.out.println("Adding usluga " + usluga.toString());
        promenaDao.addUsluga(usluga);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
//metoda koja uzima uslugu iz baze po id-u, menja je i cuva je u bazi

    @RequestMapping(value = "/product/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Usluga> updateUsluga(@PathVariable("id") int id,
            @RequestBody Usluga usluga) {
        System.out.println("Updating usluga " + id);
        usluga.setId_usluga(id);
        promenaDao.editUsluga(usluga);
        return new ResponseEntity<Usluga>(usluga, HttpStatus.OK);
    }
//metoda koja po id-u nalazi i brise uslugu iz baze

    @RequestMapping(value = "/usluga/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Usluga> deleteUsluga(@PathVariable("id") int id) {
        System.out.println("Fetching and Deleting usluga with id " + id);
        Usluga usluga = promenaDao.getUslugaById(id);
        if (usluga == null) {
            System.out.println("Unable to delete usluga with id " + id + " not found.");
return new ResponseEntity<Usluga>(HttpStatus.NOT_FOUND);
        }
        promenaDao.deleteUsluga(usluga);
        return new ResponseEntity<Usluga>(HttpStatus.OK);
    }

    @RequestMapping(value = "/ordinacije", method = RequestMethod.GET, produces
            = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Ordinacija>> getOrdinacije() {
        System.out.println("Fetching categories");
        List<Ordinacija> ordinacije = promenaDao.getOrdinacije();
        if (ordinacije.size() == 0) {
            System.out.println("Ordinacije list empty");
            return new ResponseEntity<List<Ordinacija>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Ordinacija>>(ordinacije, HttpStatus.OK);
    }

    @RequestMapping(value = "/ordinacija/{id}", method = RequestMethod.GET, produces
            = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ordinacija> getOrdinacija(@PathVariable("id") int id) {
        System.out.println("Fetching ordinacija with id " + id);
        Ordinacija o = promenaDao.getOrdinacijaById(id);
        if (o == null) {
            System.out.println("Ordinacija with " + id + " not found");
            return new ResponseEntity<Ordinacija>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Ordinacija>(o, HttpStatus.OK);
    }

    @RequestMapping(value = "/ordinacija/", method = RequestMethod.POST)
    public ResponseEntity<Void> addOrdinacija(@RequestBody Ordinacija o) {
        System.out.println("Adding ordinacija " + o.toString());
        promenaDao.addOrdinacija(o);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/ordinacija/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Ordinacija> updateOrdinacija(@PathVariable("id") int id,
            @RequestBody Ordinacija o) {
        System.out.println("Updating ordinacija " + id);
        o.setId_ordinacija(id);
        promenaDao.editOrdinacija(o);
        return new ResponseEntity<Ordinacija>(o, HttpStatus.OK);
    }

    @RequestMapping(value = "/ordinacija/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Ordinacija> deleteOrdinacija(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting ordinacija with id " + id);
        Ordinacija o = promenaDao.getOrdinacijaById(id);
        if (o == null) {
            System.out.println("Unable to delete. Ordinacija with id " + id + " not found");
return new ResponseEntity<Ordinacija>(HttpStatus.NOT_FOUND);
        }
        promenaDao.deleteOrdinacija(o);
        return new ResponseEntity<Ordinacija>(HttpStatus.OK);
    }
}
