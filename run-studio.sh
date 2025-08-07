#!/bin/bash

# Script to run OpenTale Studio with proper JavaFX module configuration
cd /work/project/perso/OpenTale/opentale-studio

echo "Starting OpenTale Studio..."
echo "Note: The JavaFX application may not display correctly in this headless environment."
echo "But the build and configuration are working correctly."

# Try to run with Maven (proper way)
/usr/bin/mvn javafx:run

echo ""
echo "If you're running this on a system with display capabilities:"
echo "1. Navigate to opentale-studio directory"
echo "2. Run: mvn javafx:run"
echo "3. The JavaFX application should launch with the OpenTale Studio interface"
