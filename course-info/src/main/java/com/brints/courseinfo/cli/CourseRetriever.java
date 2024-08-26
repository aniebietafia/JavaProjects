package com.brints.courseinfo.cli;

import com.brints.courseinfo.cli.service.BrintsCourses;
import com.brints.courseinfo.cli.service.CourseRetrievalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CourseRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(CourseRetriever.class);

    public static void main(String[] args) {
        LOG.info("App starting on http://localhost:8080/");
        if (args.length == 0) {
            LOG.warn("Please provide an author name as first argument.");
            return;
        }
        
        try {
            retrieveCourses(args[0]);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
    }

    private static void retrieveCourses(String authorId) {
        LOG.info("Retrieving courses for author {}", authorId);
        CourseRetrievalService courseRetrievalService = new CourseRetrievalService();

        List<BrintsCourses> coursesToStore = courseRetrievalService.getCoursesFor(authorId);
        LOG.info("Retrieved the following {} courses {}", coursesToStore.size(), coursesToStore);
    }
}
