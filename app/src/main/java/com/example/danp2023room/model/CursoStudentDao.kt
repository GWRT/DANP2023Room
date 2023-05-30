package com.example.danp2023room.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.danp2023room.entities.BookEntity
import com.example.danp2023room.entities.CursoEntity
import com.example.danp2023room.entities.CursoStudentCrossRef
import com.example.danp2023room.entities.CursosWithStudents

@Dao
interface CursoStudentDao {

    @Insert
    suspend fun insert(booksEntity: List<BookEntity>)
    
    @Transaction
    @Query("select * from curso")
    suspend fun getCursoStudents(): List<CursoStudentCrossRef>
}