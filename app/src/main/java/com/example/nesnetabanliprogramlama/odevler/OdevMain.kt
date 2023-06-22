package com.example.nesnetabanliprogramlama.odevler

import java.util.Scanner

//Temperature in degrees Fahrenheit (°F) = (Temperature in degrees Celsius (°C) * 9/5) + 32.
fun main() {

//1
    val girdi = Scanner(System.`in`)
    /*
           print("Celcius derece giriniz: ")
           val dereceCelcius = girdi.nextDouble()
           val derece = Fahrenheit()
           val dereceF = derece.donustur(dereceCelcius)

           println("Fahrenheit derecesi: $dereceF")


   //2
           println("Dikdortgenin kenarlarini giriniz:")
           print("Kenar1: ")
           val kenar1 = girdi.nextInt()
           print("Kenar2: ")
           val kenar2 = girdi.nextInt()
           val dikdortgen = Dikdortgen(kenar1, kenar2)
           val sonuc = dikdortgen.cevre()
           println("Dikdortgenin cevresi: $sonuc")

       //3
               print("Faktoriyeli alinacak degeri giriniz: ")
               val deger = girdi.nextInt()
               val faktoriyel = Faktoriyel(deger)  //5! = 5 * 4 * 3 * 2 * 1
               val sonucF = faktoriyel.factorial()
               println("Faktoriyeli: $sonucF")

       //4
           print("Bir kelime giriniz:")
           val kelime = girdi.next()
           print("Bir harf giriniz: ")
           val harf =  girdi.next()

           val kelime1 = KelimedeHarfSayma()
           val sonuc1 = kelime1.bulHarfi(kelime, harf)
           println("$kelime icinde \"$harf\" harfinden $sonuc1 adet bulundu.")



       //5
           print("Ic acilari hesaplamak icin kenar sayisini giriniz: ")
           val kenarSayisi = girdi.nextInt()
           val x = IcAcilarToplami()
           val sonucx = x.icAciHesapla(kenarSayisi)
           println("Ic acilar toplami: $sonucx")


   //6
       val maasHesabi  = Maas()

       val sonucMaas = maasHesabi.maasHesapla(22)
       println("Maas: $sonucMaas")

        */
    val kotaUcretiHesaplama = KotaInternet()
    print("Kota miktarini giriniz:")
    val sonucKotaUcreti = kotaUcretiHesaplama.hesaplaKotaUcreti(girdi.nextInt())
    println("Kota ucreti: $sonucKotaUcreti")

}