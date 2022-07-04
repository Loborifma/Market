package com.market.data.models.network

import com.market.R

class ProductMainInfoNetwork(val mainId: Long = 0,
                      val mainName: String = "Name",
                      val mainCost: String = "Cost",
                      val mainImage: Int = R.drawable.ic_launcher_background,
                      val productDescriptionInfoNetwork: ProductDescriptionInfoNetwork = ProductDescriptionInfoNetwork()
)
