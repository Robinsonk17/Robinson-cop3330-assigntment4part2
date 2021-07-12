/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Keondez Robinson
 */

package ucf.assignments;

public class ToDoList {
    /*

    String name
    List<Item> items

    Constructor(String name) {
        this.name = name
        items = new List
    }

    Methods -
    setName(String name) {
        this.name = name
    }

    getName() {
        return name
    }

    setItem(Item item, int index) {
        items.set(index, item), index is needed to update at varying positions
    }

    getItem(int index) {
        return items.get(index), index is needed to retrieve item at varying positions
    }

    Utility Methods - Essentially wrappers for the list of items
    addItem(Item item) {
        items.add(item)
    }

    removeItem(Item item) {
        items.remove(item)
    }

    displayList(Enum filter) {
        - for each item, check enum against all cases
        for (Item item : items) {
            -- if case COMPLETE, output only completed items
            if (filter == COMPLETE && item.status == true) {
                print item
            }

            -- else if case INCOMPLETE, output only incomplete items
            else if (filter == INCOMPLETE && item.status == false) {
                print item
            }

            -- else, print item. Case must be ALL
            else {
                print item
            }
        }
   }

    */
}
