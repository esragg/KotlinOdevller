package com.example.nesnetabanliprogramlama

fun  main() {

    val bmw = Araba("kirmizi", 10, false)

    bmw.bilgiAl()

    bmw.calistir()
    bmw.hizlan(20)
    bmw.hizlan(5)
    bmw.yavasla(12)

    bmw.bilgiAl()

    val sahin = Araba("sari",100,true)

    sahin.bilgiAl()

    sahin.hizlan(50)
    sahin.durdur()
    sahin.bilgiAl()
}