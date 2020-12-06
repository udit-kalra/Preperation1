package com.example.prep1.normalViews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.prep1.R
import kotlinx.android.synthetic.main.activity_main5.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity5 : AppCompatActivity() {

    var country= arrayOf("One","two","three")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var spinAdapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,country)
        mySpinner.adapter=spinAdapter
        mySpinner.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MainActivity5,"nothing selected", Toast.LENGTH_SHORT).show()
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               Toast.makeText(this@MainActivity5,country.get(position), Toast.LENGTH_SHORT).show()
            }
        }

        myCheckbox.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                Toast.makeText(this@MainActivity5,"yes checked", Toast.LENGTH_SHORT).show()
            }
        })

        myRadioGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {

            }
        })

        /////////////////////////////////////////date//////////////////////////
        var timeStampFormat=SimpleDateFormat("yyyy-MM-dd HH:mm:ss ")
        var date= Date()
        var dateStr=timeStampFormat.format(date)

        var cal=Calendar.getInstance()
        var dateStr2=timeStampFormat.format(cal.time)
    }
}