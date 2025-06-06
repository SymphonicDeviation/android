package com.bitwarden.network.core

import com.bitwarden.network.model.NetworkResult
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * A [retrofit2.CallAdapter.Factory] for wrapping network requests into [NetworkResult].
 */
internal class NetworkResultCallAdapterFactory : CallAdapter.Factory() {
    override fun get(
        returnType: Type,
        annotations: Array<out Annotation>,
        retrofit: Retrofit,
    ): CallAdapter<*, *>? {
        check(returnType is ParameterizedType) { "$returnType must be parameterized" }
        val containerType = getParameterUpperBound(0, returnType)

        if (getRawType(containerType) != NetworkResult::class.java) return null
        check(containerType is ParameterizedType) { "$containerType must be parameterized" }

        val requestType = getParameterUpperBound(0, containerType)

        return if (getRawType(returnType) == Call::class.java) {
            NetworkResultCallAdapter<Any>(successType = requestType)
        } else {
            null
        }
    }
}
