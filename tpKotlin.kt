fun main() {
    val london = City("London")
    val paris = City("Paris")
    val telephone = Product("Iphone 12",850.0)
    val ordinateur = Product("Mac Book Pro",1000.0)
    val firstOrder = Order(listOf(telephone,ordinateur),true)
    val secondOrder = Order(listOf(telephone,ordinateur),false)
    val command = listOf(firstOrder,secondOrder)
    val customerLarisa = Customer("Larisa", london, command)
    val customerAlbert = Customer("Albert", paris, command)
    val customerOlga = Customer("Olga", paris, command)
    val shop = Shop("ShopDeOuf", listOf(customerLarisa, customerAlbert, customerOlga))
	shop.getCitiesCustomersAreFrom()
    println(shop.getCustomersFrom(paris))
}

data class Shop(val name: String, val customers:
List<Customer>)

data class Customer(val name: String, val city: City, val
orders: List<Order>) {
override fun toString() = "$name from ${city.name}"
}

data class Order(val products: List<Product>, val
isDelivered: Boolean)

data class Product(val name: String, val price: Double) {
override fun toString() = "'$name' for $price"
}

data class City(val name: String) {
override fun toString() = name
}

fun Shop.getCitiesCustomersAreFrom() {
    customers.forEach{
        println(it.city)
    }
}

fun Shop.getCustomersFrom(city: City){
    customers.filter{it.city == city}.forEach{
        println(it.name)
    }
}