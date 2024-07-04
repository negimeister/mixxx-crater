package download.leeklabs.mixxx_crater.repository

import download.leeklabs.mixxx_crater.model.TrackLocation
import org.springframework.data.jpa.repository.JpaRepository

interface TrackLocationRepository: JpaRepository<TrackLocation, Long> {
}


