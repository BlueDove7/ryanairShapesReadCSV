package pl.karolcia.ryanair

data class Shape(
    var number: Int,
    var typeOfShape: String,
    var restParameters: String
) {
    var returning: Int = 0 //to having done
}