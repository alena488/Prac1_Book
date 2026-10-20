package com.example.prac1_book
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
class NewBookActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "NewBookActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_book)
        Log.d(TAG, "onCreate")

        val etTitleInput = findViewById<EditText>(R.id.etTitleInput)
        val etAuthorInput = findViewById<EditText>(R.id.etAuthorInput)
        val etPagesInput = findViewById<EditText>(R.id.etPagesInput)
        val etReviewInput = findViewById<EditText>(R.id.etReviewInput)
        val btnSaveBook = findViewById<Button>(R.id.btnSaveBook)

        btnSaveBook.setOnClickListener {
            val title = etTitleInput.text.toString()
            val author = etAuthorInput.text.toString()
            val pages = etPagesInput.text.toString()
            val review = etReviewInput.text.toString()

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("EXTRA_TITLE", title.ifEmpty { "Без названия" })
            intent.putExtra("EXTRA_AUTHOR", author.ifEmpty { "Неизвестен" })
            intent.putExtra("EXTRA_PAGES", pages.ifEmpty { "0" })
            intent.putExtra("EXTRA_REVIEW", review.ifEmpty { "Без отзыва" })
            startActivity(intent)
        }
    }
    override fun onStart()   { super.onStart();   Log.d(TAG, "onStart") }
    override fun onResume()  { super.onResume();  Log.d(TAG, "onResume") }
    override fun onPause()   { super.onPause();   Log.d(TAG, "onPause") }
    override fun onStop()    { super.onStop();    Log.d(TAG, "onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy") }
}