class Range {
    static void main(String[] args) {

        def oneToTen = 1..10
        def aToZ = 'a'..'z'
        def zToA = 'z'..'a'

        println(oneToTen)
        println(aToZ)

        println(oneToTen.get(2))
        println(oneToTen.contains(11))

        println("Get last " + oneToTen.getTo())
        println("Get first " + oneToTen.getFrom())
    }
}
