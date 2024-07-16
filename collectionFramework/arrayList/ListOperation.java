package collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperation {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        try {
            addElement(ls, "hello");
            addElement(ls, "world");
            addElement(ls, "happy");
            insertElementWithSpecificIndex(ls, 2, "hi"); // This will throw an exception
            insertElementWithSpecificIndex(ls, ls.size(), "heh");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(ls);

        String el = null;
        try {
            el = retrieveAndUpdateElementAtAnyIndex(ls, 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(el);
        System.out.println("After updated!");
        System.out.println(ls);

        try{
            removeElementAtAnyIndex(ls, 1);
        } catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }

        System.out.println("After remove");
        System.out.println(ls);

        try {
            searchElement(ls, "helo");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            sortedElement(ls);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("After sorted");
        System.out.println(ls);

        try {
            reverseElement(ls);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("After reverse");
        System.out.println(ls);
    }

//      add new element into list
    public static void addElement(List<String> list, String element) {
        try {
            list.add(element);
        } catch (Exception e) {
            System.out.println("Error while adding element: " + e.getMessage());
        }
    }
//      insert new element base on the specific index
    public static void insertElementWithSpecificIndex(List<String> list, int index, String element) {
        try {
            list.add(index, element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error while inserting element: " + e.getMessage());
        }
    }
//      retrieve element at a specific index then update that element to the word update
    public static String retrieveAndUpdateElementAtAnyIndex(List<String> list, int index) {
        try {
            String element = list.get(index);
            updateElementAtAnyIndex(list, index, "update");
            return element;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error while retrieving element: " + e.getMessage());
        }
        return null;
    }
//      update element at any index
    public static void updateElementAtAnyIndex(List<String> list, int index, String element){
        try{
            list.set(index, element);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
//      remove element at any index
    public static void removeElementAtAnyIndex(List<String> list, int index){
        try{
            list.remove(index);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
//      search any element in list
    public static void searchElement(List<String> list, String element){
        try{
            if(list.contains(element)){
                System.out.println(element + " is founded in the list");
            }
            else
                System.out.println(element + " cannot be found!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
//      sorted element in list
    public static void sortedElement(List<String> list){
        try {
            Collections.sort(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
//      reverse element in list
    public static void reverseElement(List<String> list){
        try{
            Collections.reverse(list);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
