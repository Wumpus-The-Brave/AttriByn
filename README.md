# Citation Manager and Orchestration Engine

A Java application for managing scientific citations and orchestrating research workflows.

## Overview

This project provides a framework for researchers to manage their citations, generate bibliographies, analyze citation networks, and find related papers.

## Features

- Citation management (add, remove, update, search)
- Bibliography generation in various formats
- Citation network analysis
- Related papers discovery
- Import and export citations in different formats

## Getting Started

### Prerequisites

- Java SDK 24
- Maven

### Building the Project

```bash
mvn clean install
```

### Running the Application

```bash
mvn exec:java -Dexec.mainClass="com.citationmanager.CitationManagerApplication"
```

## Project Structure

- `model`: Data models for citations
- `service`: Services for managing citations
- `orchestration`: Higher-level operations and workflows

## Usage Examples

Check the `CitationManagerApplication` class for basic usage examples.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
