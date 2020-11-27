package com.xcool.coroexecutorapp.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Really simple Coroutine Executor based on Erick Sumargo Tutorial
//https://proandroiddev.com/coroutine-task-executor-916febd5c460
//https://github.com/ErickSumargo/Executor-Demo

@HiltAndroidApp
class MyApp :Application()