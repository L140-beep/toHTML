data class Message(val address: String?, val topic: String?, val name: String?, val surname : String?) {
    //fun toHTML(): String = "$address ${topic}"
}

fun main() {
    fun Message.toHTML(): String {
        val style = "<head>\n" +
                "\t<style>\n" +
                "\t\tbody { \n" +
                "\t\t\tbackground: rgb(14, 88, 12);\n" +
                "\t\t\tfont-family: 'Times New Roman' ;\n" +
                "\t\t}\n" +
                "\t</style>\n" +
                "</head>\n" +
                "\n<body>\n"
        var template = style + "<table> " +
                (address?.let { "\n\t<tr>\n\t\t<td>address</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: "\n\t<tr>\n\t\t<td> </td>\n\t</tr>") +
                (topic?.let { "\n\t<tr>\n\t\t<td>topic</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: "\n\t<tr>\n\t\t<td> </td>\n\t</tr>") +
                (name?.let { "\n\t<tr>\n\t\t<td>Name</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: "\n\t<tr>\n\t\t<td> </td>\n\t</tr>") +
                (surname?.let { "\n\t<tr>\n\t\t<td>Surname</td>\n\t\t<td>$it</td>\n\t</tr>" }
                    ?: "\n\t<tr>\n\t\t<td> </td>\n\t</tr>") +
                "\n</table>" + "\n</body>"
        return template
    }

    val m = Message("blabla@mail.ru", null, null, null)
    println(m.toHTML())
}
