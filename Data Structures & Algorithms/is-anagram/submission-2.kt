class Solution {
    fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) {
        return false
    }
    val sChars = s.toCollection(mutableListOf())
val tChars = t.toCollection(mutableListOf())

val hashMapS = HashMap<Char, Int>()
val hashMapT = HashMap<Char, Int>()
for(c in sChars) {
    hashMapS[c] = hashMapS.getOrDefault(c, 0) + 1
}

for(c in tChars) {
    hashMapT[c] = hashMapT.getOrDefault(c, 0) + 1
}

return hashMapS == hashMapT

    }
}
