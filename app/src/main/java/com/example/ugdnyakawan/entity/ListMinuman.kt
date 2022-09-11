package com.example.ugdnyakawan.entity


class ListMinuman(var nama : String, var deskripsi : String) {

    companion object{
        @JvmField
        var listOfMinuman = arrayOf(
            ListMinuman("ES Tea", "Tea manis yang diperpadukan dengan ES yang segar"),
            ListMinuman("ES Jeruk", "Air Jeruk manis yang diperpadukan dengan ES yang segar"),
            ListMinuman("ES Jus Buah", "Berbagai macam buah yang dicampur serta diberi ES yang segar")

        )
    }
}
