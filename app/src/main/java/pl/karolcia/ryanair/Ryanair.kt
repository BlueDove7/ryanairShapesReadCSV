package pl.karolcia.ryanair
import java.io.File

fun main() {

    var arrayOfCRL = arrayOf(0, 0, 0)

    try {
        val myFile =
            "K:\\Kotlin_basics2\\app\\src\\main\\java\\pl\\karolcia\\kotlin_basics\\android2022.csv"
        val lines: List<String> = File(myFile).readLines()
        //lines.forEach{line-> println(line)}

        //Make list of shapes
        val listOfShapes = mutableListOf<Shape>()

        for (i in 0..37000) {                                               //in future change for line in lines

            //Checking if line has correct formula
            //(...)


            //Putting every line into list of shapes
            listOfShapes.add(
                Shape(
                    lines[i].split(",")[0].toInt(),
                    lines[i].split(",")[1],
                    lines[i].split(",")[2]
                )
            )

            //Counting every letter C, R or L on place listOfShape.typeOfShape
            arrayOfCRL = countElementsOfType(listOfShapes[i], arrayOfCRL)
        }

        println("circles, rectangles and lines were counted")
        print("C: "); println(arrayOfCRL[0])
        print("R: "); println(arrayOfCRL[1])
        print("L: "); println(arrayOfCRL[2])

    } catch (e: Exception) {
        //I diagnose an exception and know where something happened
        e.printStackTrace()
    } finally {
        println("END")
    }

}//main

fun countElementsOfType(
    element: Shape,
    arrayCircleRectangleLine: Array<Int>
): Array<Int> {                                      //czemu nie moge tutaj dac? :Triple<Int,Int,Int> Sprawdzic sobie
    var numberOfCircle: Int = arrayCircleRectangleLine[0];
    var numberOfRectangle: Int = arrayCircleRectangleLine[1];
    var numberOfLine: Int = arrayCircleRectangleLine[2]

    when (element.typeOfShape) {
        "C" -> numberOfCircle += 1
        "R" -> numberOfRectangle += 1
        "L" -> numberOfLine += 1
        else -> {
            print("I DON'T KNOW THAT SHAPE")
        }
    }
    return arrayOf(numberOfCircle, numberOfRectangle, numberOfLine)
}

