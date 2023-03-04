class Methods {
    static void main(String[] args) {

        sayHello()

        println("getSum function -> " + getSum(5, 1))

        def myName = "main"
        passByValue(myName)
        println("In main: " + myName)

        def listToDouble = [1, 2, 3, 4]
        println(listToDouble)
        listToDouble = doubleList(listToDouble)
        println(listToDouble)

        def numbers = sumAll(1, 2, 3, 4)
        println("Sum: " + numbers)

        println("Factorial of 4 = " + factorial(4))
    }

    static def sayHello() {
        println("Hello")
    }

    static def getSum(num1 = 0, num2 = 0) {
        return num1 + num2
    }

    static def passByValue(name) {
        name = "function"
        println("In function: " + name)
    }

    static def doubleList(list) {
        def newList = list.collect {
            it * 2
        }
        return newList
    }

    static def sumAll(int ... num) {
        def sum = 0
        num.each { sum += it }
        return sum
    }

    static def factorial(num) {
        if (num <= 1) {
            return 1
        } else {
            return (num * factorial(num - 1))
        }
    }
}
