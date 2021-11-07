package elevator


/* Алгоритм описывающий кнопку которая вызывает лифт на этаж */

fun callElevator() {

    if (currentFloor < myFloor!!) {        // Алгоритм выполняющий поездку лифта и контроль этажей на пути к нам
        for (i in 1..myFloor!!) {
            currentFloor = i
            Thread.sleep(1500)
            println("Лифт на $currentFloor этаже")
        }
        println("Дзынь лифт прибыл")
    }

    if (currentFloor > myFloor!!) {        // Алгоритм выполняющий поездку лифта и контроль этажей на пути к нам
        for (i in currentFloor downTo myFloor!!) {
            currentFloor = i
            Thread.sleep(1500)
            println("Лифт на $currentFloor этаже")
        }
        println("Дзынь лифт прибыл")
    }
}
