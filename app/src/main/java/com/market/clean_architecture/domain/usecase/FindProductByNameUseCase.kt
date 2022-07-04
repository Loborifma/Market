package com.market.clean_architecture.domain.usecase

import com.market.clean_architecture.domain.adapters.MainInfoRecyclerViewAdapter
import com.market.clean_architecture.domain.models.ProductMainInfo

class FindProductByNameUseCase {

    private val TAG = "myLogs"
    
    fun execute(
        searchString: String, listOfProducts: MutableList<ProductMainInfo>,
        mAdapter: MainInfoRecyclerViewAdapter){
        val filteredList = mutableListOf<ProductMainInfo>()

        for(product in listOfProducts){
            if(product.name.startsWith(searchString, true)){
                filteredList.add(product)
            }
        }

        mAdapter.filterList(filteredList)
    }
}