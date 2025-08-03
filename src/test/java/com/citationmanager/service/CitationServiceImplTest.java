package com.citationmanager.service;

import com.citationmanager.model.Citation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CitationServiceImplTest {
    private CitationService citationService;

    @BeforeEach
    void setUp() {
        citationService = new CitationServiceImpl();
    }

    @Test
    void testSaveCitation() {
        Citation citation = new Citation(
            "10.1234/test",
            "Test Title",
            Arrays.asList("Author One", "Author Two"),
            "Test Journal",
            2024
        );

        Citation saved = citationService.saveCitation(citation);
        assertEquals(citation.getDoi(), saved.getDoi());
        assertEquals(citation.getTitle(), saved.getTitle());
    }

    @Test
    void testFindByDoi() {
        Citation citation = new Citation(
            "10.1234/test",
            "Test Title",
            Arrays.asList("Author One", "Author Two"),
            "Test Journal",
            2024
        );
        citationService.saveCitation(citation);

        Citation found = citationService.findByDoi("10.1234/test");
        assertNotNull(found);
        assertEquals("Test Title", found.getTitle());
    }
}
