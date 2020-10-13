package com.davoh.kotlinamiiboapi.domain

import com.davoh.kotlinamiiboapi.database.model.Amiibo
import com.davoh.kotlinamiiboapi.database.model.AmiiboEntity
import com.davoh.kotlinamiiboapi.vo.Resource
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val dataSource: DataSource): Repository{
    override suspend fun getAllAmiibosList(): Resource<List<Amiibo>> {
        return dataSource.getAllAmiibos()
    }

    override suspend fun getAmiibosList(amiiboName: String): Resource<List<Amiibo>> {
        return dataSource.getAmiiboByName(amiiboName)
    }

    override suspend fun getFavoritesAmiibos(): Resource<List<AmiiboEntity>> {
        return dataSource.getFavoritesAmiibos()
    }

    override suspend fun insertAmiibo(amiibo: AmiiboEntity) {
        dataSource.insertAmiiboIntoRoom(amiibo)
    }

    override suspend fun deleteAmiibo(amiibo: AmiiboEntity) {
        dataSource.deleteAmiibo(amiibo)
    }

}