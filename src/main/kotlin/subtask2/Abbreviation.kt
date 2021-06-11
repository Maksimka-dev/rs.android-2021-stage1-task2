package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        //throw NotImplementedError("Not implemented")
        var i = 0
        var j = 0
        var returnString: String

        while (a.length > i)
        {
            if (a[i].toLowerCase() == b[j].toLowerCase())
            {
                j++
                if (b.length == j)
                {
                    break
                }
            }
            i++
        }
        if (b.length == j)
        {
            returnString = "YES"
        }
        else
        {
            returnString = "NO"
        }

        return returnString
    }
}
