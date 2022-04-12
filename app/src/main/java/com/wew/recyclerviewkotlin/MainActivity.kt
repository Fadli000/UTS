package com.wew.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.mazda,
                nameSuperhero = "Mazda MX-5 Miata",
                descSuperhero = "Menyebut Mazda MX-5 Miata sebagai ikon otomotif tidak berlebihan, karena warisannya telah berusia lebih dari 30 tahun dan sikap mengemudi yang ceria selalu menjadi atribut karakter terkuatnya."
            ),
            Superhero(
                R.drawable.supra,
                nameSuperhero = "Toyota Supra",
                descSuperhero = "Mobil ini menawarkan kepribadiannya sendiri yang berbeda, dan Anda akan merasakan sensasi “ledakan” saat mengendarainya."
            ),
            Superhero(
                R.drawable.a,
                nameSuperhero = "BMW Z4",
                descSuperhero = "Tidak ada yang lebih baik daripada bersantai di hari yang cerah dan menemukan jalan yang menghibur untuk dinikmati, dan BMW Z4 2021 adalah pilihan tepat untuk aktivitas semacam itu."
            ),
            Superhero(
                R.drawable.mm,
                nameSuperhero = "BMW M2",
                descSuperhero = "Dibandingkan dengan BMW 2-series biasa, BMW M2 2021 coupe suped-up ini menawarkan mug yang lebih kejam dan pinggul yang lebih lebar."
            ),
            Superhero(
                R.drawable.b,
                nameSuperhero = "Porsche 718 Boxster",
                descSuperhero = "Desain mid-engine mobil ini dan sasis sport-tuned membantunya menghadirkan dinamika berkendara yang seimbang sempurna."
            ),
            Superhero(
                R.drawable.camaro,
                nameSuperhero = "Chevrolet Camaro ZL1",
                descSuperhero = "Dengan tenaga 650 hp supercharged V-8 dan kemampuan di trek yang ganas, Chevrolet Camaro ZL1 2021 adalah raja monster muscle car."
            ),
            Superhero(
                R.drawable.mustang,
                nameSuperhero = "Ford Mustang Shelby GT500",
                descSuperhero = "Ford Mustang Shelby GT500 2021 menawarkan 760 tenaga kuda supercharged-V-8. Juga memiliki kesan atletis dari mobil sport yang lebih kecil dan lebih ringan."
            ),
            Superhero(
                R.drawable.mercedes,
                nameSuperhero = "Mercedes-AMG GT",
                descSuperhero = "Bodywork yang benar-benar menakjubkan dari Mercedes-AMG GT 2021 tidak diragukan lagi akan menarik perhatian Anda, tetapi ini lebih dari sekadar wajah cantik."
            ),
            Superhero(
                R.drawable.f,
                nameSuperhero = "Ferrari F8",
                descSuperhero = "Ferrari mendandani setiap varian dengan bodywork yang eksotis, dan atasan Spider yang dapat dilepas memberikan pengalaman ekstra mendalam."
            ),
            Superhero(
                R.drawable.laren,
                nameSuperhero = "McLaren 765LT",
                descSuperhero = "McLaren 765LT 2021 merupakan mobil sport eksotis yang berfokus pada trek. Beratnya kurang dari 3.000 pon (1.360 kg)."
            ),

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superherolist){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}