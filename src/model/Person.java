package model;

public class Person {
//the difference is that the "static" variable belongs to the class, not an object
    public static int count;

    public Person(){
        count++;
    }

    public void getCount(){
        System.out.println("Quantity: "+count);
    }

}
