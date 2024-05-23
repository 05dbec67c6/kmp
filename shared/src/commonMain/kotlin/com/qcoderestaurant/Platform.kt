package com.qcoderestaurant

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform