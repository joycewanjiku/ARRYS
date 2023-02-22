fun main(){
members("joy","Kavanyan","Faith","Mumbi")
    cities()
    numbers()
    println(arrayOf("Juliet","Joy","Susan").contentToString())
}
fun members( name1:String,name2: String ,name3: String,name4: String){
    var names = arrayOf(name1,name2,name3,name4)
    println(names.contentToString())

}
fun cities(){
    var cities = arrayOf("Harare","Mumbai","Dodoma","Jakarta")
    for(array in cities)
        println(array)
}
fun numbers(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,31,3,73, 11,158,62)
    println(numbers[2].plus(numbers[5]))
    println(numbers.indexOf(158))
    println(numbers.sort())
    println(numbers.contentToString())

}
fun arrayOf( name3:String):String{
    return name3

}
