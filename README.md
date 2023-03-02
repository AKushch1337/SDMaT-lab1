# Quadratic Equation Solver (QES)

> The Kotlin CLI app to solve quadratic equations
>
> View the code [_here_](https://github.com/AKushch1337/SDMaT-lab1/blob/main/QuadraticEquation.kt). 
-------------------------------
## Setup

- Download Kotlin compiler [_here_](https://github.com/JetBrains/kotlin/releases/download/v1.8.10/kotlin-compiler-1.8.10.zip)

- Extract the archive on your computer

- Add the Kotlin bin folder to your system's PATH environment variable. Open the command prompt (CMD) and run the following command:

```cmd
setx /M PATH "%PATH%;C:\path\to\kotlin\bin"
```
- Replace "C:\path\to\kotlin" with the path to the folder where you extracted the Kotlin compiler.

- Verify that the Kotlin compiler is installed correctly by running the following command in the command prompt:

```cmd
kotlinc -version
```

- Verify that you have Java Runtime Environment(JRE) on your computer

## Build the project

- Clone the project on your computer.

```cmd
git clone https://github.com/AKushch1337/SDMaT-lab1
```

- Move into the folder where you cloned the project 

- Open the command prompt (CMD) and run the following command:

```cmd
kotlinc *.kt -include-runtime -d quadratic-equation-solver-cli.jar
```

> **_NOTE:_**  You can replace ```quadratic-equation-solver-cli``` with whatever name you want

- This will generate .jar file which you can run using Java Runtime Environment(JRE)

> **_NOTE:_**  You can skip the "Build the project" part and just download the .jar file =)

## Download the .jar file

- Download [_here_](https://github.com/AKushch1337/SDMaT-lab1/releases/download/1.0.0/quadratic-equation-solver-cli.jar).

## Run the .jar file

### In interactive mode

```cmd 
java -jar \path\to\runtime\file\quadratic-equation-solver-cli.jar
```

### In non-interactive mode

```cmd 
java -jar \path\to\runtime\file\quadratic-equation-solver-cli.jar \path\to\file\with\inputs
```

## How should the .txt file look like

When the application is in non-interactive mode it expects a single argument that specifies the path to the file containing the coefficients of the equation. The file should have three numbers separated by a single space, representing the coefficients a, b, and c of the equation. Here's an example of how the numbers should be formatted in the file. [_look_here_](https://github.com/AKushch1337/SDMaT-lab1/tree/main/TestFiles)

## Link to revert commit

[link](https://github.com/AKushch1337/SDMaT-lab1/commit/02fca5a0b58b6f19afb5205c06c4a494c0012570)
