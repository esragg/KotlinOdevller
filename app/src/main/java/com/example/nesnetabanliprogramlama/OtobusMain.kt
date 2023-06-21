package com.example.nesnetabanliprogramlama

fun main() {
    val kamilKoc = Otobus(50,"Bursa","Ankara", 10)

    kamilKoc.bilgial()

    kamilKoc.kapasite = 100
    kamilKoc.nereden = "Izmir"
    kamilKoc.nereye = "Istanbul"
    kamilKoc.mevcutYolcu = 30

    kamilKoc.bilgial()

    kamilKoc.yolcuAl(20)

    kamilKoc.bilgial()

    kamilKoc.yolcuIndir(40)

    kamilKoc.bilgial()

    val otobusFirmasi = Otobus(50,"Bursa", "Izmit", 5)

    otobusFirmasi.bilgial()
}