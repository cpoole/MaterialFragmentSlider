package managers;

import java.util.ArrayList;

import DAO.menuItem;

public final class menuManager {
    private static ArrayList<menuItem> menuEntries;

    public static ArrayList<menuItem> getMenuEntries() {
        return menuEntries;
    }

    public static void setMenuEntries(ArrayList<menuItem> menuEntriesnew) {
        menuEntries = menuEntriesnew;
    }

    public static ArrayList<menuItem> getAppetizers(){
        ArrayList<menuItem> categoryEntries = new ArrayList<>();
        for(int i=0; i< menuEntries.size(); i++){
            if((menuEntries.get(i).getType()).equals("Appetizer")){
                categoryEntries.add(menuEntries.get(i));
            }
        }
        return categoryEntries;
    }
    public static ArrayList<menuItem> getSoupSalad(){
        ArrayList<menuItem> categoryEntries = new ArrayList<>();
        for(int i=0; i< menuEntries.size(); i++){
            if((menuEntries.get(i).getType()).equals("Soups and Salads")){
                categoryEntries.add(menuEntries.get(i));
            }
        }
        return categoryEntries;
    }
    public static ArrayList<menuItem> getEntrees(){
        ArrayList<menuItem> categoryEntries = new ArrayList<>();
        for(int i=0; i< menuEntries.size(); i++){
            if((menuEntries.get(i).getType()).equals("Entree")){
                categoryEntries.add(menuEntries.get(i));
            }
        }
        return categoryEntries;
    }
    public static ArrayList<menuItem> getDesserts(){
        ArrayList<menuItem> categoryEntries = new ArrayList<>();
        for(int i=0; i< menuEntries.size(); i++){
            if(menuEntries.get(i).getType() == "Entree"){
                categoryEntries.add(menuEntries.get(i));
            }
        }
        return categoryEntries;
    }
    public static ArrayList<menuItem> getALaCarte(){
        ArrayList<menuItem> categoryEntries = new ArrayList<>();
        for(int i=0; i< menuEntries.size(); i++){
            if(menuEntries.get(i).getType() == "Sides"){
                categoryEntries.add(menuEntries.get(i));
            }
        }
        return categoryEntries;
    }
    public static ArrayList<menuItem> getBeverages(){
        ArrayList<menuItem> categoryEntries = new ArrayList<>();
        for(int i=0; i< menuEntries.size(); i++){
            if(menuEntries.get(i).getType() == "Entree"){
                categoryEntries.add(menuEntries.get(i));
            }
        }
        return categoryEntries;
    }

}
