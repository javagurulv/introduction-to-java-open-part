package org.javaguru.mentor.lesson_3_oop_first_look.homework.solutions.level_3_junior.task_2;

class Book {

    private String title;
    private String author;
    private int releaseYear;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String title,
                String author,
                int releaseYear,
                Chapter chapter1,
                Chapter chapter2) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

}
