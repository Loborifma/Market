package com.market.data.storage

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.market.data.models.storage.ProductMainInfoStorage

@Dao
interface ProductDao {

    @Insert(onConflict = REPLACE)
    fun insertProduct(product: ProductMainInfoStorage)

    @Insert(onConflict = REPLACE)
    fun insertProducts(products: List<ProductMainInfoStorage>)

    @Delete
    fun deleteProduct(product: ProductMainInfoStorage)

    @Query("SELECT image, name, cost FROM products")
    fun getAllProducts(): LiveData<List<ProductMainInfoStorage>>



}