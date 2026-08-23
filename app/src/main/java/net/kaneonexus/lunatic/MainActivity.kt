package net.kaneonexus.lunatic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.kaneonexus.lunatic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.phaseNameText.text = "Test Phase"
        binding.illuminationText.text = "Test illumination"
        binding.gravIndexText.text = "Test grav index"
        binding.nextFullMoonText.text = "Test full moon"
        binding.dailyVibrationText.text = "Test vibration"
        binding.tarotCardText.text = "Test card"
        binding.tarotKeywordText.text = "Test keyword"
        binding.journalHistoryText.text = "Test history"
    }
}
