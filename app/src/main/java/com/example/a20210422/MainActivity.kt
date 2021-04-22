package com.example.a20210422

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Btn.setOnClickListener {

            val id = edtId.text.toString()
            val password = edtPassword.text.toString()

            if (id == "sohee@naver.com" && password == "0428") {
                Toast.makeText(this, "권소희 관리자입니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }
    }
}