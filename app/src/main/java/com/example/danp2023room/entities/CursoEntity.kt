package com.example.danp2023room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "curso")
data class CursoEntity (
    @PrimaryKey val cursoId:Int,
    val name:String,
)