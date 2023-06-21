package com.example.nesnetabanliprogramlama

class Araba (var renk:String, var  hiz:Int, var calisiyorMu:Boolean) {

    lateinit var otobus: Otobus

    fun calistir() {
        calisiyorMu = true
    }

    fun durdur() {
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int) {
        hiz = hiz + kacKm
    }

    fun yavasla(kacKm: Int) {
        hiz = hiz - kacKm
    }
    fun bilgiAl() {
        println("Renk : $renk")
        println("Hiz : $hiz")
        println("Calisiyor mu? : $calisiyorMu")
    }
}