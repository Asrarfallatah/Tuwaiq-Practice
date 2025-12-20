package org.example.schoolsystem.Service;


import lombok.RequiredArgsConstructor;
import org.example.schoolsystem.Api.ApiException;
import org.example.schoolsystem.DTO.CourseDTO;
import org.example.schoolsystem.Model.Course;
import org.example.schoolsystem.Model.Student;
import org.example.schoolsystem.Model.Teacher;
import org.example.schoolsystem.Repository.CourseRepository;
import org.example.schoolsystem.Repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CourseService {


    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;

    // get all course from the database
    public List<Course> getAllCourses(){

        // check if there is a course in the database
        if (courseRepository.findAll().isEmpty()){
            throw new ApiException("error there is no courses in the database yet to show their information's ! ");
        }

        return courseRepository.findAll();
    }

    // add a course  to the database
    public void addCourse(Course course){

        courseRepository.save(course);

    }

    // assign a course to a teacher
    public void assignCourseToTeacher(Integer teacher_id  , Integer course_id){

        Course course = courseRepository.findCourseByCourseId(course_id);
        Teacher teacher = teacherRepository.findTeacherByTeacherId(teacher_id);

        if (course == null || teacher == null){
            throw new ApiException("error could not assign the course to the teacher one of them does not exist in the database !");
        }

        course.setTeacher(teacher);
        courseRepository.save(course);

    }

    // update a course within the database
    public void updateCourse(Integer courseId , CourseDTO courseDTO){

        // check if course exists
        Course oldCourse = courseRepository.findCourseByCourseId(courseId);
        if (oldCourse == null){
            throw new ApiException("error no course with that id ("+ courseId +") is found in the database !");
        }

        // update
        oldCourse.setCourseName(courseDTO.getCourseName());

        courseRepository.save(oldCourse);

    }

    // delete a course from the database
    public void deleteCourse(Integer courseId){

        // check if course exists
        Course oldCourse = courseRepository.findCourseByCourseId(courseId);
        if (oldCourse == null){
            throw new ApiException("error no course with that id ("+ courseId +") is found in the database !");
        }

        courseRepository.delete(oldCourse);

    }

    ///  extra endpoints

    // get teacher name and course name by course id
    public Teacher getTeacherNameByCourseId(Integer courseId){

        // check if course exists
        Course course = courseRepository.findCourseByCourseId(courseId);
        if (course == null){
            throw new ApiException("error no course with that id ("+ courseId +") is found in the database !");
        }

        return course.getTeacher();

    }


    // get students in this course
    public Set<Student> getStudentsByCourseId(Integer courseId){

        // check if course exists
        Course course = courseRepository.findCourseByCourseId(courseId);
        if(course == null){
            throw new ApiException("error no course with that id is found !");
        }

        // check if course has a teacher assigned
        Teacher teacher = course.getTeacher();
        if(teacher == null){
            throw new ApiException("error this course has no teacher assigned !");
        }

        return teacher.getStudents();
    }





}
