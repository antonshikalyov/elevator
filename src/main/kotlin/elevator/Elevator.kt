package elevator


/* Алгоритм эмитацирующий панель кнопок в лифте от 1 до 9 */

    fun Elevator() {

        print("Введите следующий этаж: ")
        nextFloor = input.nextInt()

        if (0 < nextFloor!! && nextFloor!! < 10) {
            nextFloor()
        }

        else do {
            print("Введите следующий этаж: ")
            nextFloor = input.nextInt()
        } while ((0 < nextFloor!! && nextFloor!! < 10) != true)
        nextFloor()


        if (myFloor == currentFloor) {         // Алгоритм помогающий ориентироваться
            println("Лифт уже прибыл!")
        } else if (nextFloor == currentFloor) {
            println("Вы на месте!")
        }
    }

