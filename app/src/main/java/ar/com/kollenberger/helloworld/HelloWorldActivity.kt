package ar.com.kollenberger.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class HelloWorldActivity : AppCompatActivity() {

    lateinit private var setButton : Button
    lateinit private var resetButton : Button
    lateinit private var customText : String
    lateinit private var textOutput : TextView
    lateinit private var textInput : EditText
    private val defaultText = "Hello World!"

    private fun doStuff() {
        customText = defaultText
        setButton = findViewById(R.id.setButton)
        resetButton = findViewById(R.id.resetButton)
        textOutput = findViewById(R.id.textOutput)
        textInput = findViewById(R.id.textInput)

        setButton.setOnClickListener {
            textOutput.setText(customText)
        }
        resetButton.setOnClickListener {
            customText = defaultText
            textInput.setText("")
            textOutput.setText(customText)
        }
        textInput.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
//                TODO("not implemented")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                TODO("not implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                customText = s.toString()
            }
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
        doStuff()
    }
}
