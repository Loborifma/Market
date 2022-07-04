package com.market.data.models.storage

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.market.R

@Entity(tableName = "products")
class ProductMainInfoStorage(@PrimaryKey(autoGenerate = true) val mainId: Long = 0,
                             @ColumnInfo(name = "name") val mainName: String = "Name",
                             @ColumnInfo(name = "cost") val mainCost: String = "Cost",
                             @ColumnInfo(name = "image") val mainImage: Int = R.drawable.ic_launcher_background,
                             @ColumnInfo(name = "description") val productDescriptionInfoStorage: ProductDescriptionInfoStorage = ProductDescriptionInfoStorage())
