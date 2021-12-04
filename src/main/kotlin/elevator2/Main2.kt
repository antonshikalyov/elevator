package elevator2

import java.util.*

val input = Scanner(System.`in`)
var currentFloor1: Int = 1

fun main(){

    do {        // Цикл катания на лифте пока не надоест
        Elevator1().elevator()
        print("Еще разок?: ")

        val exitGame  = Scanner(System.`in`)
        val exit = exitGame.next()

        println("Лифт на ходиться на $currentFloor1 этаже")
    }while (exit != "Finish")
}


class Elevator1 {
    var myFloor1: Int? = null          // Мой этаж
    var nextFloor: Int? = null

    fun elevator() {
        print("Введите следующий этаж: ")
        nextFloor = input.nextInt()
        Floor().nextFloor(nextFloor!!)

        fun x(){
            when (nextFloor) {
                1 -> Floor1().nextFloor(nextFloor!!)
                2 -> Floor2().nextFloor(nextFloor!!)
                3 -> Floor3().nextFloor(nextFloor!!)
                4 -> Floor4().nextFloor(nextFloor!!)
//                5 -> Floor.Floor5().nextFloor(nextFloor!!)
//                6 -> Floor.Floor6().nextFloor(nextFloor!!)
//                7 -> Floor.Floor7().nextFloor(nextFloor!!)
//                8 -> Floor.Floor8().nextFloor(nextFloor!!)
//                9 -> Floor.Floor9().nextFloor(nextFloor!!)
            }
        }

        if (myFloor1 == currentFloor1) {         // Алгоритм помогающий ориентироваться
            println("Вы и так на месте!")
        } else if (nextFloor == currentFloor1) {
            println("Лифт уже прибыл!")
        }

        if (0 < nextFloor!! && nextFloor!! < 10) {
            x()
        }

        else do {
            print("Введите следующий этаж: ")
            elevator.nextFloor = elevator.input.nextInt()
        } while ((0 < nextFloor!! && nextFloor!! < 10) != true)
        x()



    }
}


open class Floor {
    open var numberOfFloor: Int = 0
    open var nextFloor1: Int? = null

    open fun nextFloor(nextFloor2: Int) {
        nextFloor1 = nextFloor2
        if (currentFloor1 < nextFloor1!!) {          // Алгоритм выполняющий нашу поездку на выбраный нами этаж
            for (i in currentFloor1..nextFloor1!!) {
                currentFloor1 = i
                Thread.sleep(1500)
                println("Лифт на " + currentFloor1 + " этаже")
            }
        }

        if (currentFloor1 > nextFloor1!!) {         // Алгоритм выполняющий нашу поездку на выбраный нами этаж
            for (i in currentFloor1 downTo nextFloor1!!) {
                currentFloor1 = i
                Thread.sleep(1500)
                println("Лифт на " + currentFloor1 + " этаже")
            }
        }
    }
}

class Floor1(): Floor() {
    override var numberOfFloor: Int = 1;
    override var nextFloor1: Int?
        get() = super.nextFloor1
        set(nextFloor) {
            nextFloor1 = nextFloor
        }
    fun get() = numberOfFloor

    override fun nextFloor(nextFloor2: Int) {
        nextFloor(nextFloor1!!)
    }
}

class Floor2(): Floor() {
    override var numberOfFloor: Int = 2
    override var nextFloor1: Int?
        get() = super.nextFloor1
        set(nextFloor) {
            nextFloor1 = nextFloor
        }
    fun get() = numberOfFloor

    override fun nextFloor(nextFloor2: Int) {
        super.nextFloor(nextFloor1!!)
    }
}

class Floor3(): Floor() {
    override var numberOfFloor: Int = 3;
    override var nextFloor1: Int?
        get() = super.nextFloor1
        set(nextFloor) {
            nextFloor1 = nextFloor1
        }

    override fun nextFloor(nextFloor2: Int) {
        nextFloor(nextFloor1!!)
    }
}

class Floor4(): Floor() {
    override var numberOfFloor: Int = 4
    override var nextFloor1: Int?
        get() = super.nextFloor1
        set(nextFloor) {
            nextFloor1 = nextFloor1
        }
    fun get() = numberOfFloor

    override fun nextFloor(nextFloor2: Int) {
        super.nextFloor(nextFloor1!!)
    }
}

