external fun require(module: String): dynamic

fun main() {
    val express = require("express")
    val app = express()

    app.get("/") { _, res ->
        res.type("text/plain")
        res.send("Hello world / 22222")
    }

    app.listen(PORT_NUMBER) {
        console.log("Example app listening at http://localhost:$PORT_NUMBER")
    }
}