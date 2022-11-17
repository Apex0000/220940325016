import java.util.ArrayList;

/*Write a Java program to create a new array list, add some elements (string) and print out the collection by using for-each loop. */
class arrlist{
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("January");
        a.add("February");
        a.add("March");
        a.add("April");
        a.add("May");
        a.add("June");
        a.add("July");
        a.add("August");
        a.add("September");
        a.add("October");
        a.add("November");
        a.add("December");
        for(String i:a){
            System.out.println(i);
        }
    }
}