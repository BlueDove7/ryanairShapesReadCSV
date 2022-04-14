## Android Challenge

___

### Description of the task

In a task, you must process a file containing various geometries, and then use this data to solve the tasks.

### File structure

You are given a CSV file with 100.000 different geometric objects placed in the coordinate system of which
the allowed area is (0, 10.000). A single line describes one geometry and has the format:

#### Number, Type, and Geometry Representation

Each geometry has a unique representation:

1. **Circle** - type C - point describing the center, radius
2. **Rectangle** - type R - 2 points describing opposite vertices
3. **Polyline** - type L - list of points that make up the polyline, no limit on the number of points

The point is represented as an x-y pair

**Attention!**  
There may be geometries of the wrong format, e.g. geometry outside the allowed area, wrong representation, etc.
omit these elements in the calculations.

___

### Task 1

Indicate the numbers of all elements whose geometry could not be read correctly.

### Exercise 2

Prepare tasks from this group in the most efficient version.

    a. Pick the total length of all geometric objects
    
    b. Calculate the area of all the circles and rectangles

    c. Count geometries for each type

### Exercise 3

In this exercise focus on making code easy to read. If possible, do not use side effects and state modification. It can be useful to use Java streams or Kotlin sequences.

    a. Calculate the average length of the polygons

    b. Calculate how many polygons intersect with itself

    c. Select the minimum bounding rectangle that will contain all the geometries described in the example

---

### Results

Save the results of each task in a separate file and add them to the repository.

### Guidelines

* Use Java or Kotlin languages.
* In the implementation, use only the standard libraries provided with the selected programming language.
* Make the code readable in all tasks.
* Fork this repository. After completing the task, create a Pull Request to the parent `main` branch
  repository.

### Questions for you

Please submit the answers to the following questions in the README.md file
* How long did you spend on the task?
* Rate from 0-10, how would you assess the complexity of the task? _0 - very trivial_, _10 - extremely complex_

> If you have the need to comment the provided task, we would love to hear that from you 🙂  
> ...  
> ...

### Deadline timeframe 
* You have **4 days** to complete the test, although it would be great if you could complete the test sooner. Remember that we do not expect a perfect solution from you.

If you have any questions, please send us a message at _AndroidDevelopers@ryanair.com_ our Android Developers will be happy to help or explain😊


<img src="https://4.bp.blogspot.com/-NnAkV5vpYuw/XNMYF4RtLvI/AAAAAAAAI70/kdgLm3cnTO4FB4rUC0v9smscN3zHJPlLgCLcBGAs/s1600/Jetpack_logo%2B%25282%2529.png" height=150 width=150>

Good luck!

___

### COPYRIGHTS

Copyright licensed by &copy; Ryanair Labs