package com.submission.githubusersearch.storage.persistence

import androidx.lifecycle.LiveData
import androidx.room.*

interface ListUserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(listUserEntity: ListUserEntity)

    @Update
    suspend fun update(listUserEntity: ListUserEntity)

    @Delete
    suspend fun delete(listUserEntity: ListUserEntity)

    @Query("SELECT * FROM tableUsername")
    fun select(): LiveData<List<ListUserEntity>>
}