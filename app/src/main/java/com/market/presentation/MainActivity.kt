package com.market.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageButton
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.market.R
import com.market.domain.models.ProductMainInfo
import com.market.domain.adapters.MainInfoRecyclerViewAdapter
import com.market.presentation.viewmodel.MainViewModel
import com.market.presentation.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity(){

    private val TAG = "myLogs"

    private lateinit var products: MutableList<ProductMainInfo>
    private lateinit var mAdapter: MainInfoRecyclerViewAdapter
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, MainViewModelFactory())[MainViewModel::class.java]

        createListOfProducts()
        setupRecyclerView()

        val etSearch = findViewById<EditText>(R.id.et_search)
        val btnSearch = findViewById<ImageButton>(R.id.btn_search)

        etSearch.addTextChangedListener { text -> viewModel.search(text.toString(), products, mAdapter) }

//        btnSearch.setOnClickListener { viewModel.search(etSearch.text.toString(), products) }
    }

    private fun filter(text: String){
        val filteredList = mutableListOf<ProductMainInfo>()

        for(product in products){
            if(product.name.startsWith(text, true)){
                filteredList.add(product)
            }
        }

        mAdapter.filterList(filteredList)
    }

    private fun createListOfProducts(){
            products = mutableListOf(
                ProductMainInfo(), ProductMainInfo(id = 1, name = "One"),
            ProductMainInfo(id = 2, name = "Two"), ProductMainInfo(id = 3, name = "Three"), ProductMainInfo(id = 4, name = "Four"),
            ProductMainInfo(id = 5, name = "Five"), ProductMainInfo(id = 6, name = "Six"), ProductMainInfo(id = 7, name = "Seven"),
            ProductMainInfo(id = 8, name = "Eight"), ProductMainInfo(id = 9, name = "Nine"), ProductMainInfo(id = 10, name = "Ten"),
            ProductMainInfo(id = 11, name = "Eleven"), ProductMainInfo(id = 12, name = "Twelve"), ProductMainInfo(id = 13, name = "Thirteen")
            )
    }

    private fun setupRecyclerView(){
        Log.d(TAG, "setupRecyclerView: ")
        val rwMainScreen = findViewById<RecyclerView>(R.id.rw_main_screen)
        GridLayoutManager(applicationContext, 3).apply { rwMainScreen.layoutManager = this }
        mAdapter = MainInfoRecyclerViewAdapter(products)
        rwMainScreen.adapter = mAdapter
    }
}