package com.guided.data_binding_10929

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

object FakeRepository {
    private val fruitNames: List<String> = listOf(
        "apel","mangga","stroberi","nenas","jambu",
        "berry","kiwi","pir","pisang","anggur","bambu"
    )
    private val _currentRandomFruitName= MutableLiveData<String>()
    val currentRandomFruitName : LiveData<String>
    get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value = fruitNames.first()
    }
    fun getRandomfruitName( ): String{
        val random = Random.nextInt(fruitNames.size)
        return fruitNames[random]
    }
    fun changeCurrentRandomFruitName() {
        _currentRandomFruitName.value = getRandomfruitName()
    }
}