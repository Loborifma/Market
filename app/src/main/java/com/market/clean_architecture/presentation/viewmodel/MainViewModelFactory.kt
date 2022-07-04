package com.market.clean_architecture.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.market.clean_architecture.domain.usecase.FindProductByNameUseCase
import com.market.clean_architecture.domain.usecase.GetProductsByPageUseCase

class MainViewModelFactory : ViewModelProvider.Factory {

    private val findProductByNameUseCase = FindProductByNameUseCase()

    private val getProductsImagesByPageUseCase = GetProductsByPageUseCase()

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(findProductByNameUseCase = findProductByNameUseCase,
            getProductsImagesByPageUseCase = getProductsImagesByPageUseCase) as T
    }
}