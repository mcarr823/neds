package dev.mcarr.neds.common.enums.http

/**
 * Type of API endpoint being targeted by a request.
 *
 * Currently only supports REST APIs.
 * */
enum class ApiType(val value: String){
    REST("rest")
}