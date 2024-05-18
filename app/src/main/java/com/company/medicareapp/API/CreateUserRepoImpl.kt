package com.company.medicareapp.API

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CreateUserRepoImpl(
    private val api : API_Builder
): CreateUserRepo {
    override suspend fun createUser(): Flow<Result<UserCreateResponse>> {
        return flow {
            val userCreateResponse = try {
                api.createUser("joy",
                    "123456",
                    "ashulia",
                    "joy@gmail.com",
                    "01885485834",
                    "1234"
                )
            } catch (e: Exception){
                emit(Result.Error(message = e.localizedMessage.toString()))
                return@flow
            }

            emit(Result.Success(userCreateResponse))

        }
    }
}