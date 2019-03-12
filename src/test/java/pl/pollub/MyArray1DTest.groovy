package pl.pollub

import spock.lang.Specification

/**
 * Description:
 */
class MyArray1DTest extends Specification {

    def "GenerateRandomArray should create int array with range"() {

        given:
        def length = 10
        def minRange = 1
        def maxRange = 100
        def tab = MyArray1D.generateRandomArray(length,minRange,maxRange)

        when:
        Arrays.sort(tab)

        then:
        tab.length == length
        tab[0] >= minRange
        tab[tab.length-1] < maxRange
    }
}
