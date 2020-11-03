package com.example.roomstudying.repository

import androidx.lifecycle.LiveData
import com.example.roomstudying.dao.WordDao
import com.example.roomstudying.entity.Word

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}