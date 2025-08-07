package org.quilia.engine;

public class EngineMain {    
    /**
     * Main method for testing the engine.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Quilia Engine v1.0.0");
        System.out.println("Visual Novel Engine Library");
        System.out.println("Ready for integration!");
    }
    
    /**
     * Initialize the engine with default configuration.
     */
    public void initialize() {
        System.out.println("Initializing Quilia Engine...");
    }
    
    /**
     * Get the engine version.
     * @return version string
     */
    public String getVersion() {
        return "1.0.0-SNAPSHOT";
    }
}
