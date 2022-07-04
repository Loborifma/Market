package com.market.clean_architecture.domain.usecase

import com.market.clean_architecture.data.models.network.ProductMainInfo

class GetProductDescriptionImagesByIdUseCase {
    fun execute(product: ProductMainInfo): List<Int>{
        return product.productDescriptionInfo.descImages
    }
}