package com.citationmanager.service;

import com.citationmanager.model.Citation;
import java.util.List;

public interface CitationService {
    Citation saveCitation(Citation citation);
    Citation findByDoi(String doi);
    List<Citation> findByAuthor(String author);
    List<Citation> findByJournal(String journal);
    void deleteCitation(String doi);
    List<Citation> getAllCitations();
}
