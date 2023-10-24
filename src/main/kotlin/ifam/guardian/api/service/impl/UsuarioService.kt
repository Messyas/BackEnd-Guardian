package ifam.guardian.api.service.impl

import ifam.guardian.api.entity.Usuario
import ifam.guardian.api.repository.UsuarioRepository
import ifam.guardian.api.service.IUsuarioService
import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private val usuarioRepository: UsuarioRepository
) : IUsuarioService {
    override fun save(usuario: Usuario): Usuario =
        this.usuarioRepository.save(usuario)


    override fun findById(id: Long): Usuario =
        this.usuarioRepository.findById(id).orElseThrow {
            throw RuntimeException("Id $id not found")
        }


    override fun delete(id: Long) =
        this.usuarioRepository.deleteById(id)

}