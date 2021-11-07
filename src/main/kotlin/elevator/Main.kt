package elevator

import java.util.*


/*Глобальные переменные вынесенные за пределы классов*/

   val input = Scanner(System.`in`)
   var currentFloor: Int = 1
   var myFloor: Int? = null          // Мой этаж
   var nextFloor: Int? = null       // Этаж на который мне нужно


fun main() {
   val creatingOfObjectDoesNotRequireNewKeyword = KotlinIsSimple("")
   Thread.sleep(500)       // Дает время прогрузиться "creatingOfObjectDoesNotRequireNewKeyword"
   print    ("    ------------------------------------------------------" +
           "\n   /               //   ()  //=== //////                /" +
           "\n  /               //   //  //===   //                  /" +
           "\n /               ==== //  //      //                  /" +
           "\n------------------------------------------------------")
   println("\nДля того чтобы покинуть симулятор лифта введите \"Finish\"!!!\n" +
           "для продолжения алгоритма введите любое число)")
   println("Лифт на ходиться на $currentFloor этаже")
   print("Введите ваш этаж: ")


   myFloor = input.nextInt()
   if (0 < myFloor!! && myFloor!! < 10){        // Проверка моего этажа чтобы лифт не уехал в космос
      callElevator()
   }else do {
      print("Введите ваш этаж: ")
      myFloor = input.nextInt()
   } while ((0 < myFloor!! && myFloor!! < 10) != true)
   callElevator()


   do {        // Цикл катания на лифте пока не надоест
      Elevator()
      print("Еще разок?: ")

      val exitGame  = Scanner(System.`in`)
      val exit = exitGame.next()

      println("Лифт на ходиться на $currentFloor этаже")
   }while (exit != "Finish")
}





