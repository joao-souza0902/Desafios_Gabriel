/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentimentosjava;
import org.Junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonyg
 */
public class testeOla {
    @Test
    public void TesteSaudacao(){
        Ola ola = new Ola();
        assertEquals("Ola João", ola.saudacao("João"));
    }
}
