package com.example.danp2023room.model

import com.example.danp2023room.entities.BookEntity
import com.example.danp2023room.entities.CursoEntity
import com.example.danp2023room.entities.CursosWithStudents
import com.example.danp2023room.entities.StudentEntity
import com.example.danp2023room.entities.StudentWithBooks

class Repository(private val appDatabase: AppDatabase) {

    suspend fun getAllStudents(): List<StudentEntity> {
        return appDatabase.studentDao().getAll()
    }

    suspend fun getStudentWithBooks(): List<StudentWithBooks> {
        return appDatabase.studentDao().getStudentWithBooks()
    }

    suspend fun insertStudents(studentsEntity: List<StudentEntity>) {
        appDatabase.studentDao().insert(studentsEntity)
    }

    suspend fun insertBooks(books: List<BookEntity>) {
        appDatabase.bookDao().insert(books)
    }

    suspend fun insertBook(book: BookEntity) {
        appDatabase.bookDao().insert(book)
    }

    suspend fun getAllBooks(): List<BookEntity> {
        return appDatabase.bookDao().getAll()
    }

    suspend fun insertCurso(curso: CursoEntity){
        appDatabase.cursoDao().insert(curso)
    }
    suspend fun insertCursos(cursos: List<CursoEntity>){
        appDatabase.cursoDao().insert(cursos)
    }

    suspend fun getAllCursos(): List<CursoEntity> {
        return appDatabase.cursoDao().getAll()
    }

    suspend fun getCursosWithStudents(): List<CursosWithStudents> {
        return appDatabase.cursoDao().getCursosWithStudents()
    }
}