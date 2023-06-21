package com.example.nesnetabanliprogramlama.odevler
//n! = n*(n-1)*(n-2)*... *2*1.
class Faktoriyel(val deger:Int) {

    var sonuc:Int = 1

    fun factorial():Int {
        for (n in 1..deger) {
            sonuc = sonuc * n
        }
        return sonuc
    }
}

