class Loops {
    static void main(String[] args) {

        for (j in 2..6) {
            println(j)
        }

        def list = [1, 2, 4, 5]

        for (el in list) {
            println(el)
        }

        def map = [
                100: "A",
                200: "B",
                300: "C"
        ]

        for (el in map) {
            println("$el.value is a $el.key")
        }
    }
}
