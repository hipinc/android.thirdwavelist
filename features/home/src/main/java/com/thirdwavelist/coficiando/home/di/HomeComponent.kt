package com.thirdwavelist.coficiando.home.di

import com.thirdwavelist.coficiando.core.di.CoreComponent
import dagger.Component

@Component(dependencies = [CoreComponent::class], modules = [HomeModule::class])
interface HomeComponent