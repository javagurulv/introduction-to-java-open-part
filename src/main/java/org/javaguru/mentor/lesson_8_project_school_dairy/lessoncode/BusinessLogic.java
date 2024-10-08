package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import java.util.ArrayList;
import java.util.List;

class BusinessLogic {

    private SchoolDairy schoolDairy;

    public BusinessLogic() {
        this.schoolDairy = new SchoolDairy();
    }

    public void addMark(String subject, int mark) {
        Mark newMark = new Mark(subject, mark);
        schoolDairy.addMark(newMark);
    }

    public List<Mark> getAllMarks() {
        return schoolDairy.getMarks();
    }

    public int findMarksBySubjectStream(String subject) {
        return schoolDairy.getMarks().stream()
                .filter(mark -> mark.getSubject().equals(subject))
                .map(mark -> mark.getMark())
                .max(Integer::compareTo)
                .orElseGet(() -> 0);
    }


        // find all marks by subject
    private List<Mark> findMarksBySubject(String subject) {
        List<Mark> subjectMarks = new ArrayList<>();

/*
        List<Mark> allMarks = dairy.getMarks();
        for (int i = 0; i < allMarks.size(); i++) {
            Mark mark = allMarks.get(i);
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
*/

        for (Mark mark : schoolDairy.getMarks()) {
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }

    // find best mark for subject
    public int findBestMark(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        int bestMark = subjectMarks.get(0).getMark();
        for (Mark mark : subjectMarks) {
            if (mark.getMark() > bestMark) {
                bestMark = mark.getMark();
            }
        }
        return bestMark;
    }

}
