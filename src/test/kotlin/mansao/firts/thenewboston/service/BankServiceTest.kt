package mansao.firts.thenewboston.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import mansao.firts.thenewboston.datasource.BankDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val datasource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(datasource)

    @Test
    fun getDataSource() {


        val banks = bankService.getBanks()

        verify(exactly = 1) {
            datasource.retrieveBanks()
        }
    }
}