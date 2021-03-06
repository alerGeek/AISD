package pl.pollub

import spock.lang.Specification

class MyArray2DTest extends Specification {
    def "should sort new Array 2D ASC"() {
        given:
        def rows = 5
        def columns = 5
        def minRange = 1
        def maxRange = 100

        when:
        def array = MyArray2D.generateRandom(rows, columns, minRange, maxRange)
        def copy = array

        then:
        MyArray2D.print(copy, rows, columns)
        println()
        MyArray2D.bubbleSort(array,5,5,true,2)
        println()
        MyArray2D.print(array,rows,columns)
    }
    def "should sort Array 2D DESC by column"() {
        given:
        def rows = 5
        def columns = 5
        def minRange = 1
        def maxRange = 100

        when:
        def array = MyArray2D.generateRandom(rows, columns, minRange, maxRange)
        def copy = array

        then:
        MyArray2D.print(copy, rows, columns)
        println()
        MyArray2D.bubbleSort(array,5,5,false,2)
        println()
        MyArray2D.print(array,rows,columns)
    }

}
