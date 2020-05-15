package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
//    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the Button view from the layout and assign a click
        // listener to it.
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val clearButton:Button=findViewById(R.id.button)
        clearButton.setOnClickListener { clear() }
        diceImage = findViewById(R.id.dice_image)
//        diceImage2 = findViewById(R.id.dice_image2)
    }
    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

//    Function for the clear button
    private fun clear(){
    diceImage.setImageResource(R.drawable.empty_dice)
}

//    override fun onCreate(savedInstanceState: Bundle?) {
//        lateinit var diceImage:ImageView
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        diceImage = findViewById(R.id.dice_image)
//        val rollButton: Button = findViewById(R.id.roll_button)
//        rollButton.setOnClickListener{rollDice()
//        }
////        val countButton:Button=findViewById(R.id.button)
////        countButton.setOnClickListener { countButton() }
//    }
//    private fun rollDice(){
////        Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
////        val resultText:TextView=findViewById(R.id.textView)
//        val diceImage:ImageView=findViewById(R.id.dice_image)
//        val diceImage2:ImageView=findViewById(R.id.dice_image2)
//        val randInt=(1..6).random()
//        val drawableResource = when (randInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        diceImage.setImageResource(drawableResource)
//        val randInt2=(1..6).random()
//        val drawableResource2 = when (randInt2) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        diceImage2.setImageResource(drawableResource2)
////        val randInt=(1..6).random()
////        resultText.text=randInt.toString()
//    }
private fun rollDice() {
    diceImage.setImageResource(getRandomDiceImage())
//    diceImage2.setImageResource(getRandomDiceImage())
}

//    The double dice challenge can be done either by using two different functions or by using different variables in a single function
//    private fun getRandomDiceImage() {
//        val diceImage:ImageView=findViewById(R.id.dice_image2)
//        val randInt=(1..6).random()
//        val drawableResource = when (randInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        diceImage.setImageResource(drawableResource)
//    }
//    private fun countButton(){
//        val resultText:TextView=findViewById(R.id.textView)
//        val buttonText:Button=findViewById(R.id.button)
//        if(resultText.text=="Chaliye Shuru karte hai!"){
//            buttonText.text= '1'.toString()
//        }else if(resultText.text=="6"){
//            buttonText.text='6'.toString()
//        }else{
//            var resultInt=resultText.text.toString().toInt()
//            resultInt++;
//            buttonText.text= resultInt.toString()
//        }
//    }
}
