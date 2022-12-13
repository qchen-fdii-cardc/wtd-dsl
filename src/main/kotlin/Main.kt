fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications:
    // https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // val sum2: Int.(Int) -> Int = {
    //     this + it
    // }

    user {
        name = "Tony"
        password = "123456789"
        address {
            province = "SiChuan"
            city = "Mianyang"
            street = "Erhuan Road"
        }
    }

    "Tony" set {
        password = "1234567890"
        address {
            province = "Si Chuan Province"
        }
    }

    println("Tony".asUser())
    println("Tony".asUser()?.address)


}
// data class representing domain objects
data class Address(
        var province: String? = null,
        var city: String? = null,
        var street: String? = null
) {
    override fun toString(): String = "Province: $province; City: $city; Street: $street"
}

data class User(
        var name: String? = null,
        var password: String? = null,
        var address: Address? = null
) {
    override fun toString(): String = "Name: $name; Password: $password; Address: $address"
}

// Wrapper class provide interface for DSL methods
class UserWrapper {
    private val address: Address = Address()
    var name: String? = null
    var password: String? = null

    fun address(init: Address.() -> Unit): Address {
        address.init()
        return address
    }

    fun user():User = User(name, password, address)

    internal fun getAddress() = address
}
val userList = mutableListOf<UserWrapper>()

fun String.asUserWrapper(): UserWrapper? {
    return userList.find {it.user().name == this}
}

// DSL actions for object creation
fun user(init: UserWrapper.() -> Unit): User {
    val wrapper = UserWrapper()
    wrapper.init()
    userList.add(wrapper)
    return wrapper.user()
}


fun String.asUser(): User? {
    return userList.find {it.name == this}?.user()
}

infix fun String.set(setup: UserWrapper.() -> Unit):Unit {
    this.asUserWrapper()?.setup()
}

