/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package barcoder;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Seth
 */
public class Barcode implements Serializable {
    public String data;
    public String price;
    public ArrayList <String> Destinations;
    public String name;
    public Calendar date;
    public Calendar dueDate;
    public String damaged;
    public String lost;
    public String inOut;
    
    public Barcode(String name, Calendar dd){
        this.name = name;
        this.data = "";
        this.date = new GregorianCalendar();
        this.date = Calendar.getInstance();
        this.price = "";
        this.Destinations = new ArrayList <>();
        this.dueDate = dd;
        this.damaged = "No";
        this.lost = "No";
        this.inOut = "";
    }
    
    public Barcode(String name){
        this.name = name;
        this.data = "";
        this.date = new GregorianCalendar();
        this.date = Calendar.getInstance();
        this.dueDate = new GregorianCalendar();
        this.price = "";
        this.Destinations = new ArrayList <>();
        this.damaged = "No";
        this.lost = "No";
        this.inOut = "";
    }
    public void changeData(String newData){
        this.data = newData;
    }
    
    public String dataDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss");
        SimpleDateFormat sdfdd = new SimpleDateFormat("yyyy/MM/dd");
        return "Date Entered: " + sdf.format(this.date.getTime()) + "\n" + "Transit Status: " + this.inOut + "\n" + this.data + "\n" + "Price: " + this.price + "\n" + "Destination(s): " + this.Destinations.toString() +  "\n" + "Due Date: " + sdfdd.format(this.dueDate.getTime()) + "\n" + "Damaged: " + this.damaged + "\n" + "Lost: " + this.lost;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
