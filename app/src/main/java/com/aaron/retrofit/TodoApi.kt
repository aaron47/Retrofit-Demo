package com.aaron.retrofit

import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {
    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>

    // Body decorator parses the object into json for you
    // @POST("/todos/add")
    // suspend fun postTodo(@Body todo: Todo): Response<Todo>
}