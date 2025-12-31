package model;//packages are like folders

import db.DB;

public class Main {
    public static void main(String[] args) {

        Person.count = 5;
        System.out.println(Person.count);

        DB db = new DB();
        //info();
        }

    public static void info(){
        System.out.println("Hello");
    }

    public static void info(String word){
        System.out.println(word + "!");
    }
}


