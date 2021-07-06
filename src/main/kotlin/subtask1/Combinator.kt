package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        for(i in 0..array[1]){
            if(array[0]==checkCombinations(array[1],i)){
                return i
            }
        }
        return null
    }

    private fun checkCombinations(n:Int,k:Int): Int {
        val combinationResult = factorial(n)/(factorial(k)*factorial(n-k))
        return combinationResult.toInt()
    }

    private fun factorial(num: Int): Long {
        var result = 1L
        for (i in 2..num) result *= i
        return result
    }

}
