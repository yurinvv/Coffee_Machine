package machine

fun main() {
    val espresso = CoffeeCup(
        mlOfWater = 250,
        mlOfMilk = 0,
        gOfBeans = 16,
        price = 4
    )

    val latte = CoffeeCup(
        mlOfWater = 350,
        mlOfMilk = 75,
        gOfBeans = 20,
        price = 7
    )

    val cappuccino = CoffeeCup(
        mlOfWater = 200,
        mlOfMilk = 100,
        gOfBeans = 12,
        price = 6
    )

    val coffeeMachine = CoffeeMachine()

    val controller = Controller(coffeeMachine, espresso, latte, cappuccino)
    controller.action()

}



