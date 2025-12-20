package org.example.schoolsystem.Service;


import lombok.RequiredArgsConstructor;
import org.example.schoolsystem.Api.ApiException;
import org.example.schoolsystem.Model.Student;
import org.example.schoolsystem.Model.Teacher;
import org.example.schoolsystem.Repository.StudentRepository;
import org.example.schoolsystem.Repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {

    private final TeacherRepository teacherRepository;
    private final StudentRepository studentRepository;


    // get all teacher from the database
    public List<Teacher> getAllTeachers(){

        // check if there is a teacher in the database
        if (teacherRepository.findAll().isEmpty()){
            throw new ApiException("error there is no teachers in the database yet to show their information's ! ");
        }

        return teacherRepository.findAll();
    }

    // add a teacher to the database
    public void addTeacher(Teacher teacher){


        // check if teacher is already exist
        if (teacherRepository.findTeacherByTeacherId(teacher.getTeacherId()) != null) {
            throw new ApiException("error this teacher with that id (" + teacher.getTeacherId() + ") is already exist in the database !");
        }

        // add it
        teacherRepository.save(teacher);
    }


    // update a teacher in the database
    public void updateTeacher (Integer teacherId , Teacher teacher){


        // check if teacher exists
        Teacher oldTeacher = teacherRepository.findTeacherByTeacherId(teacherId);
        if (oldTeacher == null){
            throw new ApiException("error no teacher with that id ("+ teacherId +") is found in the database !");
        }


        // update
        oldTeacher.setName(teacher.getName());
        oldTeacher.setAge(teacher.getAge());
        oldTeacher.setEmail(teacher.getEmail());
        oldTeacher.setSalary(teacher.getSalary());

        // save it
        teacherRepository.save(oldTeacher);
    }

    // delete a teacher from the database
    public void deleteTeacher (Integer teacherId){

        // check if teacher exists
        Teacher oldTeacher = teacherRepository.findTeacherByTeacherId(teacherId);
        if (oldTeacher == null){
            throw new ApiException("error no teacher with that id ("+ teacherId +") is found in the database !");
        }

        // delete
        teacherRepository.delete(oldTeacher);
    }


    // get teacher details by id
    public Teacher getTeacherDetails(Integer teacherId){

       // check if teacher exists
        Teacher teacher = teacherRepository.findTeacherByTeacherId(teacherId);
        if (teacher == null){
            throw new ApiException("error no teacher with that id ("+ teacherId +") is found in the database !");
        }

        return teacher;
    }

    // assign a student to a teacher
    public void assignStudentToTeacher(Integer teacherId , Integer studentId){

        // check if teacher exists
        Teacher teacher = teacherRepository.findTeacherByTeacherId(teacherId);
        if (teacher == null){
            throw new ApiException("error no teacher with that id ("+ teacherId +") is found in the database !");
        }


        // check if student exists
        Student student = studentRepository.findStudentByStudentId(studentId);
        if (student == null){
            throw new ApiException("error no student with that id ("+ studentId +") is found in the database !");
        }


       // assign
        student.getTeachers().add(teacher);
        teacher.getStudents().add(student);


        // save
        studentRepository.save(student);
        teacherRepository.save(teacher);


    }


    // take course id and return list of students enrolled in this course








}
