class Closures {
    static void main(String[] args) {

        def greeting = "Hey"
        def sayGoodbye = { theName -> println("$greeting $theName") }
        sayGoodbye("Simba")

        def numList = [1, 2, 3, 4]
        numList.each { println(it) }

        def employees = [
                'Paul' : 34,
                'Sally': 35,
                'Sam'  : 36
        ]
        employees.each { println("$it.key : $it.value") }

        def randNums = [1, 2, 3, 4, 5, 6]
        randNums.each { num -> if (num % 2 == 0) println(num) }

        def nameList = ["Doug", "Sally", "Sue"]
        def matchElement = nameList.find { it -> it == "Sue" }
        println(matchElement)

        def randNumList = [1, 2, 3, 4, 5, 6]
        def numMatches = randNumList.findAll { item -> item > 4 }
        println(numMatches)

        println("> 5 : " + randNumList.any { it -> it > 5 })
        println("> 1 : " + randNumList.every { it -> it > 5 })
        println("Double every element : " + randNumList.collect { it -> it * 2 })

        def getEven = { num -> (num % 2 == 0) }
        def evenNums = listEdit(randNumList, getEven)
        println("Even numbers: " + evenNums)

    }

    static def listEdit(list, closure) {
        return list.findAll(closure)
    }

}
