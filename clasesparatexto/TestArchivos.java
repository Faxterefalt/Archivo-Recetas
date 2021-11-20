package clasesparatexto;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;

/**
 * The test class TestArchivos.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestArchivos
{
    /**
     * Default constructor for test class TestArchivos
     */
    public TestArchivos()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    //el constructor instació archivo (para pasar verde)
    
    
    @Test
    public void testVerificarExistenciaDeArchivo(){
        Archivo1 miArchivo = new Archivo1();
        //el try catch estaba demás.
        assertEquals(false,miArchivo.Existencia());
    }

    @Test
    public void testRellenarArchivo(){
        Archivo1 miArchivo = new Archivo1();

    }
}
