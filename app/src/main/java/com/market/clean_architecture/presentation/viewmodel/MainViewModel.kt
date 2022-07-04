package com.market.clean_architecture.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.market.clean_architecture.domain.adapters.MainInfoRecyclerViewAdapter
import com.market.clean_architecture.domain.models.ProductMainInfo
import com.market.clean_architecture.domain.usecase.FindProductByNameUseCase
import com.market.clean_architecture.domain.usecase.GetProductsByPageUseCase

class MainViewModel(private val findProductByNameUseCase: FindProductByNameUseCase,
                    private val getProductsImagesByPageUseCase: GetProductsByPageUseCase
                    ) : ViewModel(){

    fun search(searchString: String, listOfProducts: MutableList<ProductMainInfo>,
               mAdapter: MainInfoRecyclerViewAdapter){
        findProductByNameUseCase.execute(searchString, listOfProducts, mAdapter)
    }

}