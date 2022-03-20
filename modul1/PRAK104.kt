package modul1

import java.util.Scanner

class kucing (nama: String, jenisHewan: String, jenisKucing: String, warna: String) {
    var nama: String = nama
    var jenisHewan: String = jenisHewan
    var jenisKucing: String = jenisKucing
    var warna: String = warna
}

fun  main(args: Array<String>) {
    val input = Scanner(System.`in`)
    print("Nama: ")
    val nama = readLine()
    print("Jenis Hewan: ")
    val jenisHewan = readLine()
    print("Jenis Kucing: ")
    val jenisKucing = readLine()
    print("Warna: ")
    val warna = readLine()
    val objk = kucing("$nama", "$jenisHewan", "$jenisKucing", "$warna")
    print("Hewan ini adalah ${objk.nama}. \nTermasuk jenis hewan ${objk.jenisHewan}. \nJenis ${objk.nama} ${objk.jenisKucing}. \nBerwana ${objk.warna}.")
}







