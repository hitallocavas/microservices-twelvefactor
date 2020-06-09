package br.ufpe.cin.microservices.twelvefactor.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "credentials")
class CredentialProperties {
    lateinit var user: String
    lateinit var pass: String
}