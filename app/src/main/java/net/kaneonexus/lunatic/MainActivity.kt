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

        renderMoonState()

        binding.dailyVibrationText.text = "Test vibration"
        binding.tarotCardText.text = "Test card"
        binding.tarotKeywordText.text = "Test keyword"
        binding.journalHistoryText.text = "Test history"
    }

    private fun renderMoonState() {
        val moon = MoonEngine.currentState()
        binding.phaseNameText.text = moon.phaseName
        binding.illuminationText.text = "Illumination: ${moon.illuminationPct}%  ·  Age: %.1f days".format(moon.ageDays)
        binding.gravIndexText.text = "Gravitational Index: ${moon.gravitationalIndex}/100 — ${moon.gravitationalLabel}"

        val daysToFull = MoonEngine.daysUntilNextFullMoon()
        binding.nextFullMoonText.text = if (daysToFull == 0) "Full Moon is today"
            else "Next Full Moon in $daysToFull day(s)"
    }
}
