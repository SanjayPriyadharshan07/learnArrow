package com.learnArrow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnArrow.entities.Lesson;

public interface LessonRepository 
			extends JpaRepository<Lesson, Integer>{
		
	//modification
	Lesson findByLessonId(int lessonId);
}
