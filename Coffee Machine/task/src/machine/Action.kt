package machine

enum class Action (val value: String ){
    BUY("buy"),
    FILL("fill"),
    TAKE("take"),
    EXIT("exit"),
    REMAINING("remaining")
}