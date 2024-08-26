package com.brints.courseinfo.cli.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BrintsCourses(String id, String title, String duration, String contentUrl, boolean isRetired) {
}
