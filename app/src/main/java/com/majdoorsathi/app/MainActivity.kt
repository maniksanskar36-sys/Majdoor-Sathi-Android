
package com.majdoorsathi.app

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.rgb(7, 27, 53))

        val title = TextView(this)
        title.text = "मजदूर साथी"
        title.textSize = 30f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "मजदूर और काम देने वालों का अपना मंच"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.WHITE)
        subtitle.gravity = Gravity.CENTER

        val worker = Button(this)
        worker.text = "मजदूर रजिस्ट्रेशन"

        val employer = Button(this)
        employer.text = "मालिक रजिस्ट्रेशन"

        val jobs = Button(this)
        jobs.text = "काम खोजें"

        val post = Button(this)
        post.text = "काम पोस्ट करें"

        val helpline = Button(this)
        helpline.text = "हेल्पलाइन: 6267211174"

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(worker)
        layout.addView(employer)
        layout.addView(jobs)
        layout.addView(post)
        layout.addView(helpline)

        setContentView(layout)
    }
}
