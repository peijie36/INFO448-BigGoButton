package edu.uw.ischool.peijie36.biggobutton

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bigGoBtn = findViewById<Button>(R.id.big_go_btn)

        bigGoBtn.setOnClickListener(View.OnClickListener {
            count += 1
            if (count > 1) {
                bigGoBtn.setText("You have pushed me $count times")
            } else {
                bigGoBtn.setText("You have pushed me $count time")
            }
            //bigGoBtn.setBackgroundColor(Color.parseColor("#FFFFFF"))
            bigGoBtn.setBackgroundColor(Color.parseColor(generateRandomHexCode()))
            bigGoBtn.setTextColor(Color.parseColor(generateRandomHexCode()))
        })
    }

    private fun generateRandomHexCode(): String {
        val random = Random.Default
        val color = random.nextInt(0xFFFFFF + 1)
        return String.format("#%06X", color)
    }

}