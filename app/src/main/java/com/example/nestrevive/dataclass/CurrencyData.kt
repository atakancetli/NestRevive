package com.example.nestrevive.dataclass

data class CurrencyResponse(
    val data: Map<String, Double>  // API'nin döndüğü para birimi ve değer çiftleri
)