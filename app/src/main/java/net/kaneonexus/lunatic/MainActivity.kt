package net.kaneonexus.lunatic

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "LUNA-TIC is alive"
        tv.setTextColor(android.graphics.Color.CYAN)
        tv.textSize = 24f
        setContentView(tv)
    }
}
