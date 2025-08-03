package com.citationmanager.model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Citation {
    private String doi;
    private String title;
    private List<String> authors;
    private String journal;
    private int year;
    private String volume;
    private String issue;
    private String pages;

    public Citation() {
        this.authors = new ArrayList<>();
    }

    public Citation(String doi, String title, List<String> authors, String journal, int year) {
        this.doi = doi;
        this.title = title;
        this.authors = authors;
        this.journal = journal;
        this.year = year;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
}
