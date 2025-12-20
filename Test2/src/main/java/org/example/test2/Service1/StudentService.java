package org.example.test2.Service1;


import org.example.test2.Model1.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {


    // create array
    ArrayList <Student> students = new ArrayList<>();


    //    Get all students
    public ArrayList<Student> displayStudents(){
        return students;
    }


    //    Add new student

    public void addStudent(Student student ){
        students.add(student);
    }



    //    update student
    public boolean updateStudent(String id , Student student){

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentID().equalsIgnoreCase(id)){

                students.set(i,student );
                return true;
            }
        }
        return false;
    }


    //    delete student
    public boolean deleteStudent(String id ){

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentID().equalsIgnoreCase(id)){

                students.remove(i);
                return true;
            }
        }
        return false;
    }

    //    Create an endpoint that takes a major and returns all students who have this major.
    public ArrayList<Student>  getByMajor(String major ){

        ArrayList<Student> foundStudent = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentMajor().equalsIgnoreCase(major)){

                foundStudent.add(students.get(i));

            }
        }
        return foundStudent;
    }


    //    Create an endpoint that takes a student name and returns one student .
    public ArrayList<Student>  getByName(String name ){

        ArrayList<Student> foundStudent = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentName().equalsIgnoreCase(name)){

                foundStudent.add(students.get(i));
                break;
            }
        }
        return foundStudent;
    }



}
