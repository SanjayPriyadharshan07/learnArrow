package com.learnArrow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnArrow.entities.Course;
import com.learnArrow.entities.Lesson;
import com.learnArrow.repositories.CourseRepository;
import com.learnArrow.repositories.LessonRepository;

@Service
public class TrainerServiceImplementation implements
						TrainerService{
	@Autowired
	CourseRepository repo;
	@Autowired
	LessonRepository lrepo;
	@Override
	public String addCourse(Course course) {
		repo.save(course);
		return "course added";
	}
	@Override
	public List<Course> fetchAllCourses() {
		return repo.findAll();
	}
	@Override
	public String addLesson(Lesson lesson) {
		lrepo.save(lesson);
		return "lesson added";
	}
	@Override
	public String saveCourse(Course course) {
		repo.save(course);
		return "course updated";
	}

}
