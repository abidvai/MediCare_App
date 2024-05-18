package com.company.medicareapp.API

import kotlinx.coroutines.flow.Flow

interface CreateUserRepo {

    suspend fun createUser(): Flow<Result<UserCreateResponse>>
}