package ifam.guardian.api.controller

import ifam.guardian.api.dto.UsuarioDTO
import ifam.guardian.api.dto.UsuarioUpdateDto
import ifam.guardian.api.dto.UsuarioView
import ifam.guardian.api.entity.Usuario
import ifam.guardian.api.service.impl.UsuarioService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/usuarios")
class UsuarioResource(
    private val usuarioService: UsuarioService
) {

    @PostMapping
    fun saveUsuario(@RequestBody usuarioDto: UsuarioDTO): String {
        val savedUsuario = this.usuarioService.save(usuarioDto.toEntity())
        return "Usuario ${savedUsuario.email} salvo!"
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): UsuarioView {
        val usuario: Usuario = this.usuarioService.findById(id)
        return UsuarioView(usuario)
    }
    @DeleteMapping("/{id}")
    fun deleteUsuario(@PathVariable id: Long) =
        this.usuarioService.delete(id)

    @PatchMapping
    fun upadateCustomer(@RequestParam(value = "usuarioId") id: Long,
                        @RequestBody usuarioUpdateDto: UsuarioUpdateDto): UsuarioView {
        val usuario: Usuario = this.usuarioService.findById(id)
        val usuarioToUpdate:Usuario = usuarioUpdateDto.toEntity(usuario)
        val usuarioUpdated: Usuario = this.usuarioService.save(usuarioToUpdate)
        return UsuarioView(usuarioUpdated)

    }
}
// contem os endPoints
