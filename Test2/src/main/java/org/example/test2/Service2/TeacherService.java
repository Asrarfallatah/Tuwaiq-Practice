package org.example.test2.Service2;

import org.example.test2.Model1.Student;
import org.example.test2.Model2.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TeacherService {

    // create an array

    ArrayList <Teacher> teachers = new ArrayList<>();

    //    Get all teachers
    public ArrayList<Teacher> displayTeacher(){
        return teachers;
    }

    //    Add new teacher
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }


    //    update teacher
    public boolean updateTeacher(String id , Teacher teacher){
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getTeacherID().equalsIgnoreCase(id)){
                teachers.set(i, teacher);
                return true;
            }
        }
        return false;
    }


    //    delete teacher
    public boolean deleteTeacher(String id ){

        for (int i = 0; i < teachers.size(); i++) {

            if (teachers.get(i).getTeacherID().equalsIgnoreCase(id)){

                teachers.remove(i);
                return true;
            }
        }
        return false;
    }

    //    Create an endpoint that takes a teacher id and returns one teacher .
    public ArrayList<Teacher>  getByID(String id ){

        ArrayList<Teacher> foundTeacher = new ArrayList<>();

        for (int i = 0; i < teachers.size(); i++) {

            if (teachers.get(i).getTeacherID().equalsIgnoreCase(id)){

                foundTeacher.add(teachers.get(i));
                break;
            }
        }
        return foundTeacher;
    }


    //    Create an endpoint that takes a salary and return all teachers who have this salary or above .
    public ArrayList<Teacher> getBySalary(double salary ){

        ArrayList<Teacher> foundStudent = new ArrayList<>();

        for (int i = 0; i < teachers.size(); i++) {

            if (teachers.get(i).getTeacherSalary()>= salary ){

                foundStudent.add(teachers.get(i));

            }
        }
        return foundStudent;
    }




}
