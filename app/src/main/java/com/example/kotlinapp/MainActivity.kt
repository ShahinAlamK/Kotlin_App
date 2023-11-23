package com.example.kotlinapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var randomNmber : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.btn)
        val snack : TextView = findViewById(R.id.textId)

        snack.setOnClickListener{
            Snackbar.make(it,"Hello SnackBar",Snackbar.LENGTH_SHORT)
                .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_FADE)
                .show()
        }

        button.setOnClickListener {
            Toast.makeText(this,"Hello Kotlin $randomNmber",Toast.LENGTH_SHORT).show()
            textChange()
        }
    }

    private fun textChange(){
        randomNmber= Random.nextInt(10)+1
        val textView : TextView = findViewById(R.id.textId)
        textView.text = "Hello Kotlin Developer $randomNmber"
    }

}