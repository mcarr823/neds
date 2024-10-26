package dev.mcarr.neds.common.enums.http

/**
 * The host domain of the target API.
 *
 * Currently only supports the api.neds.com.au endpoint.
 * This may be expanded if other countries are targeted
 * in the future. eg. If NZ domains are used.
 * */
enum class ApiHost(val value: String){
    NEDS_AU_API("api.neds.com.au")
}