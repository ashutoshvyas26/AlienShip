# Alien Armada

A JavaFX graphics application that displays an alien fleet with multiple squadrons, each featuring detailed spacecraft with landing gear components.

## Author
**Ashutosh Vyas**

## Overview
This project creates a visual representation of three alien squadrons positioned across a black space background. Each squadron is uniquely colored and named, creating an impressive armada display using JavaFX graphics capabilities.

## Features
- **Three Squadron Display**: Three distinct squadrons with unique names and colors
  - Bismark (Red)
  - American Queen (Green) 
  - Arthur Foss (Blue)
- **Landing Gear Components**: Detailed landing gear visualization for each spacecraft
- **Canvas-based Rendering**: Smooth graphics rendering on an 800x600 pixel canvas
- **Space Theme**: Black background simulating outer space

## Technical Specifications
- **Canvas Size**: 800 x 600 pixels
- **Framework**: JavaFX
- **Graphics**: Canvas and GraphicsContext for 2D rendering
- **Architecture**: Object-oriented design with separate classes for components

## Project Structure
```
assignment3_000944693/
├── FXGraphicsTemplate.java    # Main application class
├── Squadron.java              # Squadron class (referenced but not provided)
└── LandingGear.java          # Landing gear component class
```

## Prerequisites
- Java 8 or higher
- JavaFX SDK (included in Java 8, separate download for Java 11+)
- IDE with JavaFX support (IntelliJ IDEA, Eclipse, NetBeans)

## Installation & Setup

### For Java 8:
```bash
javac assignment3_000944693/*.java
java assignment3_000944693.FXGraphicsTemplate
```

### For Java 11+:
1. Download JavaFX SDK from [OpenJFX](https://openjfx.io/)
2. Extract to your desired location
3. Compile with module path:
```bash
javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml assignment3_000944693/*.java
```
4. Run with module path:
```bash
java --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml assignment3_000944693.FXGraphicsTemplate
```

## Usage
1. Run the `FXGraphicsTemplate` class
2. A window titled "Alien Armada" will open displaying the three squadrons
3. The application will show a static display of the alien fleet

## Class Documentation

### FXGraphicsTemplate
- **Purpose**: Main application class extending JavaFX Application
- **Key Methods**: 
  - `start(Stage stage)`: Initializes the JavaFX scene and draws the armada
  - `main(String[] args)`: Entry point that launches the JavaFX application

### LandingGear
- **Purpose**: Represents the landing gear component of spacecraft
- **Constructor**: `LandingGear(double gSize, double x, double y)`
  - `gSize`: Size of the landing gear
  - `x, y`: Coordinates for positioning
- **Key Methods**:
  - `draw(GraphicsContext gc)`: Renders the landing gear with legs and wheels

### Squadron (Referenced)
- **Purpose**: Represents a squadron of spacecraft (class not provided in code)
- **Expected Constructor**: `Squadron(int x, int y, String name, Color color)`
- **Expected Methods**: `draw(GraphicsContext gc)`: Renders the squadron

## Color Scheme
- **Background**: Black (space)
- **Squadron Colors**:
  - Bismark: Red
  - American Queen: Green
  - Arthur Foss: Blue
- **Landing Gear**: Dark Gray

## Development Notes
- The project uses a template-based approach for JavaFX graphics
- Landing gear features realistic legs and wheel components
- Positioning uses absolute coordinates for squadron placement
- Graphics context handles all rendering operations

## Future Enhancements
- **Animation System**: Add movement patterns for squadrons (patrol routes, formation flying)
- **Interactive Features**: 
  - Click on ships to view detailed troop information
  - Drag and drop squadron repositioning
- **Enhanced Visuals**:
  - Add starfield or nebula background
  - Implement ship engine glow effects
  - Add pulsing window lights
- **Game Mechanics**:
  - Battle system between squadrons
  - Resource management and ship upgrades
- **Sound Integration**: Add space ambient sounds and engine effects
- **Additional Ship Types**: Introduce different classes (fighters, bombers, cruisers)
- **Formation Patterns**: Implement various military formations (V-formation, diamond, etc.)
- **Troop Management**: Allow redistribution of troops between ships

## License
This is an academic assignment project. Please check with your institution's policies regarding code sharing and usage.

## Contributing
This appears to be a course assignment. If you're working on similar projects:
1. Follow the existing code structure
2. Maintain the object-oriented design pattern
3. Add appropriate JavaDoc comments
4. Test graphics rendering across different screen sizes

---
*Generated for Assignment 3, Student ID: 000944693*git add README.md