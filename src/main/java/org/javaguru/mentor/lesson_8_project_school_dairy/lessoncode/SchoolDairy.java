package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import java.util.ArrayList;
import java.util.List;

class SchoolDairy {

    private List<Mark> marks;

    public SchoolDairy() {
        this.marks = new ArrayList<>();
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void addMark(Mark mark) {
        this.marks.add(mark);
    }

}
