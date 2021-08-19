package com.springrest.springrest.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	public CourseServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Course(145, "java Core Course", "this course contains basics of java"));
//		list.add(new Course(127,"hibernate", "this course contains hibernate tech"));
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null;
//		for (Course course : list) {
//			if (course.getId() == courseId) {
//				c= course;
//				break;
//			}
//		}
		
		return courseDao.getById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e->{
//			if (e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
//		list.stream().filter(course->{
//			if (course.getId()!=courseId)
//			{
//				return true;
//			}else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		
		Course entity = courseDao.getById(parseLong);
		courseDao.delete(entity);
	}


		
}
	
	

