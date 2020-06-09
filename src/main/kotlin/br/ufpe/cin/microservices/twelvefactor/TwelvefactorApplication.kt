package br.ufpe.cin.microservices.twelvefactor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TwelvefactorApplication

fun main(args: Array<String>) {
	runApplication<TwelvefactorApplication>(*args)
}
