data class Message(val address: String?, val topic: String?, val name: String?, val surname : String?) {
    //fun toHTML(): String = "$address ${topic}"
}

fun main() {
    fun Message.toHTML(): String {
        val template = "<table> " +
                (address?.let { "\n\t<tr>\n\t\t<td>address</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: run{"\n\t<tr>\n\t\t<td> </td>\n\t</tr>"}) +
                (topic?.let { "\n\t<tr>\n\t\t<td>topic</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: run{"\n\t<tr>\n\t\t<td> </td>\n\t</tr>"}) +
                (name?.let { "\n\t<tr>\n\t\t<td>Name</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: run{"\n\t<tr>\n\t\t<td> </td>\n\t</tr>"}) +
                (surname?.let { "\n\t<tr>\n\t\t<td>Surname</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: run{"\n\t<tr>\n\t\t<td> </td>\n\t</tr>"}) +
                "\n</table>"
        return template
    }

    val m = Message("blabla@mail.ru", null, "Ivan", "Sergeevich")
    println(m.toHTML())
}
