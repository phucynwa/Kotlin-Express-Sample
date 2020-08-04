external fun require(module: String): dynamic

fun main() {
    val express = require("express")
    val app = express()
    val port = 3000
    app.get("/") { _, res ->
        res.type("text/plain")
        res.send("Hello world")
    }

    app.listen(port) {
        console.log("Example app listening at http://localhost:$port")
    }
}