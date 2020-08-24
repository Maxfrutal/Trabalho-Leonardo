/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import org.junit.Test;
import static org.testng.Assert.*;
import teste.Calculo;
import teste.CompraModel;
import org.junit.Assert;

/**
 *
 * @author Maxwel
 */
public class TestCompra extends TestCase {
    
    Calculo calc;
    CompraModel compraDesc10;
    CompraModel compraDesci;
    
 @Test
     
         public void teste(){
    
             compraDesc10 = new CompraModel();
             compraDesci = new CompraModel();
             calc = new Calculo();

        
        //CT Idade >65
        compraDesc10.setValor(2000);
        compraDesc10.setIdade(70);
        compraDesc10.setDesconto(calc.calcularDesconto(compraDesc10.getValor(), compraDesci.getIdade()));
        compraDesc10.setTotal(calc.calculartotal(compraDesc10.getValor(), compraDesci.getDesconto()));
        
        
        
        //CT Idade <65
        compraDesci.setValor(3000);
        compraDesci.setIdade(20);
        compraDesci.setDesconto(calc.calcularDesconto(compraDesc10.getValor(), compraDesci.getIdade()));
        compraDesci.setTotal(calc.calculartotal(compraDesc10.getValor(), compraDesci.getDesconto()));
        
        
        Assert.assertEquals(1800, compraDesc10.getTotal());
        Assert.assertEquals(2970, compraDesci.getTotal());
        
        
         
         
         }
   
        
        
       
    }
    

