/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import org.junit.Assert;
import static org.testng.Assert.*;
import teste.Calculo;
import teste.CompraModel;

/**
 *
 * @author Maxwel
 */
public class Teste01 extends TestCase {
    
    Calculo calc;
    CompraModel compraDesc10;
    CompraModel compraDesci;
    
    
    public Teste01() {
          compraDesc10 = new CompraModel();
             compraDesci = new CompraModel();
             calc = new Calculo();

        
        //CT Idade >45
        compraDesc10.setValor(3000);
        compraDesc10.setIdade(50);
        compraDesc10.setDesconto(calc.calcularDesconto(compraDesc10.getValor(), compraDesci.getIdade()));
        compraDesc10.setTotal(calc.calculartotal(compraDesc10.getValor(), compraDesci.getDesconto()));
        
        
        
        //CT Idade <45
        compraDesci.setValor(6000);
        compraDesci.setIdade(30);
        compraDesci.setDesconto(calc.calcularDesconto(compraDesc10.getValor(), compraDesci.getIdade()));
        compraDesci.setTotal(calc.calculartotal(compraDesc10.getValor(), compraDesci.getDesconto()));
        
        Assert.assertEquals(2970, compraDesc10.getTotal());
        Assert.assertEquals(5940, compraDesci.getTotal());
        
        
    }
    
}
