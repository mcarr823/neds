package dev.mcarr.neds.common.enums.racing

/**
 * A more granular categorization of a racing event.
 * */
enum class RacingCategory(val uuid: String) {
    ALL(""),
    GREYHOUND_RACING("9daef0d7-bf3c-4f50-921d-8e818c60fe61"),
    HARNESS_RACING("161d9be2-e909-4326-8c2c-35ed71fb460b"),
    HORSE_RACING("4a2788f8-e825-4d36-9894-efd4baf1cfae")
}