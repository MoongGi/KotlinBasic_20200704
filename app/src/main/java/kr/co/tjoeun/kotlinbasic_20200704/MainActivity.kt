package kr.co.tjoeun.kotlinbasic_20200704

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        applyBtn.setOnClickListener {
            // inputEdt 에 입력된 내용을(text 속성의 값) 받아와서
            // resultTxt 의 내용(text 속성의 값) 으로 반영

            val inputContent = inputEdt.text.toString()

            resultTxt.text = inputContent
        }

        touchBtn.setOnClickListener {
            //터치 버튼이 눌리면 실행
            //
            Toast.makeText(this, "dd", Toast.LENGTH_SHORT).show()
            Log.d("메인화면","버튼눌림")
            Log.e("메인화면","에러 찍을때 사용 ")

            val num = 23
            num.toString()

            when (num)
            {
                10 -> {
                    Log.d ("값", "10이다 : "+num)
                }
                15 -> {
                    Log.d ("값", "15이다 : "+num)
                }
                17,18,19 -> {
                    Log.d ("값", "17,18,19 이다 : "+num)
                }
                in 20..29 -> {
                    Log.d ("값", "20 부터 29 이다 : "+num)
                }
                else -> {
                    Log.d ("값", "그 외 숫자이다 : "+num)
                }
            }
        }
    }
}
