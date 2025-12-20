package org.example.learningmanagementsystem.Service;

import org.example.learningmanagementsystem.Model.CollegeCourses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CollegeCoursesService {

    ArrayList<CollegeCourses> collegeCourses = new ArrayList<>();

    // get all
    public ArrayList<CollegeCourses> getAllCourses() {
        return collegeCourses;
    }

    // add
    public void addCourse(CollegeCourses course) {
        collegeCourses.add(course);
    }

    // update
    public boolean updateCourse(String courseID, CollegeCourses course) {

        for (int i = 0; i < collegeCourses.size(); i++) {
            if (collegeCourses.get(i).getCourseID().equalsIgnoreCase(courseID)) {
                collegeCourses.set(i, course);
                return true;
            }
        }
        return false;
    }

    // delete
    public boolean deleteCourse(String courseID) {
        for (int i = 0; i < collegeCourses.size(); i++) {
            if (collegeCourses.get(i).getCourseID().equalsIgnoreCase(courseID)) {
                collegeCourses.remove(i);
                return true;
            }
        }
        return false;
    }

    // get by ID
    public CollegeCourses getByID(String courseID) {
        for (CollegeCourses collegeCourses1 : collegeCourses) {
            if (collegeCourses1.getCourseID().equalsIgnoreCase(courseID)) {
                return collegeCourses1;
            }
        }
        return null;
    }

    // get by credit hour
    public ArrayList<CollegeCourses> getByCredit(int credit) {

        ArrayList<CollegeCourses> found = new ArrayList<>();

        for (CollegeCourses collegeCourses1 : collegeCourses) {
            if (collegeCourses1.getCourseCreditHour() == credit) {
                found.add(collegeCourses1);
            }
        }

        return found;
    }

    // change weekly hour if course has lab
    public boolean updateWeeklyHouByLab(String courseID) {

        for (int i = 0; i < collegeCourses.size(); i++) {

            if (collegeCourses.get(i).getCourseID().equalsIgnoreCase(courseID)) {

                if (collegeCourses.get(i).getHasLab().equalsIgnoreCase("true")) {

                    collegeCourses.get(i).setCourseWeeklyHour(collegeCourses.get(i).getCourseCreditHour() + 2);

                } else {

                    collegeCourses.get(i).setCourseWeeklyHour(collegeCourses.get(i).getCourseCreditHour());

                }

                return true;
            }
        }


        return false;
    }

}