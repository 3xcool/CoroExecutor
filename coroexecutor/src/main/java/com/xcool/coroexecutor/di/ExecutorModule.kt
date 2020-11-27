package com.xcool.coroexecutor.di


import com.xcool.coroexecutor.core.Executor
import com.xcool.coroexecutor.core.ExecutorImpl
import com.xcool.coroexecutor.core.concurrent.ConcurrentExecutor
import com.xcool.coroexecutor.core.concurrent.ConcurrentExecutorImpl
import com.xcool.coroexecutor.core.conflated.ConflatedExecutor
import com.xcool.coroexecutor.core.conflated.ConflatedExecutorImpl
import com.xcool.coroexecutor.core.queue.QueueExecutor
import com.xcool.coroexecutor.core.queue.QueueExecutorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent



@Module
@InstallIn(ApplicationComponent::class)
abstract class ExecutorModule {
    
    
    @Binds
    abstract fun bindExecutor(executor: ExecutorImpl): Executor

    @Binds
    abstract fun bindConcurrentExecutor(executor: ConcurrentExecutorImpl): ConcurrentExecutor

    @Binds
    abstract fun bindQueueExecutor(executor: QueueExecutorImpl): QueueExecutor

    @Binds
    abstract fun bindConflatedExecutor(executor: ConflatedExecutorImpl): ConflatedExecutor
}
