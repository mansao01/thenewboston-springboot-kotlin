package mansao.firts.thenewboston.datasource.mock

import mansao.firts.thenewboston.datasource.BankDataSource
import mansao.firts.thenewboston.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("122", 0.1, 1),
        Bank("1", 0.1, 1),
        Bank("1", 0.1, 1),
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank {
        return banks.firstOrNull() {
            it.accountNumber == accountNumber
        } ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
    }
}