package com.market.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.market.domain.adapters.MainInfoRecyclerViewAdapter
import com.market.domain.models.ProductMainInfo
import com.market.domain.usecase.FindProductByNameUseCase
import com.market.domain.usecase.GetProductsByPageUseCase

class MainViewModel(private val findProductByNameUseCase: FindProductByNameUseCase,
                    private val getProductsImagesByPageUseCase: GetProductsByPageUseCase
                    ) : ViewModel(){

    fun search(searchString: String, listOfProducts: MutableList<ProductMainInfo>,
               mAdapter: MainInfoRecyclerViewAdapter){
        findProductByNameUseCase.execute(searchString, listOfProducts, mAdapter)
    }

}