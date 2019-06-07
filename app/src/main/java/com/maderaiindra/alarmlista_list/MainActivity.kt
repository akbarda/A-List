package com.maderaiindra.alarmlista_list

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ic_logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.splash_in))     //Fungsi untuk melakukan splash in
        Handler().postDelayed({
            ic_logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.splash_out))  //Fungsi untuk melakukan splash out
            Handler().postDelayed({
                ic_logo.visibility = View.GONE                                                  //Fungsi saat animasi splash
                startActivity(Intent(this,DashboardActivity::class.java))
                finish()
            },500)      //Delay saat animasi splash
        },1500)         //Delay saat animasi akan selesai

    }
}