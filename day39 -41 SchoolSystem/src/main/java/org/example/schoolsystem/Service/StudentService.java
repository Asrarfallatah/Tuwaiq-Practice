package org.example.schoolsystem.Service;


import lombok.RequiredArgsConstructor;
import org.example.schoolsystem.Api.ApiException;
import org.example.schoolsystem.Model.Student;
import org.example.schoolsystem.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {


    // connect to the database
    private final StudentRepository studentRepository;


    // get all students
    public List<Student> getAllStudents(){

        // check if there is a student in the database
        if (studentRepository.findAll().isEmpty()){
            throw new ApiException("error there is no students in the database yet to show their information's ! ");
        }
        return studentRepository.findAll();
    }


    // add a student
    public void addStudent (Student student){
        studentRepository.save(student);
    }

    // update a student
    public void updateStudent (Integer studentId , Student student){


        // check if student exists
        Student oldStudent = studentRepository.findStudentByStudentId(studentId);
        if (oldStudent == null){
            throw new ApiException("error no student with that id ("+ studentId +") is found in the database to update his information!");
        }


        // update
        oldStudent.setName(student.getName());
        oldStudent.setAge(student.getAge());


        studentRepository.save(oldStudent);


    }

    // delete a student

    public void deleteStudent (Integer studentId){

        //check if student exists
        Student student  = studentRepository.findStudentByStudentId(studentId);
        if (student == null){
            throw new ApiException("error no student with that id ("+ studentId +") is found in the database to delete his information!");
        }

        studentRepository.deleteById(studentId);
    }

    ///  extra endpoint

    // take studentId and major and update the major of the student
    public void updateStudentMajor (Integer studentId , String major){

        // check if student exists
        Student oldStudent = studentRepository.findStudentByStudentId(studentId);
        if (oldStudent == null){
            throw new ApiException("error no student with that id ("+ studentId +") is found in the database to update his major!");
        }

        // check if the major in parameter is like the major in the database
        if (oldStudent.getMajor().equals(major)){
            throw new ApiException("error the major you are trying to update is the same as the current major of the student !");
        }

        // update
        oldStudent.setMajor(major);

        // drop all the courses of the student when changing his major
        oldStudent.getTeachers().clear();

        // save
        studentRepository.save(oldStudent);

    }








}
