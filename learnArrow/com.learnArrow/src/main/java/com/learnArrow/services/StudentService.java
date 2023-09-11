package com.learnArrow.services;

import java.util.List;

import com.learnArrow.entities.Course;
import com.learnArrow.entities.Lesson;

public interface StudentService {
	List<Course> fetchCourseList();
	
	Course fetchCourse(int courseId);
	//modification
	Lesson getLesson(int lessonId);
}
