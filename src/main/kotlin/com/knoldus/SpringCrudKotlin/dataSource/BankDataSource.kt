package com.knoldus.SpringCrudKotlin.dataSource

import com.knoldus.SpringCrudKotlin.model.Bank


interface BankDataSource {

    fun getBanks(): Collection<Bank>

    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber: String): Bank

    fun createBank(bank: Bank): Bank

    fun updateBank(bank: Bank): Bank

    fun deleteBank(accountNumber: String)
}