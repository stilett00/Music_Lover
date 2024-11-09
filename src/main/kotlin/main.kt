fun main() {
    var purchasePrice = 15000
    val isMonthlyPurchases = true

    if (purchasePrice in 1001 .. 10000) {
        purchasePrice -= 100
    } else if (purchasePrice > 10000) {
        purchasePrice -= (purchasePrice * 0.05).toInt()
    }

    if (isMonthlyPurchases) {
        purchasePrice -= (purchasePrice * 0.01).toInt()
    }

    println(purchasePrice)
}
