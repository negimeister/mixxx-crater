package download.leeklabs.mixxx_crater.controller

import download.leeklabs.mixxx_crater.service.TrackDataService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CraterController(private val trackDataService: TrackDataService) {

    @GetMapping("/hello")
    fun helloWorld(): String {
        return trackDataService.getAllTracks().take(100).map {
            it.filename
        }.reduce { acc, s -> "$acc\n$s" }
    }
}