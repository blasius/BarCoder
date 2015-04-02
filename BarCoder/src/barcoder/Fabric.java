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
public class Fabric implements Serializable {
    public String fabricID;
    public String fabricMeaning;
    
    public Fabric(String newFabID, String newMeaning){
        this.fabricID = newFabID;
        this.fabricMeaning = newMeaning;
    }
    
    public void updateFab(String newFabID, String newMeaning){
        newMeaning = newMeaning.toUpperCase();
        this.fabricID = newFabID;
        this.fabricMeaning = newMeaning;
    }
}
