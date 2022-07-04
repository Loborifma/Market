package com.market.domain.models

import com.market.R
import com.market.data.models.network.ProductDescriptionInfo

data class ProductMainInfo(val id: Long = 0,
                      val name: String = "Name",
                      val cost: String = "Cost",
                      val image: Int = R.drawable.ic_launcher_background,
                      val productDescriptionInfo: ProductDescriptionInfo = ProductDescriptionInfo()
)
