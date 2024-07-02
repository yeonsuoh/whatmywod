package com.wmw.whatmywod.repository

import com.wmw.whatmywod.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}