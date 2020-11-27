package com.xcool.coroexecutor.core


sealed class ExecutorSchema {

    object Conflated : ExecutorSchema()

    object Queue : ExecutorSchema()

    object Concurrent : ExecutorSchema()
}
