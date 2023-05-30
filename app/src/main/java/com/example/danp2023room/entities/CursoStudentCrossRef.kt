package com.example.danp2023room.entities

import androidx.room.Entity

@Entity (primaryKeys = ["studentId", "cursoId"])
data class CursoStudentCrossRef (
    val studentId : Int,
    val cursoId : Int
    )
