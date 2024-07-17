import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RocketLaunch (
    @SerialName("flight_number") // @serialName allows you to change the name of the property
    val fightNumber: Int,
    @SerialName("name")
    val missionName: String,
    @SerialName("date_utc")
    val launchDateUTC: String,
    @SerialName("success")
    val launchSuccess: Boolean?,

)