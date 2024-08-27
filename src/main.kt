import korlibs.image.color.*
import korlibs.korge.*
import korlibs.korge.scene.*
import korlibs.math.geom.*
import snake.scene.*

suspend fun main() = Korge(windowSize = Size(512, 512), backgroundColor = Colors["#2b2b2b"]) {
    sceneContainer().changeTo { IngameScene() }
}
