package com.xcool.coroexecutor.core


import com.xcool.coroexecutor.core.concurrent.ConcurrentExecutor
import com.xcool.coroexecutor.core.conflated.ConflatedExecutor
import com.xcool.coroexecutor.core.queue.QueueExecutor
import com.xcool.coroexecutor.core.ExecutorSchema.Concurrent
import com.xcool.coroexecutor.core.ExecutorSchema.Conflated
import com.xcool.coroexecutor.core.ExecutorSchema.Queue
import javax.inject.Inject



class ExecutorImpl @Inject constructor(
  conflatedExecutor: ConflatedExecutor,
  queueExecutor: QueueExecutor,
  concurrentExecutor: ConcurrentExecutor
) : Executor,
    ConflatedExecutor by conflatedExecutor,
    QueueExecutor by queueExecutor,
    ConcurrentExecutor by concurrentExecutor {

    override suspend fun <T> execute(
      schema: ExecutorSchema,
      block: suspend () -> T
    ): T {
        return when (schema) {
            is Conflated -> conflate(block)
            is Queue      -> enqueue(block)
            is Concurrent -> run(block)
        }
    }
}
