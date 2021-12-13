package lan_training

// Directly use name as private final variable
// half_age is age/2
class John(private val name: String, override val age: Int) : Person  {

    // one line comment
    /*
        Multiline comment
    */

    // mutable variable, type inferred
    var nickname = "Johnny"

    init {

    }

    fun printInfo(test: String) {
        // sout -> println(|)
        println("print something...")

        // soutp -> print parameter names and values
        println("test = [${test}]")

        // soutv -> print a selectable variable
        println("name = $name")
        println("nickname = $nickname")
        println("age = $age")
    }

    // Override printName from interface
    override fun printName() {
        println("name = $name")
    }

}

interface Person {

    // final variable
    val age: Int

    fun printName()

    fun printAge() {
        println("age = $age")
    }
}

