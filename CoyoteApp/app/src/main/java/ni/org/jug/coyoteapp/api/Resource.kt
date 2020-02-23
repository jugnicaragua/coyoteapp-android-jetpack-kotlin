package ni.org.jug.coyoteapp.api

import ni.org.jug.coyoteapp.BuildConfig

class Resource {

    val apiBaseUrl = BuildConfig.API_BASE_URL

    companion object Coyote {
        object Bank {
            const val LIST_BANK = "/api/banks"
        }

        object CentralBank {
            const val LIST_CENTRAL_BANK_EXCHANGE_RATE = "/api/centralBankExchangeRates"
        }
    }

}
