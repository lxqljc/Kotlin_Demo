fun main(args: Array<String>) {

    //默认不可空变量
    //var name : String = null
    //可空变量
    var name: String? = null
    println(name?.length)
    //可空变量返回默认值
    println(name ?: "哈哈")

    //非空断言
//    name = "11"
//    println(name!!.length)

    var result = doubleValue(5)
    println(result)
    argValue()
    println(argValue1())
    println(argValue2("哈哈哈"))

    println(add(1,2))

}

//函数
fun doubleValue(x: Int): Int {
    return 2 * x
}

//无参无返回值
fun argValue() {
    println("无参无返回值函数")
}

//无参有返回值
fun argValue1(): String {
    return "无参有返回值类型"
}

//有参无返回值
fun argValue(content: String) {
    println("有参无返回值--》$content")
}

//有参有返回值
fun argValue2(content: String): String {
    return "有参有返回值--》$content"
}

//单表达式函数
fun add(a: Int, b: Int) = a + b
