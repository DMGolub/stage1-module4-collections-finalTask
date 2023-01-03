package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {

    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();
        for (Map.Entry<String, Set<String>> project : projects.entrySet()) {
            if (project.getValue().contains(developer)) {
                developerProjects.add(project.getKey());
            }
        }
        developerProjects.sort((p1, p2) -> p1.length() == p2.length() ? p2.compareTo(p1) : p2.length() - p1.length());
        return developerProjects;
    }
}