/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package barcoder;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Seth
 */
public class Recipients implements Serializable {
    public String categoryName;
    public ArrayList<String> recipients;
    
    public Recipients(String cn){
        this.categoryName = cn;
        this.recipients = new ArrayList<>();
    }
    
    void addRecipient(String toAdd){
        this.recipients.add(toAdd);
    }
    
    void removeRecipient(String toRemove){
        if (this.recipients.contains(toRemove)){
            this.recipients.remove(toRemove);
        }
    }
}
