package ni.org.jug.coyoteapp.domain.entity

import java.time.LocalDate

data class CentralBankExchangeRate(var currency: Currency, var date: LocalDate, var amount: Double)
