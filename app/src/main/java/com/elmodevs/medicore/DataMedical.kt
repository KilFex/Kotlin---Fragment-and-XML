package com.elmodevs.medicore

data class DataMedical(
    val profession: String, //grado de profesion que esta el doc.
    val name: String, // nombre del doc
    val specialty: String, // especialidad del coc
    val rating: Double, // valoracion en estrellas
    val photo: String, // url de la foto del doc
    val isFavorite: Boolean //estado del icono del corazon)
)
