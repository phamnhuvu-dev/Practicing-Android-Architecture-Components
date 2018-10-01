package com.phamnhuvu.data_binding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  private lateinit var mEditText: EditText
  private lateinit var mTextView: TextView

  private lateinit var mText: String

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    mEditText = findViewById(R.id.editText)
    mEditText.addTextChangedListener(object :TextWatcher {
      override fun afterTextChanged(s: Editable?) {
         //To change body of created functions use File | Settings | File Templates.
      }

      override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
         //To change body of created functions use File | Settings | File Templates.
      }

      override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        mText = s.toString()
      }
    })
    mText = mEditText.text.toString()

    mTextView = findViewById<TextView>(R.id.textView).apply {
      text = mText
    }
  }
}
