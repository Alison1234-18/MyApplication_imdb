package com.example.myapplication_imdb

class SuperHeroProvider {
    companion object {
        val superHeroList: List<SuperHeroe> = listOf<SuperHeroe>(
            SuperHeroe(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Spider-Man.jpg/1024px-Spider-Man.jpg"
            ),
            SuperHeroe(
                "Batman",
                "DC Comics",
                "Bruce Wayne",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/The_Dark_Knight_Batman.jpg/800px-The_Dark_Knight_Batman.jpg"
            ),
            SuperHeroe(
                "Wonder Woman",
                "DC Comics",
                "Diana Prince",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Lynda_Carter_Wonder_Woman.JPG/800px-Lynda_Carter_Wonder_Woman.JPG"
            ),
            SuperHeroe(
                "Iro man",
                "Marvel",
                "Tony Stark",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Iron_Man_Repulsors_%2814041559344%29.jpg/800px-Iron_Man_Repulsors_%2814041559344%29.jpg"
            )
        )

    }
}