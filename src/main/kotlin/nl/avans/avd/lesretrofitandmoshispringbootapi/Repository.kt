package nl.avans.avd.lesretrofitandmoshispringbootapi

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface Repository : JpaRepository<TodoItem, Int> {
    fun findAllByUserId(userId: Int): List<TodoItem>
}