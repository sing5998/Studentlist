/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A class that creates an Array of Students and populates it
 * with 5 students from the current section and then iterates over the
 * list to print each name.
 * @author dancye, Jan 2019
 */
//I made this change Online
//This is the second online change on 5:05 pn tuesday Jan 23
//This is the third change at 5:10 pm
//This is another change at 5:26 pm, and first change in text branch
//THis is now yet another change
public class StudentList {
    
    public static void main(String[] args)
    {
       Student [] studentList = new Student[1];//change size before running
       Student s1 = new Student();
       s1.setName("Liz Dancy");
       studentList[0]=s1;
       //fill in 4 student names before running
       for(Student s: studentList)
       {
           System.out.println(s.getName());
       }
        
    }
    
}
