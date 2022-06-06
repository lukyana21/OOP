//*<-----Pertemuan 1----->*//

//class Kendaraan(
//    val nama: String,
//    val jumlahRoda: Int,
//    val warna: String,
//    val harga: String
//){
//    fun kemampuan(){
//        println("kendaraan $nama bisa jalan")
//    }
//}
//
//fun main(){
//    val K1 = Kendaraan("mobil", 4, "merah", "Rp. 120_000")
//    val K2 = Kendaraan("bus", 4, "biru", "nggak tau")
//    val K3 = Kendaraan("kapal", 0, "putih", "nggak tau juga")
//    K1.kemampuan()
//    println(K2.jumlahRoda)
//    println(K3.warna)
//    println(K1.harga)
//}

//class Hewan {
//    var nama = "luky"
//    get(){
//        println("Method Get Terpanggil")
//        return field
//    }
//    set(value) {
//        println("Method Set Terpanggil")
//        field =  value
//    }
//}

//fun main(){
//    val sapi = Hewan()
//    println(sapi.nama)
//    sapi.nama = "Moomo"
//    println(sapi.nama)
//}

//<-----Pertemuan ke-2----->
//Delegasi Properti

import kotlin.reflect.KProperty

//class Ketua(){
//    private var default: Any = "Default"
//
//    operator fun getValue(classRef: Any,
//        property: KProperty<*>): Any{
//        println("Method Get Terpanggil")
//        return default
//    }

//    operator fun setValue(classRef: Any,
//        property: KProperty<*>, newValue: Any){
//        println("Method Set Terpanggil!")
//        default = newValue
//    }
//}

//class Contoh(){
//    var nama: Any by Ketua()
//    var umur: Any by Ketua()
//    var nilai: Any by Ketua()
//}

//fun main(){
//    val objek = Contoh()
//    objek.nama = "Luky"
//    objek.umur = 21
//    objek.nilai = 100.0
//    println(objek.nama)
//    println(objek.umur)
//    println(objek.nilai)
//}


//Extention Properti
//class Hewan(val nama: String, val kaki: Int, val umur: Int, val mamalia: Boolean)
//
//val Hewan.yuhuu: String
//    get() = "Nama: $nama, Jumlah kaki: $kaki, Umur: $umur, Termasuk Mamalia : $mamalia"
//
//fun main(){
//    val sapi = Hewan("Asep", 6, 21, true)
//    print(sapi.yuhuu)
//}

//Primary Construktor
//class Mahasiswa(val nim: String)
//
//fun main(){
//    val luky = Mahasiswa("195410053")
//    println(luky.nim)
//}

//init
//class Animal(name: String, weight: Double, age: Int, isMammal: Boolean){
//    val name: String
//    val weight: Double
//    val age: Int
//    val isMammal: Boolean
//
//    init{
//        this.weight = if(weight < 0) 0.1 else weight
//        this.age = if(age<0) 0 else age
//        this.name = name
//        this.isMammal = isMammal
//    }
//}
//
//fun main(){
//    val sapi = Animal("Asep", -1.5, 0, true)
//    print(sapi.weight)
//}

//Study Case
//class Mahasiswa(nama: String, nim: Int, kelas: String){
//    val nama: String
//    val nim: String
//    val kelas: String
//
//    init {
//        this.nama = if (nama == "") "Nama Tidak Boleh Kosong" else nama
//        this.nim = if (nim == 0) "Nim Tidak Boleh 0" else "$nim"
//        this.kelas = if (kelas == "") "Kelas Tidak Boleh Kosong" else kelas
//    }
//}
//
//fun main(){
//    val yuhuu = Mahasiswa("Luky", 195410053, "IF1")
//    val haha = Mahasiswa("",195410053, "IF1")
//    val huhu = Mahasiswa("Luky", 0, "IF1")
//    val hihi = Mahasiswa("Luky", 195410053, "")
//    println("Nama Mahasiswa : ${yuhuu.nama}, dengan nim: ${yuhuu.nim}, dan saat ini tergabung dalam kelas : ${yuhuu.kelas}")
//    println(haha.nama)
//    println(huhu.nim)
//    println(hihi.kelas)
//}

//secondary construktor
//class Kendaraan(nama: String, pintu: Int) {
//    val nama: String
//    val pintu: Int
//    var ban: Int
//
//    init {
//        this.nama = if (nama == "") "nama tidak boleh kosong" else nama
//        this.pintu = if (pintu == 0) 2 else pintu
//        this.ban = 0
//    }
//
//    constructor(nama: String, pintu: Int, ban: Int) : this(nama, pintu) {
//        this.ban = ban
//    }
//}
//
//fun main() {
//    val objek1 = Kendaraan("Kapal", 10)
//    println(objek1.nama)
//    println(objek1.pintu)
//    println(objek1.ban)
//    println()
//    val objek2 = Kendaraan("Mobil", 2, 4)
//    println(objek2.nama)
//    println(objek2.pintu)
//    println(objek2.ban)
//}

//Default Construktor
//class Kendaraan {
//    val nama = "BMW"
//    val ban = 4
//    val pintu = 2
//}
//fun main(){
//    val mobil = Kendaraan()
//    print("${mobil.nama} dan ${mobil.ban} dan ${mobil.pintu}")
//}

//Inheritance (pewarisan)
//open class Hewan(val contoh: String){
//    fun makan(){
//        print("$contoh sedang makan")
//    }
//}
//class Kucing(nama: String) : Hewan(nama)
//class Anjing(sempak: String) : Hewan(sempak)
//
//fun main(){
//    val objek = Kucing("Tono")
//    val objek2 = Anjing("Boy")
//    objek.makan()
//    println()
//    objek2.makan()
//}

//open class CalonPacar(val nama1: String, val nama2: String){
//    fun DiajakJalan(){
//        println("si $nama1 sedang diajak jalan oleh $nama2")
//    }
//    fun AjakJalan(){
//        println("si $nama1 ngajak jalan $nama2")
//    }
//}
//class Cewek(namaCewek: String, namaCowok: String) : CalonPacar(namaCewek, namaCowok)
//class Cowok(namanyaCowok: String, namanyaCewek: String): CalonPacar(namanyaCowok, namanyaCewek)
//
//fun main(){
//    val calon1 = Cewek("Syahifa", "Boy")
//    val calon2 = Cowok("Luky", "Siapa")
//    calon1.DiajakJalan()
//    calon2.AjakJalan()
//}

//overloading
//class Kalkulator(){
//    fun tambah(a: Int, b: Int){
//        println(a + b)
//    }
//    fun tambah(a: Double, b: Double){
//        println(a + b)
//    }
//    fun tambah(a: Int, b: Int, c: Int){
//        println(a + b + c)
//    }
//}
//fun main(){
//    val objek = Kalkulator()
//    objek.tambah(5,10)
//    objek.tambah(10.0, 10.0)
//    objek.tambah(5,10,15)
//}

//class Mahasiswa(){
//    fun identitas(nama: String){
//        println("namanya adalah $nama")
//    }
//    fun identitas(nama: String, kelas: String, nim: Int){
//        println("namanya adalah $nama, dan masuk di kelas $kelas, dan nomor mahasiswanya $nim")
//    }
//}
//fun main(){
//    val yuhuu = Mahasiswa()
//    yuhuu.identitas("Luky")
//    yuhuu.identitas("Ana", "IF1", 195410053)
//}


//abstract class (membuat kelas yang bersifat abstrak agar kelasnya tidak bisa langsung dibuat objeknya)
//abstract class Hewan(val nama: String){
//    fun makan(){
//        println("$nama sedang makan")
//    }
//    fun minum(){
//        println("$nama sedang minum")
//    }
//}
//
//class Babi(nama: String): Hewan(nama){
//    fun bergerak(){
//        println("$nama sedang bergerak")
//    }
//}
//
//class Kucing(nama: String): Hewan(nama)
//
//fun main(){
//    val babi = Babi("Asep")
//    babi.makan()
//    babi.minum()
//    babi.bergerak()
//
//    val kucing = Kucing("Mao")
//    kucing.makan()
//    kucing.minum()
//}

//abstract class Kendaraan(val jenis: String){
//    fun warna(warna: String){
//        println("Jenis kendaraan $jenis berwarna $warna")
//    }
//    fun jumlahRoda(jumlah: Int){
//        println("Jenis Kendaraan $jenis memiliki roda $jumlah")
//    }
//}
//class Mobil(nama: String): Kendaraan(nama){
//    fun banyakMuatan(jml: Int){
//        println("banyak muatan yang bisa ditampung Mobil ada $jml")
//    }
//}
//class Motor(nama: String): Kendaraan(nama)
//
//fun main(){
//    val mobil = Mobil("X-Pander")
//    mobil.warna("Silver")
//    mobil.jumlahRoda(4)
//    mobil.banyakMuatan(6)
//
//    val motor = Motor("Vixion")
//    motor.warna("merah")
//    motor.jumlahRoda(2)
//}

//*interface*//
//sama dengan abstract cuma yang membedakan interface tidak perlu kurung kurawal (deklarasi)
//jadi interface boleh membuat function atau properti tanpa harus diisi (dideklarasikan)
//sama sama tidak bisa dibuat objectnya
//---contoh---//
//method Overloading -> Fungsi yang sama, dibedakan dengan parameternya atau gelasnya
//method Overriding -> Fungsi sama, parameternya sama (identik)
//abstract class HewanLaut{
//    fun berenang(){
//        println("Aku berenang")
//    }
//}
//interface HewanDarat{
//    val ekor: Int
//    fun bergerak()
//}
//class Ular(override val ekor: Int): HewanDarat{
//    override fun bergerak() {
//        println("Aku melata dengan perutku")
//    }
//}
//class Kucing(override val ekor: Int): HewanDarat{
//    override fun bergerak() {
//        println("Aku bergerak dengan kakiku yang imut")
//    }
//}
//class Hiu: HewanLaut()
//fun main(){
//    val kucing = Kucing(1)
//    kucing.bergerak()
//    println(kucing.ekor)
//
//    val ular = Ular(1)
//    ular.bergerak()
//
//    val hiu = Hiu()
//    hiu.berenang()
//}

//Exception handling (penanganan error agar tidak force close)
//*try catch*//
//fun main() {
//    val contoh: String? = null
//    lateinit var hasil: String
//    try {
//        hasil = contoh!!
//        println(hasil)
//    } catch (e: Exception) {
//        hasil = "Silahkan dicek lagi"
//        println(hasil)
//    }
//}
//*try catch finally*//
//finally akan tetap dijalankan setelah try sama catch dijalankan
//fun main() {
//    val contoh: String? = null
//    lateinit var hasil: String
//    try {
//        hasil = contoh!!
//        println(hasil)
//    } catch (e: Exception) {
//        hasil = "Silahkan dicek lagi"
//    } finally {
//        println(hasil)
//    }
//}
//*Multiple Catch*//
//sama seperti if else
//fun main(){
//    val contoh: String? = null
//    lateinit var hasil: String
//    try {
//        hasil = contoh!!
//        println(hasil)
//    }catch (e: NullPointerException){
//        hasil = "Terjadi error NPE"
//    }catch (e: NumberFormatException){
//        hasil = "Terjadi error NFE"
//    }catch (e: ArithmeticException){
//        hasil = "Terjadi error Aritmatic"
//    }catch (e: Exception){
//        hasil = "Terjadi error Exception"
//    }finally {
//        println(hasil)
//    }
//}