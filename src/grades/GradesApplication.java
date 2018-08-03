package grades;

import java.util.HashMap;

import util.Input;

public class GradesApplication {

    public static void main(String[] args){

        Input input = new Input();

        HashMap<String, Student> students = new HashMap<>();

        Student collier = new Student("Collier");

        collier.addGrade(95);
        collier.addGrade(85);
        collier.addGrade(75);

        Student mykel = new Student("Mykel");

        mykel.addGrade(100);
        mykel.addGrade(70);
        mykel.addGrade(65);

        Student tj = new Student("TJ");

        tj.addGrade(100);
        tj.addGrade(90);
        tj.addGrade(85);

        Student jillian = new Student("Java");

        jillian.addGrade(70);
        jillian.addGrade(80);
        jillian.addGrade(90);


        students.put("cbluff", collier);
        students.put("mkovar", mykel);
        students.put("tenglish", tj);
        students.put("jjillian", jillian);

        System.out.println("Welcome!\nHere are some github usernames:");

        for(String gitName: students.keySet()){
            System.out.print(" | " + gitName + " | ");
        }

        boolean yes = true;

        do{

            System.out.println("What user do you want more information on?");

            String target = input.getString().trim();

            if(students.containsKey(target)){

                System.out.println("Name: " + students.get(target).getName() + " - Username: " + target);
                System.out.println("Current Grade Average: " + students.get(target).getGradeAverage());
            }else{
                System.out.println("Sorry, I didn't find a user named: " + target);
            }


            System.out.println("\nWould you like to see another user?");
            yes = input.yesNo();

        }while (yes);

        System.out.println("Goodbye!");

    }

}
