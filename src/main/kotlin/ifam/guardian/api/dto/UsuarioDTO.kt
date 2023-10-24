package ifam.guardian.api.dto

import ifam.guardian.api.entity.Usuario

data class UsuarioDTO(
    val primeiroNome: String,
    val ultimoNome: String,
    val cpf: String,
    val email: String,
    val senha: String,
) {

    fun toEntity(): Usuario = Usuario(
        primeiroNome = this.primeiroNome,
        ultimoNome = this.ultimoNome,
        cpf = this.cpf,
        email = this.email,
        senha = this.senha
    )
}
