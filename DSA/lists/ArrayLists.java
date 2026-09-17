package DSA.lists;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
    public static void main(String[] args) {

        //defining an ArrayList using ArrayList class 
        ArrayList<Integer> list = new ArrayList<>();
        
        //adding objects to the list
        list.add(0);//ads 0 to the list ; list = [ 0 ]
        list.add(2);//ads 2 to the list ; list = [ 0 , 2 ]
        list.add(3);//ads 3 to the list ; list = [ 0 , 2 , 3 ]

        //printing a ArrayList
        System.out.println(list);//prints [ 0 , 2 , 3 ]

        //getting elements from a ArrayList
        Integer e1 = list.get(0);//gives the object on the zeroeth index of the list
        System.out.println(e1);//prints 0

        //adding an element in between of the list
        list.add(1,1);//it add 1 at the first index of the list,the first parameter is the index on which we have to add and the second index is the element we want to add inside the ArrayList list = [ 0 , 1 , 2 , 3 ]
        System.out.println(list);

        //seting an value without moving the values on other places "replacing"
        System.out.println(list.set(0,5));//this sets the zeroeth index of the list to five,it also return the element that is previously stored at the index in the list list = [ 5 , 1 , 2 , 3 ]

        //deleting element
        list.remove(3);//removes the element saved at thired index of the arraylist list = [ 5 , 1 , 2 ]
        System.out.println(list);
        
        //sorting
        Collections.sort(list);//list = [ 1 , 2 , 5 ]
        System.out.println(list);

        //looping
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ "   ");
        }
    }
}