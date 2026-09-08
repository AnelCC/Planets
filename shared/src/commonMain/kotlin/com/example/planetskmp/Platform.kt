package com.example.planetskmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform