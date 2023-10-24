package ifam.guardian.api.dto

import ifam.guardian.api.entity.Usuario

data class UsuarioUpdateDto(
    val primeiroNome: String,
    val ultimoNome: String,
) {
    fun toEntity(usuario: Usuario) : Usuario {
        usuario.primeiroNome = this.primeiroNome
        usuario.ultimoNome = this.ultimoNome
        return usuario
    }

}
