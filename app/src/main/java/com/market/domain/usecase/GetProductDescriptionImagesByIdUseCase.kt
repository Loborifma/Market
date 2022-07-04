package com.market.domain.usecase

import com.market.data.models.network.ProductMainInfo

class GetProductDescriptionImagesByIdUseCase {
    fun execute(product: ProductMainInfo): List<Int>{
        return product.productDescriptionInfo.descImages
    }
}