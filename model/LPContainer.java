package model;
import java.util.ArrayList;

public class LPContainer {
    private static LPContainer instance; // Singleton-instans
    private ArrayList<LP> lpList; // Liste af LP-objekter
    private ArrayList<Copy> copies;

    // Privat constructor, så instansen kun kan skabes indenfor klassen
    private LPContainer() {
        lpList = new ArrayList<>();
        copies = new ArrayList<>();
    }

    // Henter singleton-instansen af LPContainer
    public static LPContainer getInstance() {
        if (instance == null) {
            instance = new LPContainer();
        }
        return instance;
    }

    // Tilføjer en LP til listen
    public void addLP(LP lp) {
        lpList.add(lp);
    }

    // Fjerner en LP fra listen ved at give LP-objektet
    public void removeLP(LP lp) {
        lpList.remove(lp);
    }

    // Fjerner en LP fra listen ved at give en specifik index
    public void removeLP(int index) {
        if (index >= 0 && index < lpList.size()) {
            lpList.remove(index);
        }
    }

    // Henter alle LP-objekterne som en liste
    public ArrayList<LP> getAllLPs() {
        return new ArrayList<>(lpList); // Returnerer en kopi for at beskytte data
    }
    
    public ArrayList<Copy> getAllCopies(){
        return new ArrayList<>(copies);
    }
    // Finder en LP baseret på barcode
    public LP findLPByBarcode(String barcode) {
        for (LP lp : lpList) {
            if (lp.getBarcode().equals(barcode)) {
                return lp;
            }
        }
        return null; // Returnerer null hvis ingen LP blev fundet
    }
    
    public Copy findCopyBySerialNo(int serialNumber){
        for(Copy copy : copies){
            if(copy.getSerialNumber() == serialNumber){
                return copy;
            }
        }
        return null;
    }
}    