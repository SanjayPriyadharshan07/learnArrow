package com.learnArrow.services;

import java.util.List;

import com.learnArrow.entities.Course;
import com.learnArrow.entities.Lesson;

public interface TrainerService {
	String addCourse(Course course);
	List<Course> fetchAllCourses();
	String addLesson(Lesson lesson);
	String saveCourse(Course course);
}
