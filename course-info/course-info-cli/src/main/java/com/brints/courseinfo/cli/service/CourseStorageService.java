package com.brints.courseinfo.cli.service;

import com.brints.courseinfo.domain.Course;
import com.brints.courseinfo.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

public class CourseStorageService {
    private static final String BR_BASE_URL = "https://app.pluralsight.com";
    private final CourseRepository courseRepository;


    public CourseStorageService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void storeBrintsCourses(List<BrintsCourses> brintsCourses) {
        for (BrintsCourses brintsCourse: brintsCourses) {
            Course course = new Course(brintsCourse.id(),
                    brintsCourse.title(), brintsCourse.durationInMinutes(),
                    BR_BASE_URL + brintsCourse.contentUrl(), Optional.empty());
            courseRepository.saveCourse(course);
        }
    }
}
