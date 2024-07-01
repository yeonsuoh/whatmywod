package com.wmw.whatmywod.domain

import jakarta.persistence.*

@Entity
@Table(name = "workout")
class Workout(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val name: String,
) : BaseEntity()