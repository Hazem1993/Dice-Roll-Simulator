package com.example.dicesimulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnExit :Button = findViewById(R.id.btnExit)
        val btnRoll :Button = findViewById(R.id.btnRoll)
        val diceImage :ImageView = findViewById(R.id.imgView)
        val txtView :TextView = findViewById(R.id.txtView)
        val rolldice = Dice()
        var test=0;
        btnRoll.setOnClickListener{
            test = rolldice.roll()
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
            if   (test ==1 ) {
                diceImage.setImageResource(R.drawable.dice_1)
            }

            else if (test ==2 ) {
                diceImage.setImageResource(R.drawable.dice_2)
            }
            else if (test ==3 ) {
                diceImage.setImageResource(R.drawable.dice_3)
            }

            else if (test ==4 ) {
                diceImage.setImageResource(R.drawable.dice_4)
            }

            else if (test ==5 ) {
                diceImage.setImageResource(R.drawable.dice_5)
            }

            else if (test ==6 ) {
                diceImage.setImageResource(R.drawable.dice_6)
            }

        }
        btnExit.setOnClickListener{
            finish()
        }
    }

}

class Dice {

    fun roll(): Int {
        var randomNumber  = 1..6
        return randomNumber.random()
    }
}
