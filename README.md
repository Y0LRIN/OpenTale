# OpenTale

A Java-based monorepo for visual novel development tools.

## Project Structure

- **quilia-engine/**: JavaFX-based visual novel engine library
- **opentale-studio/**: GUI application for designing visual novels using QuiliaEngine

## Building

From the root directory:
```bash
mvn clean install
```

## Running OpenTale Studio

Navigate to the opentale-studio module and run:
```bash
cd opentale-studio
mvn javafx:run
```

## Requirements

- Java 17+
- Maven 3.6+
