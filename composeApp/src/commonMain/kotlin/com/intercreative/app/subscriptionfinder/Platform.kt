package com.intercreative.app.subscriptionfinder

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform