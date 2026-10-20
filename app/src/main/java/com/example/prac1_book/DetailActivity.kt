package com.example.prac1_book
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class DetailActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "DetailActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.d(TAG, "onCreate")

        val title = intent.getStringExtra("EXTRA_TITLE") ?: "—"
        val author = intent.getStringExtra("EXTRA_AUTHOR") ?: "—"
        val pages = intent.getStringExtra("EXTRA_PAGES") ?: "0"
        val review = intent.getStringExtra("EXTRA_REVIEW") ?: "—"

        findViewById<TextView>(R.id.tvDetailTitle).text = title
        findViewById<TextView>(R.id.tvDetailAuthor).text = "Автор: $author"
        findViewById<TextView>(R.id.tvDetailPages).text = "Страниц: $pages"
        findViewById<TextView>(R.id.tvDetailReview).text = "Отзыв:\n$review"

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
    override fun onStart()   { super.onStart();   Log.d(TAG, "onStart") }
    override fun onResume()  { super.onResume();  Log.d(TAG, "onResume") }
    override fun onPause()   { super.onPause();   Log.d(TAG, "onPause") }
    override fun onStop()    { super.onStop();    Log.d(TAG, "onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy") }
}