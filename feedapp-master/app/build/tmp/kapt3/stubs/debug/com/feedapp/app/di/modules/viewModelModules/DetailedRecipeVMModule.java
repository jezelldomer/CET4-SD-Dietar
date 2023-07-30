package com.feedapp.app.di.modules.viewModelModules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/feedapp/app/di/modules/viewModelModules/DetailedRecipeVMModule;", "", "()V", "bindDetailedRecipeViewModel", "Landroidx/lifecycle/ViewModel;", "detailedRecipeViewModel", "Lcom/feedapp/app/viewModels/DetailedRecipeViewModel;", "bindDetailedRecipeViewModel$app_debug", "app_debug"})
@dagger.Module()
public abstract class DetailedRecipeVMModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.feedapp.app.di.other.ViewModelKey(value = com.feedapp.app.viewModels.DetailedRecipeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindDetailedRecipeViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.viewModels.DetailedRecipeViewModel detailedRecipeViewModel);
    
    public DetailedRecipeVMModule() {
        super();
    }
}