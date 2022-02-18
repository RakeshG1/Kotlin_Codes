import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.util.ArrayList

private val value = 0

fun main() {
	var fileReader: BufferedReader? = null;
	try {
        val path = System.getProperty("user.dir")
        println("Working Directory = $path")
		var line: String?
		fileReader = BufferedReader(FileReader("../Sample_Data/Data1.csv"))
		line = fileReader.readLine()
        println(line)
		while (line != null) {
            println(line)
            line = fileReader.readLine()
		}
	} catch (e: Exception) {
		println("Read CSV : Error !!")
		e.printStackTrace()
	} finally {
		try {
			fileReader!!.close()
		} catch (e: IOException) {
			println("Close fileReader : Error !!")
			e.printStackTrace()
		}
	}
}