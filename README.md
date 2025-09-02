# Alien Armada

A simple JavaFX graphics project that displays three alien squadrons with commander and troop ships.

## Author
**Ashutosh Vyas**

## Academic Information
- **Course**: 2nd Semester Programming Assignment
- **Grade Achieved**: 8.5/10
- **Assignment**: Graphics Programming with JavaFX

## Overview
This project creates a visual display of three alien squadrons positioned on a black space background. Each squadron has a commander ship and three troop ships with randomly assigned crew members.

## Features
- Three colored squadrons: Bismark (Red), American Queen (Green), Arthur Foss (Blue)
- Commander ships with gold star insignia
- Randomly assigned troops (2-11 per troop ship)
- Ship components: windows and landing gear
- Squadron information display (name and total troops)

## Project Structure
```
assignment3_000944693/
├── FXGraphicsTemplate.java    # Main application class
├── Squadron.java              # Squadron management
├── Ship.java                  # Individual ships
├── LandingGear.java          # Landing gear component
└── Window.java               # Ship windows
```

## Prerequisites
- Java 8 or higher
- JavaFX SDK

## How to Run
```bash
javac assignment3_000944693/*.java
java assignment3_000944693.FXGraphicsTemplate
```

For Java 11+, you'll need to add JavaFX module path parameters.

## Class Overview

### Squadron
Manages one commander ship and three troop ships. Displays squadron name and total troop count.

### Ship
Represents individual spacecraft. Commander ships are larger with gold stars. Troop ships have random crew sizes.

### LandingGear & Window
Visual components that make up each ship's appearance.

## Technical Details
- Canvas Size: 800 x 600 pixels
- Uses JavaFX GraphicsContext for rendering
- Object-oriented design with component composition

---
*2nd Semester Programming Assignment - Grade: 8.5/10*