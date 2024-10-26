package dev.mcarr.neds.common.enums.http

/**
 * The type of event being targeted by a request.
 *
 * Currently only supports the racing event type.
 *
 * May be set to UNSPECIFIED if unknown or irrelevant
 * for the given URL.
 * */
enum class EventType(val value: String) {
    UNSPECIFIED(""),
    RACING("racing")
}