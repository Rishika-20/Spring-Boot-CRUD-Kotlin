package com.knoldus.SpringCrudKotlin.model
// DATA LAYER.


 //data class Bank(var accountNumber: String,  var trust: Double,  var transactionAmount: Int) {

//
//    // In case of kotlin we don't need to write the getters and setters and the equals adn hashcode methods as well as toString() methods.
//
//    /**
//     * Getters
//     * **/
//
//    fun getAccountNumber():String = accountNumber
//    fun getTrust():Double = trust
//    fun getTransactionAmounnt():Int = transactionAmount
//
//    /**
//     * Setters
//     * **/
//
//    fun setAccountNumber(accountNumber: String){
//        this.accountNumber = accountNumber
//    }
//    fun setTrust(trust: Double){
//        this.trust = trust
//    }
//    fun setTransactionAmount(transactionAmount: Int){
//        this.transactionAmount = transactionAmount
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Bank
//
//        if (accountNumber != other.accountNumber) return false
//        if (trust != other.trust) return false
//        return transactionAmount == other.transactionAmount
//    }
//
//    override fun hashCode(): Int {
//        var result = accountNumber.hashCode()
//        result = 31 * result + trust.hashCode()
//        result = 31 * result + transactionAmount
//        return result
//    }

//}

import com.fasterxml.jackson.annotation.JsonProperty

data class Bank(
 @JsonProperty("account_number")
 val accountNumber: String,

 @JsonProperty("trust")
 val trust: Double,

 @JsonProperty("default_transaction_fee")
 val transactionFee: Int
)