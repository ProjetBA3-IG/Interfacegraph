/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;

/**
 *
 * @author azouagh
 */
public class DeclarationVariable implements Serializable {
    
    String type;
    String nomVaraible;
    String endOfInstruction  = ";\n";
    DeclarationVariable(String type , String nomVaraible ){
        this.type = type;
        this.nomVaraible = nomVaraible;
    }

    @Override
    public String toString() {
      return type + " " +nomVaraible+endOfInstruction;
    }
   
    
}
