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

//overloaded method
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0){
            modifyGroceryItem(position, newItem);
        }
    }

    //replace or update
    private void modifyGroceryItem(int postion, String newItem){
        groceryList.set(postion,newItem);
        System.out.println("Grocery item " + (postion + 1) + " has been modified");
    }

// overloaded method
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >=0){
            modifyGroceryItem(position, item);
        }
    }

    //remove item from list
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    //finds a particular item in list
    private int findItem(String searchItem){
return groceryList.indexOf(searchItem);

    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
}
