package ifam.guardian.api.dto

import ifam.guardian.api.entity.Usuario
import java.beans.Customizer

data class UsuarioView(
     val primeiroNome: String,
     val ultimoNome: String,
     val cpf: String,
     val email: String,
 ) {
   constructor(usuario: Usuario): this (
       primeiroNome = usuario.primeiroNome,
       ultimoNome = usuario.ultimoNome,
       cpf = usuario.cpf,
       email = usuario.email
   )


}
