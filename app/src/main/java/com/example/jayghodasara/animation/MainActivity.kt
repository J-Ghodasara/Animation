package com.example.jayghodasara.animation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var scaleanim:Animation
        var alphaanim:Animation
        var translateanim:Animation
        var rotateanim:Animation

        alpha.setOnClickListener(View.OnClickListener {

            alphaanim= AnimationUtils.loadAnimation(this,R.anim.alpha)

            imageView.startAnimation(alphaanim)
        })

        scale.setOnClickListener(View.OnClickListener {

            scaleanim= AnimationUtils.loadAnimation(this,R.anim.scale)

            imageView.startAnimation(scaleanim)
        })

        Translate.setOnClickListener(View.OnClickListener {

            translateanim= AnimationUtils.loadAnimation(this,R.anim.translate)

            imageView.startAnimation(translateanim)
        })

        rotate.setOnClickListener(View.OnClickListener {

            rotateanim= AnimationUtils.loadAnimation(this,R.anim.rotate)

            imageView.startAnimation(rotateanim)
        })
    }
}
