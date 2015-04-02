/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package barcoder;

import java.io.Serializable;

/**
 *
 * @author Seth
 */
public class Clothes implements Serializable {
    public String clothesID;
    public String clothesMeaning;
    
    public Clothes(String cID, String cM){
        this.clothesID = cID;
        this.clothesMeaning = cM;
    }
}
