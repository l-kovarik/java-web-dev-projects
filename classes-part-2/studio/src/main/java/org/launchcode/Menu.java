package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String lastUpdated;
    public ArrayList<MenuItem> items;




    public Menu(String d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}


