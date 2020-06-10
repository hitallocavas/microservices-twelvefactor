package br.ufpe.cin.microservices.twelvefactor.controller

import br.ufpe.cin.microservices.twelvefactor.config.CredentialProperties
import br.ufpe.cin.microservices.twelvefactor.model.LoginDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class LoginController(@Autowired private val credentialProperties: CredentialProperties) {

    @PostMapping
    fun login(@RequestBody loginDTO: LoginDTO): String {
        when (loginDTO.username == credentialProperties.user && loginDTO.password == credentialProperties.pass) {
            true -> return "{ \"message\": \"Login Válido\", \"secret\": 42 }"
            false -> return "{ \"message\": \"Login Inválido\", \"secret\": null }"
        }

    }

}
