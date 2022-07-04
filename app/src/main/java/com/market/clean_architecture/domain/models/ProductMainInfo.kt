package com.market.clean_architecture.domain.models

import com.market.R

data class ProductMainInfo(val id: Long = 0,
                      val name: String = "Name",
                      val cost: String = "Cost",
                      val image: Int = R.drawable.ic_launcher_background,
                      val productDescriptionInfo: ProductDescriptionInfo = ProductDescriptionInfo()
)
