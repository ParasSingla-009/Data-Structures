package com.OOPS.OOP7.EnumExample;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // these are public,static & final members of the class
        // since it's final no inheritance
        // type is Week

        Week(){
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected only private or default
        
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for(Week day : Week.values()){
//            System.out.println(day);
//        }
    }
}
