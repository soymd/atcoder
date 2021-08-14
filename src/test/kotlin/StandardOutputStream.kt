import java.io.*


class StandardOutputStream : PrintStream(ByteArrayOutputStream()) {
    private var br = BufferedReader(StringReader(""))

    fun readLine(): String {
        return try {
            br = BufferedReader(StringReader(out.toString()))
            (out as ByteArrayOutputStream).reset()
            br.readLine()
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    fun readLines(): List<String> {
        val lines = mutableListOf<String>()
        br = BufferedReader(StringReader(out.toString()))
        (out as ByteArrayOutputStream).reset()
        do {
            val result = br.readLine()
            if (result != null) {
                lines.add(result)
            }
        } while (result != null)
        return lines
    }
}