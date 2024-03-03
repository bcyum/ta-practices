package org.rd.lessons.lesson14.lessonPractice.annotations;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    private List<String> versions;

    public Machine(){
        this.versions = new ArrayList<>();
    }
    @SuppressWarnings("unchecked")
    public void addVersion(String version) {
        versions.add(version);
    }
}