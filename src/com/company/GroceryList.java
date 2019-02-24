package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    //adding to the list
    public void addGroceryItem(String item){
        groceryList.add(item);
    }


    //size will return the number of items in your list
    // .get will access an item in arrayList
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i< groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //replace or update
    public void modifyGroceryItem(int postion, String newItem){
        groceryList.set(postion,newItem);
        System.out.println("Grocery item " + (postion + 1) + " has been modified");
    }

    //remove item from list
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    //finds a particular item in list
    public String findItem(String searchItem){
      // boolean exists = groceryList.contains(searchItem);
       int position = groceryList.indexOf(searchItem);
       if (position >= 0){
           return groceryList.get(position);
       }
       return null;
    }
}
