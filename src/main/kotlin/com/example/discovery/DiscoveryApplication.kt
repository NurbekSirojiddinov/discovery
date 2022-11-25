package com.example.discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DiscoveryApplication

fun main(args: Array<String>) {
	runApplication<DiscoveryApplication>(*args)
}
