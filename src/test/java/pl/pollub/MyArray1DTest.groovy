package pl.pollub

import spock.lang.Specification

class MyArray1DTest extends Specification {

    def "GenerateRandomArray should create int array with range"() {

        given:
        def length = 10
        def minRange = 1
        def maxRange = 100
        def array = MyArray1D.generateRandomArray(length,minRange,maxRange)

        when:
        Arrays.sort(array)

        then:
        array.length == length
        array[0] >= minRange
        array[array.length-1] < maxRange
    }
}
