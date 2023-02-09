import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    //array of strings
        //arrays in java are fixed in size
        String[] friendsArray = new String[4];
        //arrays can be initialized with values
        //to initialize an array with values, we can use the following syntax in curly  separated by commas write down all the values.
        String[] friendsArray2 = {"John", "Mary", "Luke", "Sam"};

        //arrayList of strings
        //open close diamond operator<> is used to specify the type of the arraylist.
        //arraylist is dynamic in size and can be resized. they do not have a fixed size.
        ArrayList<String> friendsArrayList = new ArrayList<>();

        //arraylist can be initialized with values using the following syntax.
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Mary", "Luke", "Sam"));
        //can not make an arraylist of primitives. only objects.
        //we can use the wrapper classes to make an arraylist of primitives.
        //arraylist of integers
        ArrayList<Integer> numbersArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    
}
