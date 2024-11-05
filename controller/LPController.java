package controller;
import model.LP;
import model.Copy;
import model.LPContainer;


/**
 * Write a description of class LPController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPController
{
    // instance variables - replace the example below with your own
    public Copy findCopyBySerialNo(int serialNumber){
        // LPContainer lpContainer = LPContainer.getInstance();
        // for(LP lp: lpContainer.getAllLPs()){
            // for(Copy copy: lp.getCopies()){
                // if(copy.getSerialNumber().equals(serialNumber)){
                    // return copy;
                // }
            // }
        // }
        // return null;
    // }
    return LPContainer.getInstance().findCopyBySerialNo(serialNumber);
    }
}
