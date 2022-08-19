fun main() {

    for (num in 1..35) {
        if (num % 3 == 0 && num % 5 == 0) {
            println("Fizzbuzz")
        }else if (num % 5 == 0) {
            println("Buzz")
        }else if (num % 3 == 0) {
            println("Fizz")
        }else{
            println("$num")
        }
    }
}