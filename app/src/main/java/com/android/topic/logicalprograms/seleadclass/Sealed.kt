package com.android.topic.logicalprograms.seleadclass

sealed class Result() {

    data class Loading(val isShow: Boolean) : Result()
    data class Error(val errorMessage: String) : Result()
    data class Success(val response: String) : Result()
}

fun main() {

    val error = Result.Error(errorMessage = "Something went wrong")
    val success = Result.Success(response = "Response get successfully")
    val loading = Result.Loading(isShow = true)

    checkResult(success)
}

fun checkResult(result: Result) {
    when (result) {

        is Result.Loading -> {
            println("is loader ${result.isShow}")
        }

        is Result.Success -> {
            println("Response is ${result.response}")
        }

        is Result.Error -> {
            println("Message : ${result.errorMessage}")
        }
    }
}

/*

-> Sealed is more flexible then Enum class but still have some restriction
-> By default sealed class is abstract cass so we can't create object of it.
-> Within sealed class we can create its sub classes
-> Also create sub class out of sealed class but within same file
-> We can add different types of properties for our sub classes
-> Sealed class can have regular classes and also can have data class
-> We can also have Object declaration in sealed class which inherit sealed class
-> We can also create another sealed class inside sealed class (nested sealed class)
-> we can also define sealed interface within sealed class
-> We can create when condition for check object type of a sealed class
-> Can have hierarchy and support inheritance

=> We can use it for

- Manage Ui State
- Result of API Response
- Error handling

=> When to use Sealed Class?
- API result: Success, Failure, Loading
- UI states: Empty, Success(data), Error(msg), Loading
- Error handling: NetworkError, TimeoutError, UnknownError

=> Example
sealed class UiState
data class Success(val data: String) : UiState()
data class Error(val message: String) : UiState()
object Loading : UiState()


*/