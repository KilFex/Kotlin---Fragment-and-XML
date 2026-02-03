package com.elmodevs.medicore


class MedicalProvider {
    companion object{
        val dataMedicalInfo = listOf<DataMedical>(
            DataMedical(
                "Estomatologo",
                "Dr. Olivia Turner, M.D.",
                "Dermato-Endocrinology",
                4.1,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJz1wU4BJSy-ioRd_TvWFF7JLN3omSXjp19A&s",
                true
            ),
            DataMedical(
                "Oculista",
                "Dr. Alexander Bennet, Ph.D.",
                "Dermato-Genetics",
                3.3,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJz1wU4BJSy-ioRd_TvWFF7JLN3omSXjp19A&s",
                false
            ),
            DataMedical(
                "Cardeologo",
                "Dr. Sophia Martinez, Ph.D.",
                "Cosmetic Bioengineering",
                5.0,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJz1wU4BJSy-ioRd_TvWFF7JLN3omSXjp19A&s",
                true
            ),
            DataMedical(
                "Huesero",
                "Dr. Michael Davidson, M.D.",
                "Solar Dermatology",
                4.9,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJz1wU4BJSy-ioRd_TvWFF7JLN3omSXjp19A&s",
                true
            ),
        )
    }
}