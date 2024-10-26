package dev.mcarr.neds.common.enums.http

/**
 * Version number of the target API endpoint.
 *
 * Currently only V1 is supported, but others may
 * be added if newer versions of a given API become
 * available in the future.
 * */
enum class ApiVersion(val value: String){
    V1("v1")
}