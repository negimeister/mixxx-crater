package download.leeklabs.mixxx_crater.model

import jakarta.persistence.*

@Entity
@Table(name = "track_locations")
data class TrackLocation(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    @Column(unique = true)
    val location: String = "",
    val filename: String = "",
    val directory: String = "",
    val filesize: Int = 0,
    val fs_deleted: Int = 0,
    val needs_verification: Int = 0
)