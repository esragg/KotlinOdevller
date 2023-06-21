package com.example.nesnetabanliprogramlama.odevler

class Odev4 {
    fun kelimeAdeti(kelime:String, harf:Char) {

        var sonuc = 0

        for (k in kelime) {
            if(k == harf) {
                sonuc++
            }
        }

        println("Harf Adeti: $sonuc")
    }
}