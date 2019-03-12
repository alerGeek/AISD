package pl.pollub

import spock.lang.Specification

class SearchAlgorithmsTest extends Specification {

    def tab
    def searched

    def setup() {
        tab = MyArray1D.generateRandomArray(10, 1, 10)
        searched = 5
        println "G:\t" + tab
    }

    def cleanup() {
        println "S:\t" + tab
        println "Index: " + SearchAlgorithms.index
        println "Value: " + SearchAlgorithms.value
        SearchAlgorithms.index = -1
        SearchAlgorithms.value = -1
    }

    def "BinarySearch test"() {
        SortAlgorithms.injectionSort(tab, true)

        when:
        SearchAlgorithms.bisection(tab, searched)

        then:
        Arrays.asList(tab).indexOf(searched) == SearchAlgorithms.index
    }

    def "LinearSearch test"() {

        when:
        SearchAlgorithms.linear(tab, searched)

        then:
        Arrays.asList(tab).indexOf(searched) == SearchAlgorithms.index
    }
}
