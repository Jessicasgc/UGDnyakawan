package com.example.ugdnyakawan.entity

class Dosen (var name : String, var pengajar : String) {

    companion object{
        @JvmField
        var listOfDosen = arrayOf(
            Dosen("Wendy Winata", "Pengajar Kelas A, B, dan D"),
            Dosen("Thomas Adi", "Pengajar Kelas C"),

            )
    }
}