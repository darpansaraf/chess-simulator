# chess-simulator
A repository to simulate movement of chess pieces on a blank chess board


## Requirements

* JDK 11
* Gradle 5.6.2
* Git client (to build locally)

## Getting Started
To build the application and get started follow the below steps
 
 Step 1:
    clone the GitHub repository, use the below command and paste it in your terminal.
    
    git clone https://github.com/darpansaraf/chess-simulator.git
    
 Step 2:
    In terminal change the project's root directory

    cd chess-simulator
    
 Step 3: 
    Run build without test use the below command

    ./gradlew clean build -x test
    
    After running the above command if you face the following error 
      Error: Could not find or load main class org.gradle.wrapper.GradleWrapperMain
      Caused by: java.lang.ClassNotFoundException: org.gradle.wrapper.GradleWrapperMain
      
    Please try building the project by using the following command:
    
    %GRADLE_HOME%\gradle clean build -x test

 Steps 4:
    To run unit tests on local

    ./gradlew clean test 
    
    OR
    
    %GRADLE_HOME%\gradle clean test
    
## Test Cases
    This application uses an external library junit for Test cases 
    
## Implementation Approach
    This application assumes that it is traversing a 2D-Array data structure to calculate all possbile moves of a particular 
    chess-piece from a given position. It does not store the state of the chess-board in a 2D-Array.
    It increments & decrements the rows and columns values according the movement of a chess-piece to calulate all possible 
    positions where a chess-piece can move.
    
    
