package snake.scene

import korlibs.image.tiles.*
import snake.model.*
import kotlin.test.*

class SimpleTileProviderTest {
    @Test
    fun test() {
        println(WallProvider.get(SimpleTileSpec(right = true)).toStringInfo())
        println(WallProvider.get(SimpleTileSpec(left = true)).toStringInfo())
        println(WallProvider.get(SimpleTileSpec(up = true)).toStringInfo())
        println(WallProvider.get(SimpleTileSpec(down = true)).toStringInfo())
    }
}
