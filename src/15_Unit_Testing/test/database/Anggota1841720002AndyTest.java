/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oktavian
 */
public class Anggota1841720002AndyTest extends TestCase{
    Anggota1841720002Andy mInstance;

    public Anggota1841720002AndyTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mInstance = new Anggota1841720002Andy("Andy", "Lumajang", "085456725425");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearchAndy() {
        System.out.println("search test anggota");
        String keyword = "Andy";
        ArrayList<Anggota1841720002Andy> result = mInstance.searchAndy(keyword);
        ArrayList<Anggota1841720002Andy> expResult = mInstance.getByNamaAndAlamatAndy(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveAndy() {
        System.out.println("save test anggota");
        this.mInstance.saveAndy();
        ArrayList<Anggota1841720002Andy> expResult = mInstance.getByNamaAndAlamatAndy(mInstance.getNamaAndy(), mInstance.getAlamatAndy());
        assertTrue(expResult.size()>0);
    }

}
