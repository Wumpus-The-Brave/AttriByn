package com.citationmanager.orchestration;

import com.citationmanager.model.Citation;
import java.util.List;

public interface ResearchOrchestrator {
    void importCitations(String source);
    void exportCitations(String format, String destination);
    List<Citation> analyzeCitationNetwork(Citation citation);
    List<Citation> findRelatedPapers(Citation citation);
    void generateBibliography(List<Citation> citations, String format);
}
