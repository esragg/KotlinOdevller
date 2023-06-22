package com.example.nesnetabanliprogramlama.odevler

class KotaInternet {
    fun hesaplaKotaUcreti(GB:Int):Int {

        var ucret = 0

        if(GB > 50) {
            ucret = 100 + (GB-50)*4
        } else {
            ucret = 100
        }
        return ucret
    }
}