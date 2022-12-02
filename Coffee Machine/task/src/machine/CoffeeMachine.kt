package machine

import kotlin.math.min

class CoffeeMachine {
    var mlOfWater = 400
    var mlOfMilk = 540
    var gOfBeans = 120
    var money = 550
    var disposableCups = 9

    fun cupsAmount(cup: CoffeeCup): Int {
        val milkSupply = if (cup.mlOfMilk > 0) mlOfMilk / cup.mlOfMilk else mlOfMilk
        val waterSupply = if (cup.mlOfWater > 0) mlOfWater / cup.mlOfWater else mlOfWater
        val beanSupply = if (cup.gOfBeans > 0) gOfBeans / cup.gOfBeans else gOfBeans
        return min(disposableCups, min(beanSupply, min(milkSupply, waterSupply)))
    }

    fun makeCoffee(cup: CoffeeCup) {
        if (cupsAmount(cup) > 0) {
            println("I have enough resources, making you a coffee!")
            this.mlOfMilk -= cup.mlOfMilk
            this.gOfBeans -= cup.gOfBeans
            this.mlOfWater -= cup.mlOfWater
            this.money += cup.price
            this.disposableCups--
        } else {
            println("Sorry, not enough water!")
        }
    }

    fun printSupplies() {
        println("""
            The coffee machine has:
            $mlOfWater ml of water
            $mlOfMilk ml of milk
            $gOfBeans g of coffee beans
            $disposableCups disposable cups
            $$money of money
            
        """.trimIndent())
    }
}