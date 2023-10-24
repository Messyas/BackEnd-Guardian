package ifam.guardian.api.service

import ifam.guardian.api.entity.Usuario

interface IUsuarioService {

    fun save(usuario: Usuario): Usuario

    fun findById(id:Long): Usuario

    fun delete(id: Long)

}