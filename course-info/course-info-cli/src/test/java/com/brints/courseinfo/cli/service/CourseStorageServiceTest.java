package com.brints.courseinfo.cli.service;

import com.brints.courseinfo.domain.Course;
import com.brints.courseinfo.repository.CourseRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CourseStorageServiceTest {

    @Test
    void storeBrintsCourses() {
        CourseRepository repository = new InMemoryCourseRepository();
        CourseStorageService courseStorageService = new CourseStorageService(repository);

        BrintsCourses br1 = new BrintsCourses("1", " Title 1", "01:40:00.123", "/url-1", false);
        courseStorageService.storeBrintsCourses(List.of(br1));

        Course expected = new Course("1", "Title 1", 100, "https://app.pluralsight.com/url-1",
                Optional.empty());
        assertEquals(List.of(expected), repository.getAllCourses());
    }

    static class InMemoryCourseRepository implements CourseRepository {
        private final List<Course> courses = new ArrayList<>();

        @Override
        public void saveCourse(Course course) {
            courses.add(course);
        }

        @Override
        public List<Course> getAllCourses() {
            return courses;
        }

        @Override
        public void addNotes(String id, String notes) {
            throw new UnsupportedOperationException();
        }
    }
}