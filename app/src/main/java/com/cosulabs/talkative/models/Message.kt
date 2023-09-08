package com.cosulabs.talkative.models

import java.sql.Time

data class Message(
    val text : String,
    val user : String,
    val time : Time
) {
}