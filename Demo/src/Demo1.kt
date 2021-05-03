fun main(args: Array<String>) {

    println("Hello,World")

    println(
        "hello" +
                "world2"
    )

    //标准声明
    var c: Int = 1
    //省略声明
    var c2 = 2

    //可变变量a
    var a: Int
    //不可变变量b
    val b: Int

    //可以多次个a赋值
    a = 1
    a = 2
    a = 3

    //第一次给b赋值
    b = 1
    // b = 2 报错了

    //boolean 类型
    var d: Boolean = true

    //字符类型
    var e: Char = 'a'

    //字符串
    var f: String = "Hello World"

    //第一种方式声明数组 数据类型 + ArrayOf()方式初始化
    var int_array: IntArray = intArrayOf(1, 2, 3)
    var boolean_array: BooleanArray = booleanArrayOf(true, false, true)
    var char_array: CharArray = charArrayOf('a', 'b', 'c')

    //第二种方式
    var array1: Array<Int> = arrayOf(1, 2, 3)
    var arrray2: Array<Boolean> = arrayOf(true, false, true)
    var array3: Array<String> = arrayOf("哈哈哈", "哈哈哈1")

    //省略方式
    var array4 = arrayOf("1111")

    //先运算，再自增
    var aa = 1
    var bb = 2
    var cc = aa + bb++
    println("bb====>" + bb)
    println("cc====>" + cc)

    //比较运算符
    var result = aa.compareTo(bb) < 0
    println("result-->" + result)

    //字符串
    var str = "Hello World"
    //获取字符串长度
    println("str的长度->" + str.length)
    //通过索引访问某个字符，角标从0开始
    println(str[4])
    //通过for循环迭代字符
    for (c in str) {
        print(c + "  ")
    }

    println()
    //字符串查找
    //获取第一个元素
    println("获取第一个元素->" + str.first())
    //获取最后一个元素
    println("获取最后一个元素->" + str.last())

    //字符串截取
    println(str.substring(1))
    println(str.substring(3, 11))

    //字符串替换
    str = "Hello World  World  World"
    println(str.replace("World", "Kotlin"))
    println(str.replaceFirst("World", "Kotlin"))
    println(str.replaceBefore("World", "Kotlin "))

    //字符串分隔
    str = "hello.kotlin"
    var splitResult = str.split(".");
    println(splitResult)
    //传入多个分隔符
    str = "hello.kotlin/world"
    var splitResult2 = str.split(".", "/")
    println(splitResult2)

    //字符串去空格
    str = "          Hello World      "
    println(str.trim())
    println(str.trimEnd())

    //字符串字面值
    var str2 = "hello \n world"
    println(str2)

    //打印原生字符
    str2 = """hello \n world"""
    println(str2)

    //模板表达式
    var aaa = 1
    println("aaa is $aaa")
    //模板表达式调用方法
    println("${hello()}")
    //模板表达式输出$符号
    var str3 = "${'$'}8.88"
    println(str3)

    //when条件语句
    var week = 3
    when(week){
        1 -> println("星期一")
        2 -> println("星期二")
        3 -> println("星期三")
        4 -> println("星期四")
        5 -> println("星期五")
        else -> {
            println("数字不正确")
        }
    }

    //while语句
    var a1 = 5
    while (a1 > 0){
        print("$a1  ")
        a1--
    }

    println()
    //for循环语句
    for(i in 1..3){
        print("$i ")
    }

    println()

    //foreach语句
    var array = arrayOf("a","b","c","d","e")
    array.forEach {
        it->
        print("$it ")
    }

    array.forEachIndexed {
        index, s ->
        println("角标$index 的元素是$s")
    }

    //跳出外层循环
    for (i in 1..9){
        loop@ for(j in 1..9){
            if(j == 4){
                break@loop
            }
            print("$i $j # ")
        }
    }
    println()

    //区间
    for(i in 1.rangeTo(5)){
        print("$i ")
    }
    println()
    for(i in 1.until(5)){
        print("$i ")
    }
    println()
    //逆向区间
    for(i in 5.downTo(1)){
        print("$i ")
    }

    println()
    //步长
    for(i in 1..9 step 2){
        print("$i   ")
    }

    println()
    //遍历数组及角标
    var intArray = intArrayOf(1,2,3)
    //修改指定角标对应的值
    intArray.set(0,100)
    for ((index,i) in intArray.withIndex()) {
        print("角标$index 元素为$i ")
    }
    println()

    //查询角标
    println(intArray.indexOfLast { it == 3 })

}

fun hello(): String {
    return "Hello World 111"
}