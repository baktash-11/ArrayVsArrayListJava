import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Array vs arrayList In java");

        // Array of String
        String[] friends = {"Mike", "John", "Peter", "Sam", "Tom", "Bob", "Alice", "Marry", "Jane"};

        // ArrayList of String
        ArrayList<String> friendsList = new ArrayList<String>(Arrays.asList("Mike", "Peter", "Sam", "Tom", "Bob", "Alice", "Marry", "Jane"));


        //pulling out array's element
        //both array and arrayList are zero based
        //getting the second elements of both array and arrayList
        System.out.println(friends[1]);
        //instead of using index we can use get method and pass the index.
        System.out.println(friendsList.get(1));

        //get the length of array and arrayList
        //.length is a property of array. we can use it to get the length of array
        System.out.println(friends.length);
        //.size is a method of arrayList. we can use it to get the size of arrayList
        System.out.println(friendsList.size());
        
        //adding new element to array's end.
        //we can't add new element to array's end. we have to create a new array and copy all the elements from old array to new array.
        
        //adding new element to arrayList's end.
        friendsList.add("Mitch");
        System.out.println(friendsList.get(8));
        System.out.println(friendsList.size());

        //set the value of array's element
        friends[0]="Mohammad";
        System.out.println(friends[0]);
        //set the value of arrayList's element
        friendsList.set(0, "Mohammad");
        System.out.println(friendsList.get(0));
        //remove the element from array
        //we can't remove the element from array. we have to create a new array and copy all the elements from old array to new array.
        //remove the element from arrayList
        friendsList.remove("bob");
        System.out.println(friendsList.size());
        System.out.println(friendsList.get(5));

        System.out.println("\n");
        //print all the elements of array
        System.out.println(friends);
        //for array we have to use for loop to print all the elements
        for (int i = 0; i < friends.length; i++) {
            System.out.print(friends[i]+" ");
        }
        System.out.println("\n");
        
        //print all the elements of arrayList
        System.out.println(friendsList);
        //for arrayList we can use for loop or for each loop to print all the elements
        for (String friend : friendsList) {
            System.out.print(friend+" ");
        }

        System.out.println("\n");
        //how to sort array
        //we can't sort array. we have to create a new array and copy all the elements from old array to new array.

        //how to sort arrayList
        friendsList.sort(null);
        System.out.println(friendsList);



    }
}
