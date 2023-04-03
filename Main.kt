class Doktor(
    val adi: String,
    val soyadi: String,
    val bransi: String,
    val departman: String,
    val dogumTarihi: String)
{
    fun yaz(): String
    {
        return "Doktor $adi $soyadi, $bransi $departman departmanında çalışmaktadır."
    }
}

fun main()
{
    val doktor = Doktor("Mehmet", "Bandırma", "Çocuk", "Poliklinik", "10.12.1975")
    println(doktor.yaz())
}
