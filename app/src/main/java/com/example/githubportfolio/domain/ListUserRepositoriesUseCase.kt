package com.example.githubportfolio.domain

import com.example.githubportfolio.core.UseCase
import com.example.githubportfolio.data.model.Repo
import com.example.githubportfolio.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}