
import com.it355.jovanastricic.hibernatecrud.dao.PromenaDao;
import com.it355.jovanastricic.hibernatecrud.dao.impl.PromenaDaoImpl;
import com.it355.jovanastricic.hibernatecrud.entity.Ordinacija;
import com.it355.jovanastricic.hibernatecrud.entity.Usluga;
import java.util.List;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Jovana BGD
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
public class CrudTestJUnit {
    
    @Autowired
    protected PromenaDao instance;
    
    @Autowired
    private ApplicationContext context;
    
    @Before
    public void setUp() {
        
    }
    
 @Test
    public void addOrdinacijaTest() {
        Ordinacija ord = new Ordinacija();
        ord.setNaziv_ordinacija("Nova kategorija");
        ord.setOpis_ordinacija("Novi opis");
        ord.setAdresa_ordinacija("Nova adresa");
        ord.setEmail_ordinacija("Novi mail");
        ord.setTelefon_ordinacija("Novi telefon");
        Ordinacija newOrd = instance.addOrdinacija(ord);
        instance.deleteOrdinacija(newOrd);
        Assert.assertNotNull(newOrd);
    }
    
    @Test
    public void getOrdinacijaByIdTest() {
        Ordinacija ord = new Ordinacija();
        ord.setNaziv_ordinacija("Nova kategorija");
        ord.setOpis_ordinacija("Novi opis");
        ord.setAdresa_ordinacija("Nova adresa");
        ord.setEmail_ordinacija("Novi mail");
        ord.setTelefon_ordinacija("Novi telefon");
        ord.setRadnovreme_ordinacija("10-18");
        Ordinacija newOrd = instance.addOrdinacija(ord);
        Ordinacija get = instance.getOrdinacijaById(newOrd.getId_ordinacija());
        instance.deleteOrdinacija(newOrd);
        Assert.assertNotNull(get);
    }
    
    
      @Test
    public void deleteOrdinacijaTest() {
        Ordinacija ord = new Ordinacija();
        ord.setNaziv_ordinacija("Nova kategorija");
        ord.setOpis_ordinacija("Novi opis");
        ord.setAdresa_ordinacija("Nova adresa");
        ord.setEmail_ordinacija("Novi mail");
        ord.setTelefon_ordinacija("Novi telefon");
        Ordinacija newOrd = instance.addOrdinacija(ord);
        instance.deleteOrdinacija(newOrd);
        Ordinacija deletedOrdinacija = instance.getOrdinacijaById(newOrd.getId_ordinacija());
        Assert.assertNull(deletedOrdinacija);
    }
    
    @Test
    public void addUslugaTest() {
        Usluga usl = new Usluga();
        usl.setTip_usluga("Novi tip");
        usl.setNaziv_usluga("Nova usluga");
        usl.setCena_usluga(2500);
        Usluga newUsl = instance.addUsluga(usl);
        instance.deleteUsluga(newUsl);
        Assert.assertNotNull(newUsl);
    }
    
    @Test
    public void getUslugaByIdTest() {
        Usluga usl = new Usluga();
        usl.setTip_usluga("Novi tip");
        usl.setNaziv_usluga("Nova usluga");
        usl.setCena_usluga(2500);
        Usluga newUsl = instance.addUsluga(usl);
        Usluga get = instance.getUslugaById(newUsl.getId_usluga());
        instance.deleteUsluga(newUsl);
        Assert.assertNotNull(get);
    }
    
     @Test
    public void testGetCountUslugeInOrdinacija() {
        System.out.println("getCountUslugeInOrdinacija");
        int ordinacijaId = 7;
        int expResult = 0;
        int result = instance.getCountUslugeInOrdinacija(ordinacijaId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testGetCountUsluge() {
        System.out.println("getCountUsluge");
        int expResult = 2;
        int result = instance.getCountUsluge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void deleteUslugaTest() {
        Usluga usl = new Usluga();
        usl.setTip_usluga("Novi tip");
        usl.setNaziv_usluga("Nova usluga");
        usl.setCena_usluga(2500);
        Usluga newUsl = instance.addUsluga(usl);
        instance.deleteUsluga(newUsl);
        Usluga deletedUsluga = instance.getUslugaById(newUsl.getId_usluga());
        Assert.assertNull(deletedUsluga);
    }
    
   
}