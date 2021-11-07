package elevator


/* Алгоритм логики движения пассажира на выбранный этаж */

fun nextFloor(){

    if (currentFloor < nextFloor!!) {          // Алгоритм выполняющий нашу поездку на выбраный нами этаж
        for (i in currentFloor..nextFloor!!) {
            currentFloor = i
            Thread.sleep(1500)
            println("Лифт на $currentFloor этаже")
        }
    }

    if (currentFloor > nextFloor!!) {         // Алгоритм выполняющий нашу поездку на выбраный нами этаж
        for (i in currentFloor downTo nextFloor!!) {
            currentFloor = i
            Thread.sleep(1500)
            println("Лифт на $currentFloor этаже")
        }
    }
}