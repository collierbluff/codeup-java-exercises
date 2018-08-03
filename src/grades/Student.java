package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){

        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){

        int total = 0;

        for(int grade: grades){
            total += grade;
        }

        return total / grades.size();

    }
}
