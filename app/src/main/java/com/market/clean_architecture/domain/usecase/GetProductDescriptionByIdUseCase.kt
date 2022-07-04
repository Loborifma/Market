package com.market.clean_architecture.domain.usecase

import com.market.clean_architecture.data.models.network.ProductMainInfo

class GetProductDescriptionByIdUseCase {
    fun execute(product: ProductMainInfo): String{
        return product.productDescriptionInfo.description
    }
}