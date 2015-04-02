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
public class Season implements Serializable {
    public String seasonID;
    public String seasonMeaning;
    
    public Season(String newSeason, String newMeaning){
        this.seasonID = newSeason;
        this.seasonMeaning = newMeaning;
    }
    
    public void updateSeason(String newSeason, String newMeaning){
        this.seasonID = newSeason;
        this.seasonMeaning = newMeaning;
    }
    
    //Edit seasons?
}
