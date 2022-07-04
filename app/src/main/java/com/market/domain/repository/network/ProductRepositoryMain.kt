package com.market.domain.repository.network

import com.market.data.models.network.ProductMainInfo

interface ProductRepositoryMain {

    fun getProductsImagesMain(): List<ProductMainInfo>

}