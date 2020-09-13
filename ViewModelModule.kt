package com.onecosys.android.bitcoinnews.di.factory

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import com.onecosys.android.bitcoinnews.viewmodel.ArticleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(ArticleViewModel::class)
    internal abstract fun bindViewModel(viewModel: ArticleViewModel): AndroidViewModel

}
