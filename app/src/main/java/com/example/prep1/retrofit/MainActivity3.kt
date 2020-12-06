package com.example.prep1.retrofit

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.prep1.R
import com.example.prep1.room.MainActivity
import kotlinx.android.synthetic.main.activity_main3.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity3 : AppCompatActivity() {

    val Tag= MainActivity::class.java.simpleName
    val API_KEY="44fdaf458edcffe2c38b7102a6bbe11c"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        clickMe.setOnClickListener {
            listCall()
        }
    }


    fun listCall(){
        myProgressBar.visibility= View.VISIBLE
        var apiInterface=ApiClient.retrofit!!.create(ApiInterface::class.java)
        var call=apiInterface.getTopRatedMovies(API_KEY)
        call.enqueue(object: Callback<MoviesResponse>{

            override fun onResponse(call: Call<MoviesResponse>, response: Response<MoviesResponse>) {
                myProgressBar.visibility= View.GONE
                if (response.isSuccessful){
                    var list=response.body()!!.results
                    if (list!=null && list.size>0){

                    }

                    Toast.makeText(this@MainActivity3,"Api success",Toast.LENGTH_SHORT).show()
                }

            }

            override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
                myProgressBar.visibility= View.GONE
                Toast.makeText(this@MainActivity3,"Api Fail",Toast.LENGTH_SHORT).show()
            }
        })
    }
}