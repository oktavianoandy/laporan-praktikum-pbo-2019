package database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Kategori1841720002AndyTest extends TestCase{
    
    Kategori1841720002Andy mInstance;

    public Kategori1841720002AndyTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mInstance = new Kategori1841720002Andy("Comics", "Comic is combination words and picture");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearchAndy() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720002Andy> result = mInstance.searchAndy(keyword);
        ArrayList<Kategori1841720002Andy> expResult = mInstance.getByNamaAndKeteranganAndy(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveAndy() {
        System.out.println("save test");
        this.mInstance.saveAndy();
        ArrayList<Kategori1841720002Andy> expResult = mInstance.getByNamaAndKeteranganAndy(mInstance.getNamaAndy(), mInstance.getKeteranganAndy());
        assertTrue(expResult.size()>0);
    }
    
    
    
}
