# Quadratic Equation Solver (QES)

> The Kotlin CLI app to solve quadratic equations
>
> View the code [_here_](). 
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
