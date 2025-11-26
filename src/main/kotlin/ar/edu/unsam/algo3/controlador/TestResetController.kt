package ar.edu.unsam.algo3.controlador

import ar.edu.unsam.algo3.bootstrap.ApplicationBootstrap
import org.springframework.context.annotation.Profile
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// Controller para resetear el Bootstrap -> PELIGROSO!!
@RestController
@RequestMapping("/test")
// @Profile("test") // solo se habilita con el profile test !!
class TestResetController(
    private val bootstrap: ApplicationBootstrap
) {

    @PostMapping("/reset")
    fun reset(): ResponseEntity<Void> {
        bootstrap.resetAll()
        return ResponseEntity.noContent().build()
    }
}