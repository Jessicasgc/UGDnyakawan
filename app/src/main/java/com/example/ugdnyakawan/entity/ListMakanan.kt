package com.example.ugdnyakawan.entity

class ListMakanan (var nama : String, var deskripsi : String) {

    companion object{
        @JvmField
        var listOfMakanan = arrayOf(
            ListMakanan("Nasi Goreng", "Nasi goreng dengan isian Telur, Sosis, Timun, Kerupuk"),
            ListMakanan("Ramen", "Mie ala jepang dengan isian telur, daging babi, daun bawang cincang, wijen, kuah kaldu ala jepang"),
            ListMakanan("Steak", "Daging Wagyu, wortel, buncis, jagung, kentang goreng dengan saus jamur")


            )
    }
}