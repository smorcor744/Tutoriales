
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.application
import androidx.compose.ui.window.singleWindowApplication

fun main() = application {
    val icon = painterResource("sample.png")
    singleWindowApplication(icon = icon) {
        TutorialClick03()
    }
}