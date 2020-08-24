/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static org.testng.Assert.*;
import teste.Calculo;
import teste.CompraModel;

/**
 *
 * @author Maxwel
 */
public class Teste02 extends TestCase{
    Calculo calc;
    CompraModel compraDesc10;
    CompraModel compraDesci;
    
    
    public Teste02() {
        
             compraDesc10 = new CompraModel();
             compraDesci = new CompraModel();
             calc = new Calculo();

        
        //CT Idade >20
        compraDesc10.setValor(1000);
        compraDesc10.setIdade(25);
        compraDesc10.setDesconto(calc.calcularDesconto(compraDesc10.getValor(), compraDesci.getIdade()));
        compraDesc10.setTotal(calc.calculartotal(compraDesc10.getValor(), compraDesci.getDesconto()));
        
        
        
        //CT Idade <20
        compraDesci.setValor(900);
        compraDesci.setIdade(16);
        compraDesci.setDesconto(calc.calcularDesconto(compraDesc10.getValor(), compraDesci.getIdade()));
        compraDesci.setTotal(calc.calculartotal(compraDesc10.getValor(), compraDesci.getDesconto()));
        
        
        Assert.assertEquals(990, compraDesc10.getTotal());
        Assert.assertEquals(891, compraDesci.getTotal());
   
 
    }
    
}
