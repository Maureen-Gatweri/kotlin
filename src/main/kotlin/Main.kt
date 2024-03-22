fun main() {

    mySchoolName("akirachix")
    println(myAge("Maureen",30))
    println( stringLength("Maureen Mwendwa"))

communicate("Maureeen")
    communicate("Gatweri")
  println(isEven(30))
    println(removal("initiative"))
    friends("mwendwa","Joy","Murkomen","jemutai")



}
fun mySchoolName(name:String){

    println(name[0]+ ""+name[2]+ ""+name[3])
}
fun myAge(name:String, age:Int):String{
    return("Hi, my name is $name and I am $age years old")

}
fun stringLength(sentence:String):Int{

    return(sentence.length)
}
fun communicate(name1: String){
    if (name1=="Gatweri")
        println("Thats me")
    else
        (println("I do not know who that is "))
}
fun isEven(num:Int):Boolean {
    if (num % 2 == 0)
        return true

            else
            return false
        }
fun removal(word:String):String{
    return(word.slice(1..4))
}
fun friends(n1:String, n2:String,n3:String,n4:String){
    println(arrayOf(n1,n2,n3,n4).contentToString())
}

