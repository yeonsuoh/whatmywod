package com.wmw.whatmywod.domain

import jakarta.persistence.*

@Entity
@Table(name = "pr")
class PR(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wod_id", nullable = false)
    val wod: Wod,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,
) : BaseEntity()