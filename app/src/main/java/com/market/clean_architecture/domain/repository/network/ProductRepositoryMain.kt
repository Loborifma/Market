package com.market.clean_architecture.domain.repository.network

import com.market.clean_architecture.data.models.network.ProductMainInfo

interface ProductRepositoryMain {

    fun getProductsImagesMain(): List<ProductMainInfo>

}