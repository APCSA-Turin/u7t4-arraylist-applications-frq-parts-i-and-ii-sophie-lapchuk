package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
//mariam helped me
    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0; i < list.size() -1; i++) { //cycle through entire list
            int min = i;

            for (int j = i + 1; j< list.size(); j++) { //
                if (compareStudents(list.get(j), list.get(min)) < 0) { //if j is smaller, make it the min
                    min = j; //if student is greater than j, no need to sort
                }
            }
            if (min != i) { //if the min is not at i, swap the position of the smaller student with i
                Student temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }
        return list;
    }

    private static int compareStudents(Student s1, Student s2) {
        int lastName = s1.getLastName().compareTo(s2.getLastName());
        if (lastName != 0) {
            return lastName;
        }
        int firstName = s1.getFirstName().compareTo(s2.getFirstName());
        if (firstName != 0) {
            return firstName;
        }
        if (s1.getGpa() > s2.getGpa()) {
            return -1;
        } else if (s1.getGpa() < s2.getGpa()) {
            return 1;
        }
        return 0;
    }

}
