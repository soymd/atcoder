import java.io.*


class StandardOutputStream : PrintStream(ByteArrayOutputStream()) {
    private var br = BufferedReader(StringReader(""))

    /**
     * 1行分の文字列を読み込む
     * @return 改行を含まない文字。終端の場合はnull
     */
    fun readLine(): String {
        var line = ""
        return try {
            if (br.readLine().also { line = it } != null) return line
            br = BufferedReader(StringReader(out.toString()))
            (out as ByteArrayOutputStream).reset()
            br.readLine()
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }
}