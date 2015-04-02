/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package barcoder;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author Seth
 */
public class BarCoder {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Barcode> barcodeDB = new ArrayList<>();
    public static ArrayList<Recipients> recipientDB = new ArrayList<>();
    public static ArrayList<Season> seasonDB = new ArrayList<>();
    public static ArrayList<Fabric> fabricDB = new ArrayList<>();
    public static ArrayList<Clothes> clothesDB = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = "barcodedb.bdb";
        String recipientDBfn = "recipientDB.bdb";
        String seasonsDBfn = "seasonsDB.bdb";
        String fabricDBfn = "fabricDB.bdb";
        String clothesDBfn = "clothesDB.bdb";
        
        try{
            barcodeDB = (ArrayList<Barcode>) SerializationUtil.deserialize(fileName);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            try {
                SerializationUtil.serialize(barcodeDB, fileName);
            } catch (IOException d) {
                d.printStackTrace();
                return;
            }
        }
        try{
            recipientDB = (ArrayList<Recipients>) SerializationUtil.deserialize(recipientDBfn);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            try {
                SerializationUtil.serialize(recipientDB, recipientDBfn);
            } catch (IOException d) {
                d.printStackTrace();
                return;
            }
        }
        try{
            seasonDB = (ArrayList<Season>) SerializationUtil.deserialize(seasonsDBfn);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            try {
                SerializationUtil.serialize(seasonDB, seasonsDBfn);
            } catch (IOException d) {
                d.printStackTrace();
                return;
            }
        }
        try{
            fabricDB = (ArrayList<Fabric>) SerializationUtil.deserialize(fabricDBfn);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            try {
                SerializationUtil.serialize(fabricDB, fabricDBfn);
            } catch (IOException d) {
                d.printStackTrace();
                return;
            }
        }
        try{
            clothesDB = (ArrayList<Clothes>) SerializationUtil.deserialize(clothesDBfn);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            try {
                SerializationUtil.serialize(clothesDB, clothesDBfn);
            } catch (IOException d) {
                d.printStackTrace();
                return;
            }
        }
        BarCoderUI form = new BarCoderUI();
        form.setVisible(true);
    }
    
}
