/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic.hibernatecrud.dao.impl;

import com.it355.jovanastricic.hibernatecrud.entity.Ordinacija;
import com.it355.jovanastricic.hibernatecrud.entity.Usluga;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jovana BGD
 */
public class PromenaDaoImplTest {
    
    public PromenaDaoImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setSessionFactory method, of class PromenaDaoImpl.
     */
    @Test
    public void testSetSessionFactory() {
        System.out.println("setSessionFactory");
        SessionFactory sessionFactory = null;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        instance.setSessionFactory(sessionFactory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSession method, of class PromenaDaoImpl.
     */
    @Test
    public void testGetSession() {
        System.out.println("getSession");
        PromenaDaoImpl instance = new PromenaDaoImpl();
        Session expResult = null;
        Session result = instance.getSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUslugaById method, of class PromenaDaoImpl.
     */
    @Test
    public void testGetUslugaById() {
        System.out.println("getUslugaById");
        int id = 0;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        Usluga expResult = null;
        Usluga result = instance.getUslugaById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdinacije method, of class PromenaDaoImpl.
     */
    @Test
    public void testGetOrdinacije() {
        System.out.println("getOrdinacije");
        PromenaDaoImpl instance = new PromenaDaoImpl();
        List<Ordinacija> expResult = null;
        List<Ordinacija> result = instance.getOrdinacije();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdinacijaById method, of class PromenaDaoImpl.
     */
    @Test
    public void testGetOrdinacijaById() {
        System.out.println("getOrdinacijaById");
        int id = 0;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        Ordinacija expResult = null;
        Ordinacija result = instance.getOrdinacijaById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUslugaByOrdinacija method, of class PromenaDaoImpl.
     */
    @Test
    public void testGetUslugaByOrdinacija() {
        System.out.println("getUslugaByOrdinacija");
        Ordinacija ordinacija = null;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        List<Usluga> expResult = null;
        List<Usluga> result = instance.getUslugaByOrdinacija(ordinacija);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editOrdinacija method, of class PromenaDaoImpl.
     */
    @Test
    public void testEditOrdinacija() {
        System.out.println("editOrdinacija");
        Ordinacija ordinacija = null;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        instance.editOrdinacija(ordinacija);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOrdinacija method, of class PromenaDaoImpl.
     */
    @Test
    public void testAddOrdinacija() {
        System.out.println("addOrdinacija");
        Ordinacija ordinacija = null;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        Ordinacija expResult = null;
        Ordinacija result = instance.addOrdinacija(ordinacija);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editUsluga method, of class PromenaDaoImpl.
     */
    @Test
    public void testEditUsluga() {
        System.out.println("editUsluga");
        Usluga usluga = null;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        instance.editUsluga(usluga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUsluga method, of class PromenaDaoImpl.
     */
    @Test
    public void testAddUsluga() {
        System.out.println("addUsluga");
        Usluga usluga = null;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        Usluga expResult = null;
        Usluga result = instance.addUsluga(usluga);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountUslugeInOrdinacija method, of class PromenaDaoImpl.
     */
    @Test
    public void testGetCountUslugeInOrdinacija() {
        System.out.println("getCountUslugeInOrdinacija");
        int ordinacijaId = 0;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        int expResult = 0;
        int result = instance.getCountUslugeInOrdinacija(ordinacijaId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountUsluge method, of class PromenaDaoImpl.
     */
    @Test
    public void testGetCountUsluge() {
        System.out.println("getCountUsluge");
        PromenaDaoImpl instance = new PromenaDaoImpl();
        int expResult = 0;
        int result = instance.getCountUsluge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUsluga method, of class PromenaDaoImpl.
     */
    @Test
    public void testDeleteUsluga() {
        System.out.println("deleteUsluga");
        Usluga usluga = null;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        instance.deleteUsluga(usluga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteOrdinacija method, of class PromenaDaoImpl.
     */
    @Test
    public void testDeleteOrdinacija() {
        System.out.println("deleteOrdinacija");
        Ordinacija ordinacija = null;
        PromenaDaoImpl instance = new PromenaDaoImpl();
        instance.deleteOrdinacija(ordinacija);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsluge method, of class PromenaDaoImpl.
     */
    @Test
    public void testGetUsluge() {
        System.out.println("getUsluge");
        PromenaDaoImpl instance = new PromenaDaoImpl();
        List<Usluga> expResult = null;
        List<Usluga> result = instance.getUsluge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
