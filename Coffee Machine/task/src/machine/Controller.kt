package machine

import java.util.*

class Controller (
    val coffeeMachine: CoffeeMachine,
    val espresso: CoffeeCup,
    val latte: CoffeeCup,
    val cappuccino: CoffeeCup
) {

    fun action() {

        while (true) {
            println("Write action (buy, fill, take, remaining, exit):")
            var value = readln().uppercase(Locale.getDefault())
            println()
            when (Action.valueOf(value)) {
                Action.BUY -> buy()
                Action.FILL -> fill()
                Action.TAKE -> take()
                Action.REMAINING -> coffeeMachine.printSupplies()
                Action.EXIT -> break
            }
        }

    }

    private fun fill() {
        println("Write how many ml of water you want to add:")
        coffeeMachine.mlOfWater += readln().toInt()
        println("Write how many ml of milk you want to add:")
        coffeeMachine.mlOfMilk += readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        coffeeMachine.gOfBeans += readln().toInt()
        println("Write how many disposable cups you want to add:")
        coffeeMachine.disposableCups += readln().toInt()
    }

    private fun buy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        when (readln()) {
            "1" -> coffeeMachine.makeCoffee(espresso)
            "2" -> coffeeMachine.makeCoffee(latte)
            "3" -> coffeeMachine.makeCoffee(cappuccino)
        }
        println()
    }

    private fun take() {
        coffeeMachine.money = 0
    }
}