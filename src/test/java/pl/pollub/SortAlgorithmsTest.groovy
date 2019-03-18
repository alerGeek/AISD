package pl.pollub

import spock.lang.Specification

class SortAlgorithmsTest extends Specification {

    def array
    def copy

    def setup() {
        array = MyArray1D.generateRandomArray(10, 1, 100)
        println "G:\t" + array
        copy = array
    }

    def cleanup() {
        println "S:\t" + array
    }

    def "SelectSort should sort ascending"() {
        given:
        copy = Arrays.asList(copy)
                .sort()

        when:
        SortAlgorithms.selectSort(array, true)
        array = Arrays.asList(array)

        then:
        copy.equals(array)
    }

    def "BubbleSort should sort ascending"() {
        given:
        copy = Arrays.asList(copy)
                .sort()

        when:
        SortAlgorithms.bubbleSort(array, true)
        array = Arrays.asList(array)

        then:
        copy.equals(array)
    }

    def "InsertSort should sort ascending"() {
        given:
        copy = Arrays.asList(copy)
                .sort()

        when:
        SortAlgorithms.insertSort(array, true)
        array = Arrays.asList(array)

        then:
        copy.equals(array)
    }

    def "BubbleSort should sort descending"() {
        given:
        copy = Arrays.asList(copy)
                .sort()
                .reverse()

        when:
        SortAlgorithms.bubbleSort(array, false)
        array = Arrays.asList(array)

        then:
        copy.equals(array)
    }

    def "InjectionSort should sort descending"() {
        given:
        copy = Arrays.asList(copy)
                .sort()
                .reverse()

        when:
        SortAlgorithms.insertSort(array, false)
        array = Arrays.asList(array)

        then:
        copy.equals(array)
    }

    def "SelectSort should sort descending"() {
        given:
        copy = Arrays.asList(copy)
                .sort()
                .reverse()

        when:
        SortAlgorithms.selectSort(array, false)
        array = Arrays.asList(array)

        then:
        copy.equals(array)
    }

    def "Quicksort should sort"() {
        given:
        copy = Arrays.asList(copy)
                .sort()

        when:
        SortAlgorithms.quickSort(array,0,9)
        array = Arrays.asList(array)

        then:
        copy.equals(array)
    }

}
