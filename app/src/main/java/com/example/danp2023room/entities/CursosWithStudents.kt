package com.example.danp2023room.entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class CursosWithStudents (
    @Embedded val cursoEntity: CursoEntity,
    @Relation(
        parentColumn = "cursoId",
        entityColumn = "studentId",
        associateBy = Junction(
            CursoStudentCrossRef::class,
        )
    )
    val students : List<StudentEntity>
)