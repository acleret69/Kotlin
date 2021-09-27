fun main() {
    
    val stringList = listOf("a" , "b", "c")
    
    print(joinOptions(stringList))
    
}

fun joinToString(
separator: String=", ",
prefix: String="",
postfix: String="") : String {
    
   return ""
    
}

fun joinOptions(options: Collection<String>)=options.joinToString(",","[","]")