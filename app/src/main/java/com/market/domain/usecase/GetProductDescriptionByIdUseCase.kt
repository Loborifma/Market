package com.market.domain.usecase

import com.market.data.models.network.ProductMainInfo

class GetProductDescriptionByIdUseCase {
    fun execute(product: ProductMainInfo): String{
        return product.productDescriptionInfo.description
    }
}