package com.wmw.whatmywod.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "wod")
class Wod(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id", nullable = false)
    val workout: Workout,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @Column(nullable = false)
    val date: LocalDateTime,

    val weight: Long? = null,

    val times: Long? = null,

    val description: String? = null,
) : BaseEntity()