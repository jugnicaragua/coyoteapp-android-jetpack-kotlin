package ni.org.jug.coyoteapp.api

import ni.org.jug.coyoteapp.domain.entity.Bank
import ni.org.jug.coyoteapp.domain.entity.CentralBankExchangeRate
import retrofit2.Call
import retrofit2.http.GET

interface CoyoteAppService {

    @GET(Resource.Coyote.Bank.LIST_BANK)
    fun listBank(): Call<Bank>

    @GET(Resource.Coyote.CentralBank.LIST_CENTRAL_BANK_EXCHANGE_RATE)
    fun listCentralBankExchangeRate(): Call<CentralBankExchangeRate>

}
