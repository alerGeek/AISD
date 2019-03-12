package pl.pollub

import spock.lang.Specification

class SearchAlgorithmsTest extends Specification {

    def array
    def searched

    def setup() {
        array = MyArray1D.generateRandomArray(10, 1, 10)
        searched = 5
        println "G:\t" + array
    }

    def cleanup() {
        println "S:\t" + array
        println "Index: " + SearchAlgorithms.index
        println "Value: " + SearchAlgorithms.value
        SearchAlgorithms.index = -1
        SearchAlgorithms.value = -1
    }

    def "BinarySearch test"() {
        SortAlgorithms.insertSort(array, true)

        when:
        SearchAlgorithms.bisection(array, searched)

        then:
        Arrays.asList(array).indexOf(searched) == SearchAlgorithms.index
    }

    def "LinearSearch test"() {

        when:
        SearchAlgorithms.linear(array, searched)

        then:
        Arrays.asList(array).indexOf(searched) == SearchAlgorithms.index
    }
}
