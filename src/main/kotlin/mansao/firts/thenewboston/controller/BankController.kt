package mansao.firts.thenewboston.controller

import mansao.firts.thenewboston.model.Bank
import mansao.firts.thenewboston.service.BankService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService){


    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(e: NoSuchElementException): ResponseEntity<String>{
        return  ResponseEntity(e.message, HttpStatus.NOT_FOUND)

    }
    @GetMapping
    fun getBanks(): Collection<Bank>{
        return service.getBanks()
    }

    @GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String): Bank {
        return service.getBank(accountNumber)
    }
}