package com.xcool.coroexecutor.core


//Erick Sumargo: https://proandroiddev.com/coroutine-task-executor-916febd5c460
interface Executor {

    suspend fun <T> execute(
      schema: ExecutorSchema,
      block: suspend () -> T
    ): T
}
