package contacts


class contactList {
    var firstName: String = ""
    var lastName: String = ""
    var phoneNumber: MutableList<Char> = mutableListOf<Char>()
}


fun main() {
    val firstRecord = contactList()
    println("Enter the name of the person: ")
    firstRecord.firstName = readln()
    println("Enter the surname of the person: ")
    firstRecord.lastName = readln()
    println("Enter the number: ")
    firstRecord.phoneNumber = readln().toMutableList()
}