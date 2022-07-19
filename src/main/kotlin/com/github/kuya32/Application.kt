package com.github.kuya32

import com.github.kuya32.di.mainModule
import io.ktor.server.application.*
import com.github.kuya32.plugins.*
import org.koin.ktor.plugin.Koin

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
//    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureHTTP()
    configureSecurity()
    install(Koin) {
        modules(mainModule)
    }
}
