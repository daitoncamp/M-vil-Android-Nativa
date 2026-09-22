package com.example.catalogia

data class Libro(
    val id: Int,
    val categoria: String,
    val titulo: String,
    val autor: String,
    val extraInfo: String,
    val publicado: String,
    val genero: String,
    val resenas: String,
    val sinopsis: String,
    val iconType: String
)

object LibroRepository {
    val items = listOf(
        Libro(
            id = 1,
            categoria = "Libros",
            titulo = "Sapiens: De Animales a Dioses",
            autor = "Yuval Noah Harari",
            extraInfo = "4.5★",
            publicado = "2011",
            genero = "Historia / Antropología",
            resenas = "4.8★ (2,500 Reseñas)",
            sinopsis = "Un relato apasionante de la historia de nuestra especie, desde los primeros humanos hasta los avances radicales de las revoluciones cognitiva y científica.",
            iconType = "book"
        ),
        Libro(
            id = 2,
            categoria = "Automóviles",
            titulo = "Tesla Model S",
            autor = "Elon Musk / Tesla",
            extraInfo = "Precio: $80k ~ $120k",
            publicado = "2022",
            genero = "Tecnología / Motor",
            resenas = "4.9★ (1,800 Reseñas)",
            sinopsis = "El sedán eléctrico que cambió el mundo. Combina una aceleración increíble con una autonomía líder y una suite tecnológica sin precedentes en la industria automotriz.",
            iconType = "car"
        ),
        Libro(
            id = 3,
            categoria = "Automóviles",
            titulo = "Ford Mustang Mach-E",
            autor = "Ford Performance",
            extraInfo = "Precio: $45k ~ $65k",
            publicado = "2023",
            genero = "SUV Eléctrico",
            resenas = "4.6★ (950 Reseñas)",
            sinopsis = "La evolución de un ícono. Este SUV totalmente eléctrico une el alma del Mustang con la versatilidad de un vehículo moderno y eficiente.",
            iconType = "car"
        ),
        Libro(
            id = 4,
            categoria = "Meserios",
            titulo = "Manual de Besmetitaro",
            autor = "Dr. Alberto Ramos",
            extraInfo = "4.5★",
            publicado = "2019",
            genero = "Gestión / Procesos",
            resenas = "4.3★ (420 Reseñas)",
            sinopsis = "Una guía técnica exhaustiva sobre la optimización de procesos operativos en entornos industriales complejos y automatizados.",
            iconType = "menu"
        ),
        Libro(
            id = 5,
            categoria = "Libros",
            titulo = "Breves respuestas a las grandes preguntas",
            autor = "Stephen Hawking",
            extraInfo = "Ciencia",
            publicado = "2018",
            genero = "Cosmología / Física",
            resenas = "4.9★ (3,200 Reseñas)",
            sinopsis = "El testamento intelectual del científico más famoso de nuestra era, abordando los mayores misterios del universo en un lenguaje accesible.",
            iconType = "bookmark"
        ),
        Libro(
            id = 6,
            categoria = "Tecnología",
            titulo = "Teniaja Shicnon V2",
            autor = "Lara Croft Tech",
            extraInfo = "Edición Pro",
            publicado = "2024",
            genero = "Hardware / Gadgets",
            resenas = "4.7★ (150 Reseñas)",
            sinopsis = "Análisis profundo sobre la nueva arquitectura de procesadores móviles y cómo la inteligencia artificial está integrándose en el hardware doméstico.",
            iconType = "car"
        )
    )
}
