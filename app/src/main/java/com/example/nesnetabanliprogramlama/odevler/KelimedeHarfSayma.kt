package com.example.nesnetabanliprogramlama.odevler

class KelimedeHarfSayma() {

    fun bulHarfi(kelime: String, harf:String):Int {
        var count:Int = 0
        for (i in kelime.count()-1 downTo 0 step 1) {
            val harfi = kelime.get(i).toString()
            if(harfi.equals(harf)) {
                count++
            }
        }
        return count
    }
}