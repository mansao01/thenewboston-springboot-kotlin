package mansao.firts.thenewboston

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello") // coba run http://localhost:8080/api/hello
class HelloWorldController {

    @GetMapping
    fun helloWorld(): String {
        return "This is a REST endpoint!"
    }
}