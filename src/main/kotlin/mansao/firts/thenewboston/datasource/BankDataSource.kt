package mansao.firts.thenewboston.datasource

import mansao.firts.thenewboston.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber: String): Bank

}