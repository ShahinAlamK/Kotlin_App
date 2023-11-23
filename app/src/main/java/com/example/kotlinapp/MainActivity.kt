package com.example.kotlinapp
import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var snackBtn : Button
    private lateinit var toastBtn : Button
    private lateinit var dialogBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        snackBtn = findViewById(R.id.snack_id)
        toastBtn = findViewById(R.id.toast_id)
        dialogBtn = findViewById(R.id.dialog_Id)

        snackBtn.setOnClickListener {
            Snackbar.make(it,"Hello Kotlin Developer",Snackbar.LENGTH_SHORT)
                .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_FADE)
                .show()
        }

        toastBtn.setOnClickListener {
            Toast.makeText(this,"Hello Kotlin Developer",Toast.LENGTH_SHORT)
                .show()
        }

        dialogBtn.setOnClickListener {
            val dialog=AlertDialog.Builder(this)
            dialog.setTitle("Are you Developer")
            dialog.setMessage("Yes i'm kotlin developer")
            dialog.setPositiveButton("Yes"){exite, which->
                Toast.makeText(this,"Hello Kotlin Developer",Toast.LENGTH_SHORT).show()}
            dialog.setNegativeButton("Cancel"){exite, which->
                Toast.makeText(this,"Hello Kotlin Developer",Toast.LENGTH_SHORT).show()}

            val builDialog : AlertDialog= dialog.create()
            builDialog.show()
        }


    }
}