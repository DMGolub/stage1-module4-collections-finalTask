package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {

    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new LinkedHashSet<>();
        for (Map.Entry<String, List<String>> day : timetable.entrySet()) {
            lessons.addAll(day.getValue());
        }
        return lessons;
    }
}