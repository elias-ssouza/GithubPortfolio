package com.example.githubportfolio.data.repositories

import com.example.githubportfolio.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}