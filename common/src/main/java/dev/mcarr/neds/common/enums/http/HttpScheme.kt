package dev.mcarr.neds.common.enums.http

/**
 * URL scheme of the request being constructed.
 *
 * Currently all requests must be HTTPS, but this
 * could be expanded to support regular HTTP, FTP,
 * or other such schemes if needed in the future.
 * */
enum class HttpScheme(val value: String){
    HTTPS("https")
}