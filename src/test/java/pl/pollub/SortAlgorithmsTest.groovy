package pl.pollub

import spock.lang.Specification

class SortAlgorithmsTest extends Specification {

    def tab
    def copyTab

    def setup() {
        tab = MyArray1D.generateRandomArray(10, 1, 100)
        println "G:\t" + tab
        copyTab = tab
    }

    def cleanup() {
        println "S:\t" + tab
    }

    def "SelectSort should sort ascending"() {
        given:
        copyTab = Arrays.asList(copyTab)
                .sort()

        when:
        SortAlgorithms.selectSort(tab, true)
        tab = Arrays.asList(tab)

        then:
        copyTab.equals(tab)
    }

    def "BubbleSort should sort ascending"() {
        given:
        copyTab = Arrays.asList(copyTab)
                .sort()

        when:
        SortAlgorithms.bubbleSort(tab, true)
        tab = Arrays.asList(tab)

        then:
        copyTab.equals(tab)
    }

    def "InjectionSort should sort ascending"() {
        given:
        copyTab = Arrays.asList(copyTab)
                .sort()

        when:
        SortAlgorithms.injectionSort(tab, true)
        tab = Arrays.asList(tab)

        then:
        copyTab.equals(tab)
    }

    def "BubbleSort should sort descending"() {
        given:
        copyTab = Arrays.asList(copyTab)
                .sort()
                .reverse()

        when:
        SortAlgorithms.bubbleSort(tab, false)
        tab = Arrays.asList(tab)

        then:
        copyTab.equals(tab)
    }

    def "InjectionSort should sort descending"() {
        given:
        copyTab = Arrays.asList(copyTab)
                .sort()
                .reverse()

        when:
        SortAlgorithms.injectionSort(tab, false)
        tab = Arrays.asList(tab)

        then:
        copyTab.equals(tab)
    }

    def "SelectSort should sort descending"() {
        given:
        copyTab = Arrays.asList(copyTab)
                .sort()
                .reverse()

        when:
        SortAlgorithms.selectSort(tab, false)
        tab = Arrays.asList(tab)

        then:
        copyTab.equals(tab)
    }
}
