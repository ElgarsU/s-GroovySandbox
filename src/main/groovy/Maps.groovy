class Maps {
    static void main(String[] args) {

        def personMap = [
                'name'   : 'John',
                'age'    : 30,
                'address': 'Home street 1',
                'list'   : [1, 2, 4]
        ]

        println("Name " + personMap['name'])
        println("Age " + personMap.get('age'))
        println("List item " + personMap['list'][1])

        personMap.put('city', 'Riga')

        println("Has city " + personMap.containsKey('city'))

        println("Size " + personMap.size())


    }
}
