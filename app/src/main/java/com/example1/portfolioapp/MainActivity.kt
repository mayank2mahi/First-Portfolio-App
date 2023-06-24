package com.example1.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btnSkills)

        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillActivity::class.java)
            startActivity(intent)
        }

        val buttonEducation = findViewById<Button>(R.id.btnEdu)

        buttonEducation.setOnClickListener {
            intent = Intent(this, EduActivity::class.java)
            startActivity(intent)
        }

        val buttonExperience = findViewById<Button>(R.id.btnExp)

        buttonExperience.setOnClickListener {
            intent = Intent(this, ExpActivity::class.java)
            startActivity(intent)
        }

        val buttonProjects = findViewById<Button>(R.id.btnProj)

        buttonProjects.setOnClickListener {
            intent = Intent(this, ProjActivity::class.java)
            startActivity(intent)
        }
    }
}