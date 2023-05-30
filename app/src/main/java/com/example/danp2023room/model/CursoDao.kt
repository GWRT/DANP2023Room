package com.example.danp2023room.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.danp2023room.entities.CursoEntity
import com.example.danp2023room.entities.CursosWithStudents

@Dao
interface CursoDao {

    @Query("select * from curso")
    suspend fun getAll(): List<CursoEntity>

    @Transaction
    @Query("select * from curso")
    suspend fun getCursosWithStudents(): List<CursosWithStudents>

    @Insert
    suspend fun insert(cursoEntity: CursoEntity)

    @Insert
    suspend fun insert(cursoEntity: List<CursoEntity>)

    @Delete
    suspend fun delete(cursoEntity: CursoEntity)
}