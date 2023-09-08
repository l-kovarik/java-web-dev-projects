package org.launchcode;

import java.util.Date;
import java.util.ArrayList;

public class Restaurant {



    public static void main(String[] args) {

        MenuItem pasta = new MenuItem(13.99, "Fettuccine Alfredo",
                "Tasty, yummy, delicious. An Italian classic.",
                "entree", "May 1, 2023");

        MenuItem dessert = new MenuItem(10.99, "Creme Brulee",
                "Vanilla custard with hardened sugar on top.",
                "dessert", "May 12, 2023");

        MenuItem app = new MenuItem(13.99, "Sesame Cauliflower",
                "Cauliflower with signature sizzling sesame sauce.",
                "appetizer", "May 8, 2023");

        ArrayList<MenuItem> list = new ArrayList();

        Menu currentItems = new Menu("June 1, 2023", list);
        list.add(pasta);
        list.add(dessert);
        list.add(app);
        currentItems.setItems(list);



            StringBuilder menuInfo = new StringBuilder();
            for (MenuItem item : list){
                menuInfo.append("\n");
                menuInfo.append(item.getName());
                menuInfo.append(" - ");
                menuInfo.append(item.getPrice());
                menuInfo.append(" - ");
                menuInfo.append(item.getCategory());
                menuInfo.append("\n");
                menuInfo.append(item.getDescription());
                menuInfo.append(" - ");
                menuInfo.append(item.getDate());
                menuInfo.append("\n");
                menuInfo.append("---------------------");
                System.out.println();

                System.out.println("\nWELCOME TO OUR Restaurant\n" +
                        "View our menu:\n" +
                        "------------------------------------\n" +
                        menuInfo);



    }


    }


}
