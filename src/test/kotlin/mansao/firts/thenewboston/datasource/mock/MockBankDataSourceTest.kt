package mansao.firts.thenewboston.datasource.mock

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MockBankDataSourceTest {

    private val mockDatasource= MockBankDataSource()

    @Test
    fun getBanks() {


        val bank = mockDatasource.retrieveBanks()

        Assertions.assertThat(bank).isNotEmpty
    }

    @Test
    fun getMockBankData(){
        val bank  = mockDatasource.retrieveBanks()

        Assertions.assertThat(bank).allMatch { it.accountNumber.isNotBlank() }
        Assertions.assertThat(bank).anyMatch { it.trust != 0.0 }
        Assertions.assertThat(bank).anyMatch { it.transactionFee != 0 }
    }
}