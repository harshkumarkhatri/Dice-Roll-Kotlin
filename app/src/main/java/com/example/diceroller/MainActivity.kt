package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
        val countButton:Button=findViewById(R.id.button)
        countButton.setOnClickListener { countButton() }
    }
    private fun rollDice(){
//        Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
        val resultText:TextView=findViewById(R.id.textView)
        val randInt=(1..6).random()
        resultText.text=randInt.toString()
    }
    private fun countButton(){
        val resultText:TextView=findViewById(R.id.textView)
        val buttonText:Button=findViewById(R.id.button)
        if(resultText.text=="Chaliye Shuru karte hai!"){
            buttonText.text= '1'.toString()
        }else if(resultText.text=="6"){
            buttonText.text='6'.toString()
        }else{
            var resultInt=resultText.text.toString().toInt()
            resultInt++;
            buttonText.text= resultInt.toString()
        }
    }
}
