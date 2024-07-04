package download.leeklabs.mixxx_crater.service

import download.leeklabs.mixxx_crater.model.TrackLocation
import download.leeklabs.mixxx_crater.repository.TrackLocationRepository
import org.springframework.stereotype.Service

@Service
class TrackDataService(private val locationRepository: TrackLocationRepository) {
    fun getAllTracks(): MutableList<TrackLocation> {
        return locationRepository.findAll()
    }
}