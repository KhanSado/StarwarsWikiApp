package io.github.bersoncrios.starwarsfans.repository

import io.github.bersoncrios.starwarsfans.db.PersonDataBase
import io.github.bersoncrios.starwarsfans.network.SWService
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class PersonRepositoryTest {

    private lateinit var personRepository: PersonRepository
    private val swService = mockk<SWService>()
    private val personDatabase = mockk<PersonDataBase>()

    @Before
    fun setUp() {
        personRepository = PersonRepository(swService, personDatabase)
    }

    @Test
    suspend fun getPersons() {
        personRepository.getPersons()
    }
}