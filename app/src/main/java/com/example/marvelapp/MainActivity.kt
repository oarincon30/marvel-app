package com.example.marvelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.bumptech.glide.Glide

import com.google.android.material.chip.Chip

public class MainActivity : AppCompatActivity() {
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView
    private lateinit var imageView4: ImageView
    private lateinit var imageView5: ImageView
    private lateinit var imageView6: ImageView
    private lateinit var imageView7: ImageView
    private lateinit var imageView8: ImageView
    private lateinit var imageView9: ImageView
    private lateinit var imageView10: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView1 = findViewById(R.id.image_view1)
        imageView2 = findViewById(R.id.image_view2)
        imageView3 = findViewById(R.id.image_view3)
        imageView4 = findViewById(R.id.image_view4)
        imageView5 = findViewById(R.id.image_view5)
        imageView6 = findViewById(R.id.image_view6)
        imageView7 = findViewById(R.id.image_view7)
        imageView8 = findViewById(R.id.image_view8)
        imageView9 = findViewById(R.id.image_view9)
        imageView10 = findViewById(R.id.image_view10)

        val imageUrl1 = "https://www.themoviedb.org/t/p/original/tFCTNx7foAsUQpgu2x1KjAJD1wT.jpg"
        val imageUrl2 = "https://m.media-amazon.com/images/I/81SIVdnkUmL.jpg"
        val imageUrl3 = "https://es.web.img3.acsta.net/pictures/14/01/31/16/12/220933.jpg"
        val imageUrl4 = "https://pics.filmaffinity.com/Guardianes_de_la_galaxia-595487268-large.jpg"
        val imageUrl5 = "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/980px/public/media/image/2017/07/spider-man-homecoming_1.jpg?itok=ug6XMiJn"
        val imageUrl6 = "https://m.media-amazon.com/images/M/MV5BMjMyNDkzMzI1OF5BMl5BanBnXkFtZTgwODcxODg5MjI@._V1_FMjpg_UX1000_.jpg"
        val imageUrl7 = "https://xn--msqver-pta.com/wp-content/uploads/2018/02/pantera-negra-int.jpg"
        val imageUrl8 = "https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_.jpg"
        val imageUrl9 = "https://www.themoviedb.org/t/p/original/aYDRwraSc8SXgot5jabtspJTWZB.jpg"
        val imageUrl10 = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/spiderman-lejos-de-casa-poster-1558607439.jpg"

        Glide.with(this)
            .load(imageUrl1)
            .into(imageView1)
        Glide.with(this)
            .load(imageUrl2)
            .into(imageView2)
        Glide.with(this)
            .load(imageUrl3)
            .into(imageView3)
        Glide.with(this)
            .load(imageUrl4)
            .into(imageView4)
        Glide.with(this)
            .load(imageUrl5)
            .into(imageView5)
        Glide.with(this)
            .load(imageUrl6)
            .into(imageView6)
        Glide.with(this)
            .load(imageUrl7)
            .into(imageView7)
        Glide.with(this)
            .load(imageUrl8)
            .into(imageView8)
        Glide.with(this)
            .load(imageUrl9)
            .into(imageView9)
        Glide.with(this)
            .load(imageUrl10)
            .into(imageView10)

        val chip1 = findViewById<Chip>(R.id.chip1)
        val chip2 = findViewById<Chip>(R.id.chip2)
        val chip3 = findViewById<Chip>(R.id.chip3)
        val chip4 = findViewById<Chip>(R.id.chip4)
        val chip5 = findViewById<Chip>(R.id.chip5)

        val chip6 = findViewById<Chip>(R.id.chip6)
        val chip7 = findViewById<Chip>(R.id.chip7)
        val chip8 = findViewById<Chip>(R.id.chip8)
        val chip9 = findViewById<Chip>(R.id.chip9)
        val chip10 = findViewById<Chip>(R.id.chip10)

        var c_state1 = false
        var c_state2 = false
        var c_state3 = false
        var c_state4 = false
        var c_state5 = false

        var c_state6 = false
        var c_state7 = false
        var c_state8 = false
        var c_state9 = false
        var c_state10 = false

        chip1.setOnClickListener {
            if (c_state1 == false) {
                chip1.setChipBackgroundColorResource(R.color.hero_selected)
                c_state1 = true
            } else {
                chip1.setChipBackgroundColorResource(R.color.hero)
                c_state1 = false
            }
        }

        chip2.setOnClickListener {
            if (c_state2 == false) {
                chip2.setChipBackgroundColorResource(R.color.hero_selected)
                c_state2 = true
            } else {
                chip2.setChipBackgroundColorResource(R.color.hero)
                c_state2 = false
            }
        }

        chip3.setOnClickListener {
            if (c_state3 == false) {
                chip3.setChipBackgroundColorResource(R.color.hero_selected)
                c_state3 = true
            } else {
                chip3.setChipBackgroundColorResource(R.color.hero)
                c_state3 = false
            }
        }

        chip4.setOnClickListener {
            if (c_state4 == false) {
                chip4.setChipBackgroundColorResource(R.color.hero_selected)
                c_state4 = true
            } else {
                chip4.setChipBackgroundColorResource(R.color.hero)
                c_state4 = false
            }
        }

        chip5.setOnClickListener {
            if (c_state5 == false) {
                chip5.setChipBackgroundColorResource(R.color.hero_selected)
                c_state5 = true
            } else {
                chip5.setChipBackgroundColorResource(R.color.hero)
                c_state5 = false
            }
        }

        chip6.setOnClickListener {
            if (c_state6 == false) {
                chip6.setChipBackgroundColorResource(R.color.villain_selected)
                c_state6 = true
            } else {
                chip6.setChipBackgroundColorResource(R.color.villain)
                c_state6 = false
            }
        }

        chip7.setOnClickListener {
            if (c_state7 == false) {
                chip7.setChipBackgroundColorResource(R.color.villain_selected)
                c_state7 = true
            } else {
                chip7.setChipBackgroundColorResource(R.color.villain)
                c_state7 = false
            }
        }

        chip8.setOnClickListener {
            if (c_state8 == false) {
                chip8.setChipBackgroundColorResource(R.color.villain_selected)
                c_state8 = true
            } else {
                chip8.setChipBackgroundColorResource(R.color.villain)
                c_state8 = false
            }
        }

        chip9.setOnClickListener {
            if (c_state9 == false) {
                chip9.setChipBackgroundColorResource(R.color.villain_selected)
                c_state9 = true
            } else {
                chip9.setChipBackgroundColorResource(R.color.villain)
                c_state9 = false
            }
        }

        chip10.setOnClickListener {
            if (c_state10 == false) {
                chip10.setChipBackgroundColorResource(R.color.villain_selected)
                c_state10 = true
            } else {
                chip10.setChipBackgroundColorResource(R.color.villain)
                c_state10 = false
            }
        }



    }



}