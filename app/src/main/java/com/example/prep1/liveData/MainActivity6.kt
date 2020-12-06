package com.example.prep1.liveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prep1.R
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {

    lateinit var cartViewModel:CartViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        cartViewModel=ViewModelProvider(this).get(CartViewModel::class.java)
        var cartAdapter=CartAdapter(this,cartViewModel.itemList.value!!)
        myRecycleView.layoutManager=LinearLayoutManager(this)
        myRecycleView.adapter=cartAdapter

        cartViewModel.itemList.observe(this, Observer {myItemList->
            myItemList?.let {
                 cartAdapter.setItems(it)
            }
        })

    }

}