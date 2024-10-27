package dev.mcarr.neds.common.enums.racing

/**
 * The type of function which the server should be running
 * in response to this request.
 *
 * Currently only supports the nextraces event.
 *
 * May be set to UNSPECIFIED if unknown or irrelevant
 * for the given URL.
 * */
enum class RacingMethod(val value: String) {
    UNSPECIFIED(""),
    NEXT_RACES("nextraces")
}