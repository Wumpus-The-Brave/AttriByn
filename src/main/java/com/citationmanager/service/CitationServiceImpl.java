package com.citationmanager.service;

import com.citationmanager.model.Citation;
import java.util.*;

public class CitationServiceImpl implements CitationService {
    private Map<String, Citation> citationDatabase = new HashMap<>();

    @Override
    public Citation saveCitation(Citation citation) {
        if (citation.getDoi() == null) {
            throw new IllegalArgumentException("DOI cannot be null");
        }
        citationDatabase.put(citation.getDoi(), citation);
        return citation;
    }

    @Override
    public Citation findByDoi(String doi) {
        return citationDatabase.get(doi);
    }

    @Override
    public List<Citation> findByAuthor(String author) {
        return citationDatabase.values().stream()
                .filter(citation -> citation.getAuthors().contains(author))
                .toList();
    }

    @Override
    public List<Citation> findByJournal(String journal) {
        return citationDatabase.values().stream()
                .filter(citation -> citation.getJournal().equals(journal))
                .toList();
    }

    @Override
    public void deleteCitation(String doi) {
        citationDatabase.remove(doi);
    }

    @Override
    public List<Citation> getAllCitations() {
        return new ArrayList<>(citationDatabase.values());
    }
}
