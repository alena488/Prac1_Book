package com.example.prac1_book
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

        val btnAddScreen = findViewById<Button>(R.id.btnAddScreen)
        val cardBook1 = findViewById<LinearLayout>(R.id.cardBook1)

        btnAddScreen.setOnClickListener {
            val intent = Intent(this, NewBookActivity::class.java)
            startActivity(intent)
        }
        cardBook1.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("EXTRA_TITLE", "Гордость и предубеждение")
            intent.putExtra("EXTRA_AUTHOR", "Джейн Остин")
            intent.putExtra("EXTRA_PAGES", "432")
            intent.putExtra("EXTRA_REVIEW", "Прекрасный роман о любви и предрассудках!")
            startActivity(intent)
        }
    }
    override fun onStart()   { super.onStart();   Log.d(TAG, "onStart") }
    override fun onResume()  { super.onResume();  Log.d(TAG, "onResume") }
    override fun onPause()   { super.onPause();   Log.d(TAG, "onPause") }
    override fun onStop()    { super.onStop();    Log.d(TAG, "onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy") }
}