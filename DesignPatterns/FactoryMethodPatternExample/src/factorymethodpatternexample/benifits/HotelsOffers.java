/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpatternexample.benifits;

import factorymethodpatternexample.Benifits;
import factorymethodpatternexample.PercentageChanger;

/**
 *
 * @author Manjula Devapura
 */
public class HotelsOffers extends Benifits {


    @Override
    public String toString() {
        return "Hotels_Offers = " + PercentageChanger.offerPercentage + "% ";
    }
}
