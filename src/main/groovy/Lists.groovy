class Lists {
    static void main(String[] args) {

        def primes = [2, 3, 4, 6, 11, 13]

        println("2nd Prime " + primes[2])
        println("2nd Prime " + primes.get(2))

        def employee = ['Elgars', 50, 6.32, [1, 2, 4]]

        println("2nd Number in sublist" + employee[3][1])

        println("Length " + primes.size())

        println(primes)

        primes.add(17)

        println(primes)

        primes << 19

        println(primes)

        primes.add(23)

        println(primes)

        primes + [29, 31]

        println(primes)

        primes - [31]

        println(primes)

        println("Is empty" + primes.isEmpty())

        println("1st 3 " + primes[0..2])

        println("Matches " + primes.intersect([2, 3, 7]))

        println("Reverse " + primes.reverse());

        println("Reverse " + primes.sort())

        println("First " + primes.pop())

        println("Last " + primes.removeLast())
    }
}
