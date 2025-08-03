package com.citationmanager;

import com.citationmanager.model.Citation;
import com.citationmanager.service.CitationService;
import com.citationmanager.service.CitationServiceImpl;
import com.citationmanager.orchestration.ResearchOrchestrator;
import com.citationmanager.orchestration.ResearchOrchestratorImpl;

import java.util.Arrays;

public class CitationManagerApplication {
    public static void main(String[] args) {
        // Initialize services
        CitationService citationService = new CitationServiceImpl();
        ResearchOrchestrator orchestrator = new ResearchOrchestratorImpl(citationService);

        // Create a sample citation
        Citation citation = new Citation(
            "10.1234/example-doi",
            "Understanding Citation Networks in Scientific Research",
            Arrays.asList("John Smith", "Jane Doe"),
            "Journal of Scientific Research",
            2024
        );

        // Save the citation
        citationService.saveCitation(citation);

        // Demonstrate some functionality
        System.out.println("Finding citation by DOI: " + citationService.findByDoi("10.1234/example-doi").getTitle());

        // Use the orchestrator
        orchestrator.findRelatedPapers(citation);
        orchestrator.generateBibliography(citationService.getAllCitations(), "APA");
    }
}
