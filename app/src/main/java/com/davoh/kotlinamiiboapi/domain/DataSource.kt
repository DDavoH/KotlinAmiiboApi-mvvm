package com.davoh.kotlinamiiboapi.domain
import com.davoh.kotlinamiiboapi.database.model.Amiibo
import com.davoh.kotlinamiiboapi.database.model.AmiiboEntity
import com.davoh.kotlinamiiboapi.vo.Resource

interface DataSource {

    suspend fun getAllAmiibos(): Resource<List<Amiibo>>

    suspend fun getAmiiboByName(amiiboName:String): Resource<List<Amiibo>>

    suspend fun insertAmiiboIntoRoom(amiibo: AmiiboEntity)

    suspend fun getFavoritesAmiibos(): Resource<List<AmiiboEntity>>

    suspend fun deleteAmiibo(amiibo: AmiiboEntity)

}