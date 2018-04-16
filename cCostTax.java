/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

/**
 *
 * @author hp
 */
class cCostTax {
     public double mcTax = 0.90;
     
     public Double  cFIndTax(double cAmount )
     {
         double FindTax = cAmount - (cAmount * mcTax);
         return FindTax;
     }
    
}
