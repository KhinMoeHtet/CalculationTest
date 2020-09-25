package com.example.calculateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.calculateapp.viewmodel.AddViewModel
import com.example.calculateapp.viewmodel.DivViewModel
import com.example.calculateapp.viewmodel.MinusViewModel
import com.example.calculateapp.viewmodel.MultipleViewModel
import kotlinx.android.synthetic.main.activity_view_model.*

class ViewModelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        var addViewModel=ViewModelProvider(this)
            .get(AddViewModel::class.java)
        var minusViewModel=ViewModelProvider(this)
            .get(MinusViewModel::class.java)
        var multipleViewModel=ViewModelProvider(this)
            .get(MultipleViewModel::class.java)
        var divViewModel=ViewModelProvider(this)
            .get(DivViewModel::class.java)



        btnAdd.setOnClickListener{
            var nOne=txt_input_one.text.toString().toInt()
            var nTwo=txt_input_two.text.toString().toInt()
            addViewModel.setAdd(nOne,nTwo)
            txtResult.text=addViewModel.getAdd().toString()
        }
        btnMinus.setOnClickListener{
            var nOne=txt_input_one.text.toString().toInt()
            var nTwo=txt_input_two.text.toString().toInt()
            minusViewModel.setMinus(nOne,nTwo)
            txtResult.text=minusViewModel.getMinus().toString()
        }
        btnMultiple.setOnClickListener{
            var nOne=txt_input_one.text.toString().toInt()
            var nTwo=txt_input_two.text.toString().toInt()
            multipleViewModel.setMultiple(nOne,nTwo)
            txtResult.text=multipleViewModel.getMultiple().toString()
        }
        btnDiv.setOnClickListener{
            var nOne=txt_input_one.text.toString().toInt()
            var nTwo=txt_input_two.text.toString().toInt()
            divViewModel.setDiv(nOne,nTwo)
            txtResult.text=divViewModel.getDiv().toString()
        }



    }
}